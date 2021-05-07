import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSuccess } from 'types/sale';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/requests';

type SeriesData = {
  name: string;
  data: Array<number>;
};

type ChartData = {
  labels: { categories: Array<string> };
  series: Array<SeriesData>;
};

function BarChart() {
  const [charData, setChartData] = useState<ChartData>({
    labels: { categories: [] },
    series: [],
  });

  useEffect(() => {
    try {
      (async () => {
        const res = await axios.get(`${BASE_URL}/sales/success-by-salesman`);
        const data = res.data as Array<SaleSuccess>;

        setChartData({
          labels: {
            categories: data.map((salesSuccess) => salesSuccess.salesman),
          },
          series: [
            {
              name: '% Success',
              data: data.map((salesSuccess) =>
                round(
                  (100 * salesSuccess.deals) / salesSuccess.visitedCustomers,
                  1
                )
              ),
            },
          ],
        });
      })();
    } catch (err) {
      console.error(err);
    }
  }, []);

  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  return (
    <Chart
      options={{ ...options, xaxis: charData.labels }}
      series={charData.series}
      type="bar"
      height="250"
    />
  );
}

export default BarChart;

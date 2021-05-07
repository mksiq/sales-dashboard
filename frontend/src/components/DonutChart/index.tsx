import Chart from 'react-apexcharts';
import axios from 'axios';
import { BASE_URL } from 'utils/requests';
import { SaleSum } from 'types/sale';
import { useState } from 'react';
import { useEffect } from 'react';

type ChartData = {
  labels: Array<string>;
  series: Array<number>;
};

function DonutChart() {
  const [chartData, setChartData] = useState<ChartData>({
    labels: [],
    series: [],
  });

  useEffect(() => {
    try {
      (async () => {
        const res = await axios.get(`${BASE_URL}/sales/total-by-salesman`);
        const data = res.data as Array<SaleSum>;
        setChartData({
          labels: data.map((saleSum) => saleSum.salesman),
          series: data.map((saleSum) => saleSum.value),
        });
      })();
    } catch (err) {
      console.error(err);
    }
  }, []);

  const options = {
    legend: {
      show: true,
    },
  };

  return (
    <div>
      <Chart
        options={{ ...options, labels: chartData.labels }}
        series={chartData.series}
        type="donut"
        height="250"
      />
    </div>
  );
}

export default DonutChart;

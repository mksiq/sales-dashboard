import Chart from 'react-apexcharts';

function BarChart() {
  const options = {
    plotOptions: {
      bar: {
        horizontal: true,
      },
    },
  };

  const mockData = {
    labels: {
      categories: ['Nero', 'Julius Caesar', 'Gaius', 'Augustus', 'Constantine'],
    },
    series: [
      {
        name: '% Success',
        data: [63.1, 28.0, 34.7, 55.6, 24.1],
      },
    ],
  };

  return (
    <Chart
      options={{ ...options, xaxis: mockData.labels }}
      series={mockData.series}
      type="bar"
      height="250"
    />
  );
}

export default BarChart;

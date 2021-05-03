import Chart from 'react-apexcharts';

function BarChart() {
  const mockData = {
    series: [80841, 45031, 42047, 95010, 35400],
    labels:  ['Nero', 'Julius Caesar', 'Gaius', 'Augustus', 'Constantine'],
  }

  const options = {
    legend: {
      show: true
    }
  };

  return (
    <div>
      <Chart
        options={{ ...options, labels: mockData.labels }}
        series={mockData.series}
        type="donut"
        height="250"
      />
    </div>
  );
}

export default BarChart;

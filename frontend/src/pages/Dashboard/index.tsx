import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';
import BarChart from 'components/BarChart';
import DonutChart from 'components/DonutChart';

function Dashboard() {
  return (
    <div>
      <>
        <div className="App">
          <NavBar />
          <div className="container">
            <h1 className="text-primary py-2">Sales Dashboard</h1>
            <div className="row px-2">
              <div className="col-sm-12 col-md-6 ">
                <div className="h4 text-secondary text-center">
                  Success rate
                </div>
                <BarChart />
              </div>
              <div className="col-sm-12 col-md-6 ">
                <div className="h4 text-secondary text-center">All sales</div>
                <DonutChart />
              </div>
            </div>
            <div className="py-3">
              <h2 className="text-Primary">All Sales</h2>
              <DataTable />
            </div>
          </div>
        </div>
        <Footer />
      </>
    </div>
  );
}

export default Dashboard;

import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable'


function App() {
  return (
    <>
      <div className="App">
        <NavBar />
        <div className="container">
          <h1>Sales Dashboard</h1>
          <DataTable />
        </div>
      
      </div>
      <Footer />
    </>
  );
}

export default App;

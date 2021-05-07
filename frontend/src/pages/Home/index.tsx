import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import { Link } from 'react-router-dom';
function Home() {
  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">SalesDS</h1>
          <p className="lead">Check the performance of your sales.</p>
          <hr />
          <p>
            This app displays a dashboard with data supplied by a Spring Boot
            server.
          </p>
          <Link className="btn btn-primary btn-lg" to="/dashboard">
            Access Dashboard
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Home;

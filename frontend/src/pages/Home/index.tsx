import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import { Link } from 'react-router-dom';
import { BASE_URL } from 'utils/requests';
import axios from 'axios';
function Home() {
  (async () => {
    // Just to wake up the API before hand so the user doesn't need to wait as much
    const res = await axios.get(`${BASE_URL}/sales?page=1&size=1&sort=date,desc`);
  })();

  return (
    <>
      <NavBar />
      <div className="container">
        <div className="jumbotron">
          <h1 className="display-4">SalesDS</h1>
          <p className="lead">Check the performance of your sales.</p>
          <hr />
          <p>This app displays a dashboard with data supplied by a Spring Boot server.</p>
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

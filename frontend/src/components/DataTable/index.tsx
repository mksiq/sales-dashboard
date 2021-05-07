import axios from 'axios';
import Pagination from 'components/pagination';
import { useEffect } from 'react';
import { useState } from 'react';
import { SalePage } from 'types/sale';
import { formatLocalDate } from 'utils/format';
import { BASE_URL } from 'utils/requests';

function DataTable() {
  const [currentPage, setCurrentPage] = useState(0);
  const [page, setPage] = useState<SalePage>({
    content: [],
    last: false,
    totalElements: 0,
    size: 0,
    number: 0,
    first: true,
    totalPages: 0,
    numberOfElements: 0,
    empty: true,
  });

  const changePage = (pageNumber: number) => {
    setCurrentPage(pageNumber);
  };

  useEffect(() => {
    (async () => {
      const res = await axios.get(
        `${BASE_URL}/sales?page=${currentPage}&size=20&sort=date,desc`
      );
      setPage(res.data);
    })();
  }, [currentPage]);

  return (
    <>
      <Pagination page={page} onPageChange={changePage} />
      <div className="table-responsive">
        <table className="table table-striped table-sm">
          <thead>
            <tr>
              <th>Date</th>
              <th>Salesman</th>
              <th>Contacted customers</th>
              <th>Number of Sales</th>
              <th>Value</th>
            </tr>
          </thead>
          <tbody>
            {page.content?.map((sale) => (
              <tr key={sale.id}>
                <td>{formatLocalDate(sale.date, 'MM/dd/yyyy')}</td>
                <td>{sale.salesman.name}</td>
                <td>{sale.visitedCustomers}</td>
                <td>{sale.deals}</td>
                <td>{sale.amount.toFixed(2)}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}

export default DataTable;

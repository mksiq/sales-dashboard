function DataTable() {
  return (
    <div className="table-responsive">
        <table className="table table-striped table-sm">
            <thead>
                <tr>
                    <th>Date</th>
                    <th>Salesman</th>
                    <th>Contacted customers</th>
                    <th>Sales</th>
                    <th>Value</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>03/05/2021</td>
                    <td>Mike</td>
                    <td>60</td>
                    <td>18</td>
                    <td>9,058.00</td>
                </tr>
                <tr>
                    <td>04/05/2021</td>
                    <td>Mike</td>
                    <td>60</td>
                    <td>35</td>
                    <td>1,058.00</td>
                </tr>
                <tr>
                    <td>05/05/2021</td>
                    <td>Mike</td>
                    <td>25</td>
                    <td>18</td>
                    <td>2,058.00</td>
                </tr>
            </tbody>
        </table>
    </div>
  );
}

export default DataTable;
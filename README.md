# Sales Dashboard

Project to manage sales

## Backend

Project created with [Spring](https://spring.io/) to serve as an API. For database it will use [PostgreSQL](PostgreSQL)


### Routes available

#### Salesman

>/salesmen)

Get all salesmen. Returned object:

```json
 [
    { "id": 12, "name": "Marcus Aurelius" }, ...
 ]
```

#### Sales

>/sales)

Get all sales. Returned object:

```json
[
  {
    "id": 1,
    "visitedCustomers": 114,
    "deals": 71,
    "amount": 22274.0,
    "date": "2021-03-15",
    "salesman": {
      "id": 5,
      "name": "Julius Caesar"
    }
  }, ...
 ]
```


>/sales)

Get a pageable of sales. Returned object for /sales?page=2&size=15&sort=date,desc:

```json
[
  {
    "id": 1,
    "visitedCustomers": 114,
    "deals": 71,
    "amount": 22274.0,
    "date": "2021-03-15",
    "salesman": {
      "id": 5,
      "name": "Julius Caesar"
    }
  }, ...
 ]
```

>/sales/total-by-salesman)

Get the total of sales amount by salesman. Returned object:

```json
[
  {
    "salesman": "Constantine",
    "value": 220426.0
  }, ...
 ]
```

>/sales/success-by-salesman

Get the total of visited customers and deals close amount by salesman. Returned object:

```json
[
  {
    "salesman": "Augustus",
    "deals": 1028,
    "visitedCustomers": 2396
  }, ...
 ]
```


### To run
Run both sql scripts located on resources
Build program with maven

### Access H2 DB for testing database

> access: http://localhost:8080/h2-console \
> change url to: jdbc:h2:mem:testdb

## Frontend

Project created with [React](https://github.com/facebook/create-react-app), [Bootstrap](https://getbootstrap.com/) and [ApexCharts](https://apexcharts.com/).

### Running on

[Website](mcksiq-sales-dashboard.netlify.app)

### Available Scripts

In the project directory, you can run:

> `yarn start`

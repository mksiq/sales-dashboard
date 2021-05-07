import { Salesman } from './salesman';

export type Sale = {
  id: number;
  visitedCustomers: number;
  deals: number;
  amount: number;
  date: string;
  salesman: Salesman;
};

export type SaleSum = {
  salesman: string;
  value: number;
};

export type SaleSuccess = {
  salesman: string;
  visitedCustomers: number;
  deals: number;
};

export type SalePage = {
  content: Array<Sale>;
  last: boolean;
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
  first: boolean;
  numberOfElements: number;
  empty: true;
};

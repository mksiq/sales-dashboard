create table tb_sale (id int8 generated by default as identity, amount float8, date date, deals int4, visited_customers int4, salesman_id int8, primary key (id));
create table tb_salesman (id int8 generated by default as identity, name varchar(255), primary key (id));
alter table if exists tb_sale add constraint FKlanm3slv7xevjgr6bsxhkmkga foreign key (salesman_id) references tb_salesman;
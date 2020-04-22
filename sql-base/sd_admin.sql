
drop table if exists `t_products`;
create table `t_products`(
  id BIGINT PRIMARY KEY ,
  name varchar(100),
  price BIGINT ,
  sale_price BIGINT,
  sale_point varchar(255),
  image_url varchar(255) ,
  stock BIGINT ,
  flag int ,
  create_time varchar(36),
  update_time varchar(36),
  create_user BIGINT,
  update_user BIGINT
);

drop table if exists `t_products_type`;
create table `t_products_type`(
  id BIGINT PRIMARY KEY ,
  pid BIGINT,
  name varchar(50)
);

drop table if exists `t_products_desc`;
create table `t_products_desc` (
    id BIGINT PRIMARY KEY ,
    p_desc text,
    products_id BIGINT
);


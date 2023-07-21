CREATE TABLE product(
id_product SERIAL primary key,
product varchar (100) NOT NULL
);

CREATE TABLE sale(
id_sale SERIAL primary key ,
product varchar(100) NOT NULL, 
code char(50) NOT NULL,
price char(50) NOT NULL,
id_product_sale integer ,
foreign key (id_product_sale) references product(id_product) 	
);

INSERT INTO product (product) values ('mouse');
INSERT INTO product (product) values ('keyboard');
INSERT INTO product (product) values ('HD');
INSERT INTO sale (product , code , price ) values ('mouse', '2020', '2.00');
INSERT INTO sale (product , code , price ) values ('keyboard', '2022', '12.00');
INSERT INTO sale (product , code , price ) values ('HD', '2023', '22.00');
 
SELECT * FROM product;
SELECT * FROM sale;
SELECT product from sale;

UPDATE product set product = 'notebook' where id_product=3;
DELETE FROM sale where id_sale = 2;
ALTER TABLE sale add client varchar(50);

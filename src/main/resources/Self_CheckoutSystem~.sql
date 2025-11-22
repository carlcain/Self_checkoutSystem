--important set up for function and Procedure 
SET SERVEROUTPUT ON;

-- Drop 
REVOKE CREATE SESSION FROM OwnerCheckoutSys;
drop user OwnerCheckoutSys cascade;

Drop table Items cascade constraints;
Drop table userInfo cascade constraints;
Drop table Transaction_form cascade constraints;
Drop table Transport cascade constraints;

-- Create User 
create user OwnerCheckoutSys identified by Changeme0;

alter user OwnerCheckoutSys  quota unlimited on USERS;

GRANT CREATE PROCEDURE TO OwnerCheckoutSys ;

GRANT CREATE VIEW TO OwnerCheckoutSys ;

grant create session to OwnerCheckoutSys  with admin option;

GRANT CREATE TABLE TO OwnerCheckoutSys;

grant connect to OwnerCheckoutSys;

alter session set current_schema = OwnerCheckoutSys;

create table Items(
   item_id VARCHAR(10) primary key,
   item_desc VARCHAR(50),
   unit_price VARCHAR(50)
);

create table userInfo(
   costumer VARCHAR(50) primary key,
   contact_number VARCHAR(50),
   address VARCHAR(50)
);

create table Transaction_form(
   trans_num number primary key,
   trans_date VARCHAR(50)
);

create table Transport(
   item_id VARCHAR(10),
   costumer VARCHAR(50),
   trans_num number,
   quantity number,
   
   FOREIGN KEY (item_id) REFERENCES Items(item_id),
   FOREIGN KEY (costumer) REFERENCES userInfo(costumer),
    FOREIGN KEY (trans_num) REFERENCES Transaction_form(trans_num)
);

--value 
INSERT INTO Items VALUES('01', 'Coocoo cola', '50.00' );
INSERT INTO Items VALUES('02', 'Gardenya', '25.00' );
INSERT INTO Items VALUES('03', 'Stick U', '60.00' );

INSERT INTO userInfo VALUES('dela Cruz', '09191112223', 'Tagaytay');
INSERT INTO userInfo VALUES('A.Kechum', '09991119219', 'Silang');
INSERT INTO userInfo VALUES('G.Viscon', Null, 'Alfonso');

INSERT INTO Transaction_form VALUES(1, '04-11-2024');
INSERT INTO Transaction_form VALUES(2, '04-11-2024');
INSERT INTO Transaction_form VALUES(3, '04-12-2024');
INSERT INTO Transaction_form VALUES(4, '04-12-2024');

-- trans num, quantity
INSERT INTO Transport VALUES('01', 'dela Cruz', 1, 1);
INSERT INTO Transport VALUES('02', 'dela Cruz', 1, 2);
INSERT INTO Transport VALUES('01', 'A.Kechum', 2, 2);
INSERT INTO Transport VALUES('02', 'G.Viscon', 3, 1);
INSERT INTO Transport VALUES('03', 'dela Cruz', 4, 1);

-- save
commit;

select * from Items;
select * from userInfo;
select * from transport;


select costumer from userInfo;







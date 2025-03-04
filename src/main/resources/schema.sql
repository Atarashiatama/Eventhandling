 Create table tbusers ( id Bigint auto_increment primary key,name varchar(255)not null,email varchar(255),password varchar(255));
 
  Create table tbevents (id Bigint auto_increment primary key,title varchar(255)not null,description varchar text,startdttime Timestamp not null ,enddttime Timestamp not null,location varchar(255),categoryid Bigint,foreign key 
  (categoryid) references tbusers(id));
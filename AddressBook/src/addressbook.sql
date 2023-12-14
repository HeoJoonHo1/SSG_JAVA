
create table addressbook(
	seq int auto_increment primary key,
	name varchar(30) not null,
	age decimal(3),
	phone varchar(30),
	address varchar(100),
	memo varchar(1000)
);

select * from addressbook;
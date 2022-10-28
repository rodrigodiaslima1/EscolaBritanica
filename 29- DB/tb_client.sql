
drop table tb_client;

create table tb_client(

	id 		bigint primary key,
	code	varchar(10),
	name	varchar(50)
	
)

create sequence sq_tb_client
start 1 increment 1
owned by tb_client.id;

alter table tb_client
alter column code
type varchar(50);


select * from tb_client;

delete from tb_client
where code = '909';

delete from tb_client;
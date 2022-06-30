use devm211;

create table pessoa(
	idPessoa int primary key auto_increment,
    nomePessoa varchar(60) not null,
    cpf varchar(11) unique,
    endereco varchar(60),
    telefone varchar(20),
    idade int,
    status boolean
	);
    
create table carro(
	idCarro int primary key auto_increment,
    placa varchar(8) unique not null,
    marca varchar(20),
    modelo varchar(30),
    anoFabricacao int,
    anoModelo int,
    cor varchar(20),
    nPortas int,
    idPessoa int,
    foreign key (idPessoa) references pessoa(idPessoa)
	);
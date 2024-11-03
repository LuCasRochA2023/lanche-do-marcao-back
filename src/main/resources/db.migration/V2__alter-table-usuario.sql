
create  table usuario  (
    id int primary key,
    nome varchar(150) not null,
    email varchar(150) not null,
    senha varchar(100) not null,
    cep varchar(9) not null,
    rua varchar(100) not null,
    numero varchar(15) not null,
    bairro varchar(30) not null,
    complemento varchar(100)



    )
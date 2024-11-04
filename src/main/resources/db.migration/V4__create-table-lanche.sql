create table lanche(
    id long SERIAL primary key,
    nome varchar(150) not null,
    descricao TEXT not null,
    preco decimal not null,
    imagem BLOB
)
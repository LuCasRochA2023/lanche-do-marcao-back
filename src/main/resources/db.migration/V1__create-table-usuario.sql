/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  guilh
 * Created: 2 de nov. de 2024
 */

crate table usuario(
    id int primary key,
    nome varchar(150) not null,
    email varchar(150) not null,
    senha varcahr(100) not null,
    complemento varchar(100),
    rua varchar(100) not null,
    numero varchar(15) not null,
    cep varchar(9) not 
    )
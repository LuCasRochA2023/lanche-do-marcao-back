ALTER TABLE usuario ADD COLUMN novo_id SERIAL;

-- 2. (Opcional) Copiar dados da coluna antiga, se necessário
UPDATE usuario SET novo_id = id;

-- 3. Remover a coluna antiga
ALTER TABLE usuario DROP COLUMN id;

-- 4. Renomear a nova coluna para o nome original
ALTER TABLE usuario RENAME COLUMN novo_id TO id;

-- 5. Definir a nova coluna como chave primária
ALTER TABLE usuario ADD PRIMARY KEY (id);
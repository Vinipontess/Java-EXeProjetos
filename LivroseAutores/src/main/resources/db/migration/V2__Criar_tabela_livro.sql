CREATE TABLE livro (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    ano_publicacao INT NOT NULL,
    autor_id BIGINT,
    CONSTRAINT fk_autor FOREIGN KEY (autor_id) REFERENCES autor(id)
);
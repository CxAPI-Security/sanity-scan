CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    password VARCHAR(255),
    first_name VARCHAR(255),
    email VARCHAR(255),
    info TEXT
);
CREATE TABLE IF NOT EXISTS users
(
    user_id SERIAL PRIMARY KEY,
    first_name VARCHAR(200) NOT NULL,
    last_name VARCHAR(200) NOT NULL,
    login VARCHAR(200) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL UNIQUE,
    sex VARCHAR(10) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    city VARCHAR(200) NOT NULL
);
CREATE TABLE IF NOT EXISTS reservation
(
    reserv_id SERIAL,
    user_id SERIAL,
    date_reserv VARCHAR(30) NOT NULL,
    count INT NOT NULL,
    mobile_number INT NOT NULL,
    PRIMARY KEY (reserv_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);
CREATE TABLE IF NOT EXISTS exhibits
(
    exhibits_id SERIAL PRIMARY KEY,
    first_name VARCHAR(200) NOT NULL,
    habitat VARCHAR(200) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    year_BC VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT exists showroom
(
    showroom_id SERIAL PRIMARY key,
    first_name VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS exhibits_in_showroom
(
    id SERIAL,
    exhibits_id SERIAL,
    showroom_id SERIAL,
    PRIMARY KEY (id),
    FOREIGN KEY (exhibits_id) REFERENCES exhibits(exhibits_id),
    FOREIGN KEY (showroom_id) REFERENCES showroom(showroom_id)
);


select *
from exhibits;
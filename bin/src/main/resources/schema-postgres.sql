DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
    id serial PRIMARY KEY,
    name VARCHAR(255),
    age integer,
    species VARCHAR(255)
);
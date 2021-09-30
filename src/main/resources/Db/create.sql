
CREATE DATABASE startup_mentorship

CREATE TABLE if NOT EXISTS startup (
    id int auto_increment PRIMARY KEY,
    name VARCHAR,
    name_of_startup VARCHAR,
    category VARCHAR,
    capital_needed int
);

CREATE DATABASE startup_mentorship_test WITH TEMPLATE startup_mentorship;
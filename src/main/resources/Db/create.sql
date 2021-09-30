SET MODE postgreSQL;

CREATE DATABASE startup_mentorship;
\c startup_mentorship;

CREATE TABLE if NOT EXISTS investor(id SERIAL PRIMARY KEY,name VARCHAR, contacts VARCHAR, category VARCHAR);
CREATE DATABASE  startup_mentorship_test WITH TEMPLATE startup_mentorship;
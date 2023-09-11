CREATE TABLE person (
    id UUID NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER NOT NULL,
    secret_info TEXT NOT NULL
);

CREATE TABLE address (
    id UUID NOT NULL PRIMARY KEY,
    person_id UUID NOT NULL REFERENCES person(id),
    address TEXT NOT NULL,
    state TEXT NOT NULL
);
CREATE TABLE public.user (
    id INT NOT NULL,
    raiting INT NOT NULL,
    role varchar(128) NOT NULL,
    department varchar(128) NOT NULL,
    coursealumnusid INT NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE public.answer (
    id INT NOT NULL,
    question varchar(128) NOT NULL,
    useranswer varchar(128) NOT NULL,
    tag varchar(128) NOT NULL,
    userid INT NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE public.result (
    id INT NOT NULL,
    userid INT NOT NULL,
    rating INT NOT NULL,
    tag varchar(128) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE public.coursealumnus (
    id INT NOT NULL,
    coursename varchar(128) NOT NULL,
    userid INT NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE public.courses (
    id INT NOT NULL,
    coursename varchar(128) NOT NULL,
    department varchar(128) NOT NULL,
    raiting INT NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE registrantion_table (
  id BIGINT NOT NULL,
   username VARCHAR(255) NULL,
   first_name VARCHAR(255) NULL,
   last_name VARCHAR(255) NULL,
   email VARCHAR(255) NULL,

   CONSTRAINT pk_registrantion_table PRIMARY KEY (id)
);
CREATE TABLE "t101_user" (
	id varchar NULL,
	name varchar NULL,
	CONSTRAINT user_pk PRIMARY KEY (id)
);

INSERT INTO "t101_user"
(id, "name")
VALUES('1', 'bang');
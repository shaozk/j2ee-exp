
CREATE TABLE idcard (
	id INT(10) NOT NULL AUTO_INCREMENT,
	code VARCHAR(18) COLLATE UTF8_UNICODE_CI DEFAULT NULL,
	PRIMARY KEY (id)
);s

CREATE TABLE person (
	id INT(10) NOT NULL,person
	name VARCHAR(20) COLLATE UTF8_UNICODE_CI DEFAULT NULL,
	age INT(11) DEFAULT NULL,
	idcard_id INT(10) DEFAULT NULL,
	PRIMARY KEY(id),
	KEY idcard_id (idcard_id),
	CONSTRAINT idcard_id FOREIGN KEY (idcard_id) REFERENCES idcard (id)
);

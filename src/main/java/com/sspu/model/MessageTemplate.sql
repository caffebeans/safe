-- auto Generated on 2020-09-06
-- DROP TABLE IF EXISTS message_template;
CREATE TABLE message_template(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	content VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'content',
	footer VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'footer',
	create_user_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'createUserName',
	create_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'message_template';

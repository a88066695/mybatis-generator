DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
	`id` VARCHAR (32) NOT NULL COMMENT 'id',
	`number` int (11) NOT NULL COMMENT 'int',
	`t_number` tinyint (2) NOT NULL DEFAULT 1 COMMENT 'tinyint',
	`b_str` text COMMENT 'text',
	PRIMARY KEY `id` (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '测试表';
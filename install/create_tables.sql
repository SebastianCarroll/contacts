DROP TABLE IF EXISTS `persons`;

CREATE TABLE `persons` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `givenname` varchar(255) default NULL,
  `surname` varchar(255) default NULL,
  `comments` TEXT default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;
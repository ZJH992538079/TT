/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.20-ndb-7.5.8-cluster-gpl : Database - project1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`project1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `project1`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comment_id` char(128) DEFAULT NULL COMMENT '评论id',
  `forum_id` int(11) DEFAULT NULL COMMENT '被评论的帖子ID',
  `user_id` char(16) DEFAULT NULL COMMENT '用户ID',
  `comment_value` text COMMENT '评论内容',
  KEY `forum_id` (`forum_id`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`forum_id`) REFERENCES `forum` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `title` varchar(32) DEFAULT NULL COMMENT '帖子标题',
  `cover` varchar(64) DEFAULT NULL COMMENT '封面图',
  `user_id` char(16) NOT NULL COMMENT '用户ID',
  `type_id` int(11) NOT NULL COMMENT '帖子类型ID',
  `value` text COMMENT '帖子内容',
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `forum_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `forum_type` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子';

/*Data for the table `forum` */

/*Table structure for table `forum_type` */

DROP TABLE IF EXISTS `forum_type`;

CREATE TABLE `forum_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帖子类型ID',
  `type_name` varchar(8) DEFAULT NULL COMMENT '帖子类型名称',
  PRIMARY KEY (`type_id`),
  KEY `type_id` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `forum_type` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

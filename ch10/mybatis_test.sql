/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.6.24 : Database - mybatis_test
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis_test` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `mybatis_test`;

/*Table structure for table `batch` */

DROP TABLE IF EXISTS `batch`;

CREATE TABLE `batch` (
  `batch_id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_id` int(11) NOT NULL COMMENT '创建批次用户id',
  `number` varchar(32) NOT NULL COMMENT '批次编码',
  `createtime` datetime NOT NULL COMMENT '创建批次时间',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`batch_id`),
  KEY `FK_batch_1` (`cus_id`),
  CONSTRAINT `FK_batch_id` FOREIGN KEY (`cus_id`) REFERENCES `customer` (`cus_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `batch` */

insert  into `batch`(`batch_id`,`cus_id`,`number`,`createtime`,`note`) values (1,1,'00001','2017-07-22 00:00:00','首次购买'),(2,3,'00002','2017-03-11 00:00:00','委托购买');

/*Table structure for table `batchdetail` */

DROP TABLE IF EXISTS `batchdetail`;

CREATE TABLE `batchdetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_id` int(11) NOT NULL COMMENT '批次id',
  `product_id` int(11) NOT NULL COMMENT '理财产品id',
  `product_num` int(11) DEFAULT NULL COMMENT '理财产品购买数量',
  PRIMARY KEY (`id`),
  KEY `FK_batchdetail_1` (`batch_id`),
  KEY `FK_batchdetail_2` (`product_id`),
  CONSTRAINT `FK_batchdetai_1` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`batch_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_batchdetai_2` FOREIGN KEY (`product_id`) REFERENCES `finacial_products` (`product_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `batchdetail` */

insert  into `batchdetail`(`id`,`batch_id`,`product_id`,`product_num`) values (1,1,1,2),(2,1,2,1),(3,1,3,1),(4,2,1,2),(5,2,2,1);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cus_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `acno` varchar(32) DEFAULT NULL COMMENT '卡号',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  `phone` varchar(256) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`cus_id`,`username`,`acno`,`gender`,`phone`) values (1,'刘云','6228286666666','男','13800000000'),(2,'李健','622848111111','男','13811111111'),(3,'张丽丽','622848333333','女','13822222222');

/*Table structure for table `finacial_products` */

DROP TABLE IF EXISTS `finacial_products`;

CREATE TABLE `finacial_products` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '理财产品名称',
  `price` float(10,1) NOT NULL COMMENT '理财产品定价',
  `detail` text COMMENT '理财产品描述',
  `pic` varchar(64) DEFAULT NULL COMMENT '理财产品图片',
  `invasttime` datetime NOT NULL COMMENT '理财产品收益日期',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `finacial_products` */

insert  into `finacial_products`(`product_id`,`name`,`price`,`detail`,`pic`,`invasttime`) values (1,'一起富',5000.0,'投资少，风险小','img001','2017-06-21 00:00:00'),(2,'惠薪富',10000.0,'收益稳健','img002','2017-05-03 00:00:00'),(3,'安富尊容',15000.0,'年收益率提升5%','img003','2017-07-18 00:00:00'),(4,'富津利',2000.0,'企划收益率','img004','2017-04-11 00:00:00');


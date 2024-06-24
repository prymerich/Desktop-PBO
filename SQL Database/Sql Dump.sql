/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.28-MariaDB-log : Database - login_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`login_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `login_db`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `admin` */

/*Table structure for table `artikel` */

DROP TABLE IF EXISTS `artikel`;

CREATE TABLE `artikel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(255) NOT NULL,
  `penulis` varchar(255) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `paragraf` text NOT NULL,
  `tanggal` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `artikel` */

insert  into `artikel`(`id`,`judul`,`penulis`,`kategori`,`paragraf`,`tanggal`) values 
(1,'rhbwezr','regbzwse','17','rWBDSWRG','2024-06-01'),
(2,'dwjvcniovn','vewavipwj','12','vaeonviwevnwe','2024-06-05'),
(3,'anvjnwe','weaovnawei','17','fwnuoi2a3n','2024-06-07'),
(4,'egvsbhrsh','sjtrr5u','j45utejuse5','a4wh4wjnfvzn jrehrzehbfre4','2024-06-06');

/*Table structure for table `cek_imt` */

DROP TABLE IF EXISTS `cek_imt`;

CREATE TABLE `cek_imt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tinggi` int(7) NOT NULL,
  `berat` int(7) NOT NULL,
  `hasil` varchar(255) NOT NULL,
  `saran` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `cek_imt` */

insert  into `cek_imt`(`id`,`tinggi`,`berat`,`hasil`,`saran`) values 
(1,150,45,'20.00','Berat Badan Anda Ideal'),
(2,150,45,'20.00','Berat Badan Anda Ideal'),
(3,150,45,'20.00','Berat Badan Anda Ideal'),
(4,150,75,'33.33','Anda Beresiko Terkena Obesitas'),
(5,170,75,'25.95','Anda Beresiko Terkena Obesitas'),
(6,170,55,'19.03','Berat Badan Anda Ideal'),
(7,170,60,'20.76','Berat Badan Anda Ideal'),
(8,170,40,'13.84','Anda Kurang Gizi'),
(9,176,45,'14.53','Anda Kurang Gizi'),
(10,176,65,'20.98','Berat Badan Anda Ideal');

/*Table structure for table `cek_lemak` */

DROP TABLE IF EXISTS `cek_lemak`;

CREATE TABLE `cek_lemak` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jenis_kelamin` varchar(55) NOT NULL,
  `usia` int(7) NOT NULL,
  `tinggi` int(7) NOT NULL,
  `berat` int(7) NOT NULL,
  `hasil` varchar(255) NOT NULL,
  `saran` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `cek_lemak` */

insert  into `cek_lemak`(`id`,`jenis_kelamin`,`usia`,`tinggi`,`berat`,`hasil`,`saran`) values 
(1,'Perempuan',19,168,45,'18.10','Kadar Lemak anda Cukup'),
(2,'Perempuan',19,168,45,'18.10','Kadar Lemak anda Cukup'),
(3,'Perempuan',19,168,45,'18.10','Kadar Lemak anda Cukup'),
(4,'Laki-laki',19,168,45,'7.30','Anda Kekurangan Lemak'),
(5,'Perempuan',22,165,55,'23.90','Anda Sangat Bugar'),
(6,'Perempuan',25,177,50,'19.50','Kadar Lemak anda Cukup');

/*Table structure for table `logs_in` */

DROP TABLE IF EXISTS `logs_in`;

CREATE TABLE `logs_in` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `tinggi` int(11) DEFAULT NULL,
  `berat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `logs_in` */

insert  into `logs_in`(`id`,`username`,`password`,`name`,`jenis_kelamin`,`tinggi`,`berat`) values 
(1,'hinata','123','shoyo','Laki-laki',160,40),
(2,'adi','123','gusmang','Laki-laki',168,65),
(3,'gusmang','456','Adi','Laki-laki',170,55),
(4,'prayista','123','gasmung','Laki-laki',165,70),
(5,'tsukki','123','sima',NULL,172,64);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

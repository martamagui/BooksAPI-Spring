/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
CREATE DATABASE
/*!32312 IF NOT EXISTS*/
books
/*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE books;
DROP TABLE IF EXISTS bookstable;
CREATE TABLE `bookstable` (
  `titulo` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `autor` varchar(255) COLLATE latin1_spanish_ci NOT NULL,
  `categoria` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `precio` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `imgUrl` varchar(255)  COLLATE latin1_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`Titulo`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci;

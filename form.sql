-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: form
-- ------------------------------------------------------
-- Server version	8.0.12

 SET NAMES utf8 ;
--
-- Table structure for table `form`
--

DROP TABLE IF EXISTS `form`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `form` (
  `form_id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`form_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `form`
--

LOCK TABLES `form` WRITE;
/*!40000 ALTER TABLE `form` DISABLE KEYS */;
INSERT INTO `form` VALUES (1,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小明',2019002332,NULL),(3,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小李',2019084344,NULL),(4,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小红',2019002345,NULL),(5,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','张三',2019043434,NULL),(6,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','李四',2019003442,NULL),(7,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','王五',2019083434,NULL),(8,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','张飞',2019083434,NULL),(9,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','关羽',2019434432,NULL),(11,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小牛',2019085882,NULL),(12,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小羊',2019096734,NULL),(13,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','小马',2019067434,NULL),(14,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','大虎',2019488832,NULL),(15,'2019-12-03 16:09:38','123456','2019-12-03 16:09:38','张马',2019043874,NULL),(16,'2019-12-03 18:11:49','123456','2019-12-03 18:11:49','王境泽',2019006466,NULL);
/*!40000 ALTER TABLE `form` ENABLE KEYS */;
UNLOCK TABLES;

CREATE DATABASE  IF NOT EXISTS `gobidoc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `gobidoc`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: gobidoc
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookdetails`
--

DROP TABLE IF EXISTS `bookdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bookdetails` (
  `bookid` varchar(45) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `mainid` varchar(45) DEFAULT NULL,
  `subid` varchar(45) DEFAULT NULL,
  `yearofpublishing` varchar(45) DEFAULT NULL,
  `lastprintedyear` varchar(45) DEFAULT NULL,
  `isbnno` varchar(45) DEFAULT NULL,
  `noofpages` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookid`),
  KEY `BMC_idx` (`mainid`),
  KEY `BSC_idx` (`subid`),
  CONSTRAINT `BMC` FOREIGN KEY (`mainid`) REFERENCES `mclasstable` (`mainid`),
  CONSTRAINT `BSC` FOREIGN KEY (`subid`) REFERENCES `subclasstable` (`subid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookdetails`
--

LOCK TABLES `bookdetails` WRITE;
/*!40000 ALTER TABLE `bookdetails` DISABLE KEYS */;
INSERT INTO `bookdetails` VALUES ('b01','avatar','cameron','m01','s11','2001','2002','is01','2568'),('b02','titanic','cameron','m01','s01','1996','2000','is02','2536'),('b04','network','rock','m03','s08','2014','2015','is04','6548'),('b05','Sky Fall','robert','m01','s14','2013','2014','is05','258');
/*!40000 ALTER TABLE `bookdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mclasstable`
--

DROP TABLE IF EXISTS `mclasstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mclasstable` (
  `mainid` varchar(45) NOT NULL,
  `mainname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mainid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mclasstable`
--

LOCK TABLES `mclasstable` WRITE;
/*!40000 ALTER TABLE `mclasstable` DISABLE KEYS */;
INSERT INTO `mclasstable` VALUES ('m01','Film'),('m02','Arts'),('m03','Engineering'),('m04','Management');
/*!40000 ALTER TABLE `mclasstable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subclasstable`
--

DROP TABLE IF EXISTS `subclasstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subclasstable` (
  `subid` varchar(45) NOT NULL,
  `subname` varchar(45) DEFAULT NULL,
  `mainid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`subid`),
  KEY `MCSC_idx` (`mainid`),
  CONSTRAINT `MCSC` FOREIGN KEY (`mainid`) REFERENCES `mclasstable` (`mainid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subclasstable`
--

LOCK TABLES `subclasstable` WRITE;
/*!40000 ALTER TABLE `subclasstable` DISABLE KEYS */;
INSERT INTO `subclasstable` VALUES ('s01','Comedy','m01'),('s03','Commercial','m01'),('s04','Geography','m02'),('s05','History','m02'),('s06','Poltical Sci','m02'),('s07','Soft Eng','m03'),('s08','Comp Eng','m03'),('s09','Civil Eng','m03'),('s10','Love','m01'),('s11','Adventure','m01'),('s12','finance','m04'),('s13','Hindu Culture','m02'),('s14','Adventure','m01'),('s15','Accounts','m04'),('s16','Commerce','m04');
/*!40000 ALTER TABLE `subclasstable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-21 14:54:22

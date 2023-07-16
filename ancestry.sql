CREATE DATABASE  IF NOT EXISTS `charcreator` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `charcreator`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: charcreator
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ancestry`
--

DROP TABLE IF EXISTS `ancestry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ancestry` (
  `id` int NOT NULL,
  `ancestry_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `speed_mod` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ancestry`
--

LOCK TABLES `ancestry` WRITE;
/*!40000 ALTER TABLE `ancestry` DISABLE KEYS */;
INSERT INTO `ancestry` VALUES (1,'Draak','If you are looking for a race that is strong, charismatic, and resistant to fire damage, then a Draak may be a good choice for you.',10),(2,'Dwarf','If you are looking for a race that is hardy, strong, and skilled in combat, then a Dwarf may be a good choice for you.',8),(3,'Elf','If you are looking for a race that is agile, intelligent, and perceptive, then an Elf may be a good choice for you.',12),(4,'Gnome','If you are looking for a race that is intelligent, agile, and able to avoid danger, then a Gnome may be a good choice for you.',8),(5,'Goblin','If you are looking for a race that is agile, clever, and quick to fight back, then a Goblin may be a good choice for you.',10),(6,'Halfling','If you are looking for a small, but hardy race with a lot of personality, then a halfling may be a good choice for you.',8),(7,'Human','If you are looking for a race that can do it all, then a human may be a good choice for you.',10),(8,'Orc','If you are looking for a race that can be a force to be reckoned with, then an orc may be a good choice for you. They are well-suited for frontline combat.',10),(9,'WildFolk',' If you are looking for a race that is agile, perceptive, and connected to nature, then a WildFolk may be a good choice for you.',10);
/*!40000 ALTER TABLE `ancestry` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-16 17:38:43

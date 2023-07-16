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
-- Table structure for table `archetype`
--

DROP TABLE IF EXISTS `archetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `archetype` (
  `id` int NOT NULL,
  `archetype_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `health_mod` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `archetype`
--

LOCK TABLES `archetype` WRITE;
/*!40000 ALTER TABLE `archetype` DISABLE KEYS */;
INSERT INTO `archetype` VALUES (1,'Envoy','The Envoy to represents anyone who is primarily concerned with deals, diplomacy, leading, or deceiving others, from a noble captain of the guard to a scoundrel with a heart of gold or even a con artist.',25),(2,'Mage','Mage class equally represent sorcerers who derive power from the world\'s mystical energies, priests who channel the power of the gods, or even psychics who harness the power of the mind.',20),(3,'Rogue','A Rogue relies on quickness and cleverness. Whether crawling through a maze of city shadowsor slipping a dagger between an enemy\'s ribs, a Rogue must be agile and artful to win the day.',25),(4,'Warrior','A Warrior could be an ex-soldier, a caravan guard, a mercenary, militia, or a former blacksmith turned adventurer.',30);
/*!40000 ALTER TABLE `archetype` ENABLE KEYS */;
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

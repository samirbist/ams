-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 192.168.56.102    Database: ams
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `artcl`
--

DROP TABLE IF EXISTS `artcl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artcl` (
  `artcl_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `archv_dt` date DEFAULT NULL,
  `brf_txt` varchar(255) DEFAULT NULL,
  `cmnt_txt` varchar(255) DEFAULT NULL,
  `del_aprvd_ind` char(1) DEFAULT NULL,
  `del_dt` date DEFAULT NULL,
  `hdln_txt` varchar(255) NOT NULL,
  `kywrds_txt` varchar(255) DEFAULT NULL,
  `num_hits` int(11) NOT NULL,
  `publs_dt` date DEFAULT NULL,
  `publs_ind` char(1) NOT NULL,
  `shrt_hdln_txt` varchar(255) NOT NULL,
  `auth_genn_pid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`artcl_id`),
  KEY `FKsigq7585iqfdpjny7k9fifv4k` (`auth_genn_pid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artcl`
--

LOCK TABLES `artcl` WRITE;
/*!40000 ALTER TABLE `artcl` DISABLE KEYS */;
/*!40000 ALTER TABLE `artcl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artcl_catg`
--

DROP TABLE IF EXISTS `artcl_catg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artcl_catg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artcl_id` bigint(20) DEFAULT NULL,
  `catg_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbl9f1c8g3nq2xsuo3y35d1cf6` (`artcl_id`),
  KEY `FK8t6hfvxpw0ris7d3d8cfledn3` (`catg_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artcl_catg`
--

LOCK TABLES `artcl_catg` WRITE;
/*!40000 ALTER TABLE `artcl_catg` DISABLE KEYS */;
/*!40000 ALTER TABLE `artcl_catg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catg`
--

DROP TABLE IF EXISTS `catg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catg` (
  `catg_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `archv_dt` date DEFAULT NULL,
  `cagt_shrt_nm` varchar(255) DEFAULT NULL,
  `catg_nm` varchar(255) DEFAULT NULL,
  `descn_txt` varchar(255) DEFAULT NULL,
  `parnt_catg_id` varchar(255) DEFAULT NULL,
  `publs_dt` date DEFAULT NULL,
  `publs_ind` char(1) DEFAULT NULL,
  PRIMARY KEY (`catg_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catg`
--

LOCK TABLES `catg` WRITE;
/*!40000 ALTER TABLE `catg` DISABLE KEYS */;
/*!40000 ALTER TABLE `catg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genn_persn`
--

DROP TABLE IF EXISTS `genn_persn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genn_persn` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `aprvd_ind` char(1) NOT NULL,
  `cmnt_txt` varchar(255) DEFAULT NULL,
  `co_nm` varchar(255) DEFAULT NULL,
  `jnj_email_addr_txt` varchar(255) DEFAULT NULL,
  `fmly_nm` varchar(255) DEFAULT NULL,
  `given_nm` varchar(255) DEFAULT NULL,
  `login_nm` varchar(255) NOT NULL,
  `mid_init_nm` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `pin` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_rpd30wu5tkdk55sx52esg7cvg` (`login_nm`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genn_persn`
--


--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ADMIN'),(2,'USER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,1),(1,2),(2,1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-13 17:12:37

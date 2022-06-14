-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: lifex
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `lifex_users`
--

DROP TABLE IF EXISTS `lifex_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lifex_users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `bio` varchar(255) DEFAULT NULL,
  `friends` varchar(255) DEFAULT NULL,
  `friend_request` varchar(45) DEFAULT NULL,
  `time_stamp` timestamp(6) NULL DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `profile_pic` longblob,
  `expiry_timestamp` timestamp(6) NULL DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lifex_users`
--

LOCK TABLES `lifex_users` WRITE;
/*!40000 ALTER TABLE `lifex_users` DISABLE KEYS */;
INSERT INTO `lifex_users` VALUES (15,'hueiiming','huei','ming','limhueiming2016@gmail.com',NULL,'','','2022-06-12 01:13:24.831000','5f4dcc3b5aa765d61d8327deb882cf99',_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0�<i\0\0\0PLTE\�\�\����\�\�\�\�\�\��� p\0\0�IDATx\���\0\0\0\0�����\0\0\0\0\0\0\0\0\0\0\0�ۻc$��#�\�Y\n��t��\�����\�p\\b��\�\�`\�\0��6�#\�.\�M�b����[\�|�f��\��a�\��?�\�Ɵ?T��/���\�\�_��xh�@��\0�<�\�\0�tn�\���T�\��8�z\"�G>�q\�&��_\�V00\�\�>w\'-��O\�9K�O\�\�Q\�D\"�:\"<�.�k���\�\�YL���\�\�<#\r\����\�`ow�[�L���;��S!\�\���\�5@\���E��$��!\�	D|\�c=�\Z=�6}K��q�*\0[��tF\0\�uF\0���!\�K��\�A�R��K��ȗǈs��\�A\�\�d\��\�d�^-	\�[��$`iI�\\:L-19Z�w\���,diY\�ܲ��e!#f!G�\�\'��\�\�N���aku��\�!�V��[b\�Y�\n!#B�V\��H���B\�@�\�,=�\�\n��o4|\�\��1�V�x9\0����͐�5C�㆞?�+��l=��`})\0��\�x\�H\"�@[2�R|x\0�^\���\�p�\0\\\0.\0WEt\�\\�\�:�_\�\\\�]\�^\��_L�oF\�g��\�鷞\���\�\��\�K�\�\�\�ߦ\�\��W:{\0��\��^q���[~]\�\�;,���\�&\�3\�;��^��ۮ\�7Ly8�Ӽ\�6\�;\�;��\���>\�\�\�\'0�3(�)-\r�zK>�&�Ɠ\�#\�\'2\�3�\�\\�\\�|2[>���Η\�\'\�\'4\�3*\�)���\�|Rk>���\�\�\�+\�\'6�D��\��\��zr{>���O\�\�\�/\�_p\�߰\�_�\�\�1\�_ry����?\�9�\�Ȟ4z��\�G�\�S���QUzk�q���]\0\�\�.\0�vG�\0\�\�`���[�|�]v2x�?X,e\n\�8\�\�k��p�~���RA�[}�l\nE\0xhw�[\�\�4\�\�\�n%`\nU\�\�\�V�\0�]>\Z\�;���׍9\��4BJ­$!ܝ_?Cq��6	\���X*\'�B�N���M�6�J�q�*\0�\0�\����\0IA\0{3��)�K�)t\"\�(e\�dms���!qrT\��\�\� k��̥\�\� G\�\��\�\� ks$\0`is��bq��B[K\�R�anI�Ԓ����%[K֖\�-	�Z0\�r8Z��$`\�\�!`iY\�ܲ��e!#f!G\�B����-YZ2�,djYȈY\�Ѳ���H���\�VXZ`ne���F,���2�\�\�\0k�\�!�V��[bju�\�G�C\�9�V\�Zbmu��\�!\�@+�L�2b!\�\��B\�\�\n![+��9�V�YZ!d\��J\�\�*1�~>�Vb�V�\�s\0��}\0��5�o=[�k����\�@\�EL�\�f\�hW�7C�@k�\�9�\�\�r\0��\�\0\�r�wm9�Kq]0\r\0����-��\�$\�\"\�װ�5₈\�\�mIt�Ƴ\�OmI\�vhkR\�@[��.\�X���ПK�/\09��d\����\�ٔ\�Z�\�>�{N=�_4�7U�\��*�\�\0\0\0\0IEND�B`�',NULL,''),(16,'user1','user','1','user1@gmail.com',NULL,'','','2022-06-12 01:13:37.640000','5f4dcc3b5aa765d61d8327deb882cf99',_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0�<i\0\0\0PLTE\�\�\����\�\�\�\�\�\��� p\0\0�IDATx\���\0\0\0\0�����\0\0\0\0\0\0\0\0\0\0\0�ۻc$��#�\�Y\n��t��\�����\�p\\b��\�\�`\�\0��6�#\�.\�M�b����[\�|�f��\��a�\��?�\�Ɵ?T��/���\�\�_��xh�@��\0�<�\�\0�tn�\���T�\��8�z\"�G>�q\�&��_\�V00\�\�>w\'-��O\�9K�O\�\�Q\�D\"�:\"<�.�k���\�\�YL���\�\�<#\r\����\�`ow�[�L���;��S!\�\���\�5@\���E��$��!\�	D|\�c=�\Z=�6}K��q�*\0[��tF\0\�uF\0���!\�K��\�A�R��K��ȗǈs��\�A\�\�d\��\�d�^-	\�[��$`iI�\\:L-19Z�w\���,diY\�ܲ��e!#f!G�\�\'��\�\�N���aku��\�!�V��[b\�Y�\n!#B�V\��H���B\�@�\�,=�\�\n��o4|\�\��1�V�x9\0����͐�5C�㆞?�+��l=��`})\0��\�x\�H\"�@[2�R|x\0�^\���\�p�\0\\\0.\0WEt\�\\�\�:�_\�\\\�]\�^\��_L�oF\�g��\�鷞\���\�\��\�K�\�\�\�ߦ\�\��W:{\0��\��^q���[~]\�\�;,���\�&\�3\�;��^��ۮ\�7Ly8�Ӽ\�6\�;\�;��\���>\�\�\�\'0�3(�)-\r�zK>�&�Ɠ\�#\�\'2\�3�\�\\�\\�|2[>���Η\�\'\�\'4\�3*\�)���\�|Rk>���\�\�\�+\�\'6�D��\��\��zr{>���O\�\�\�/\�_p\�߰\�_�\�\�1\�_ry����?\�9�\�Ȟ4z��\�G�\�S���QUzk�q���]\0\�\�.\0�vG�\0\�\�`���[�|�]v2x�?X,e\n\�8\�\�k��p�~���RA�[}�l\nE\0xhw�[\�\�4\�\�\�n%`\nU\�\�\�V�\0�]>\Z\�;���׍9\��4BJ­$!ܝ_?Cq��6	\���X*\'�B�N���M�6�J�q�*\0�\0�\����\0IA\0{3��)�K�)t\"\�(e\�dms���!qrT\��\�\� k��̥\�\� G\�\��\�\� ks$\0`is��bq��B[K\�R�anI�Ԓ����%[K֖\�-	�Z0\�r8Z��$`\�\�!`iY\�ܲ��e!#f!G\�B����-YZ2�,djYȈY\�Ѳ���H���\�VXZ`ne���F,���2�\�\�\0k�\�!�V��[bju�\�G�C\�9�V\�Zbmu��\�!\�@+�L�2b!\�\��B\�\�\n![+��9�V�YZ!d\��J\�\�*1�~>�Vb�V�\�s\0��}\0��5�o=[�k����\�@\�EL�\�f\�hW�7C�@k�\�9�\�\�r\0��\�\0\�r�wm9�Kq]0\r\0����-��\�$\�\"\�װ�5₈\�\�mIt�Ƴ\�OmI\�vhkR\�@[��.\�X���ПK�/\09��d\����\�ٔ\�Z�\�>�{N=�_4�7U�\��*�\�\0\0\0\0IEND�B`�',NULL,''),(17,'user2','user','2','user2@gmail.com',NULL,'','','2022-06-12 01:13:53.061000','5f4dcc3b5aa765d61d8327deb882cf99',_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0�<i\0\0\0PLTE\�\�\����\�\�\�\�\�\��� p\0\0�IDATx\���\0\0\0\0�����\0\0\0\0\0\0\0\0\0\0\0�ۻc$��#�\�Y\n��t��\�����\�p\\b��\�\�`\�\0��6�#\�.\�M�b����[\�|�f��\��a�\��?�\�Ɵ?T��/���\�\�_��xh�@��\0�<�\�\0�tn�\���T�\��8�z\"�G>�q\�&��_\�V00\�\�>w\'-��O\�9K�O\�\�Q\�D\"�:\"<�.�k���\�\�YL���\�\�<#\r\����\�`ow�[�L���;��S!\�\���\�5@\���E��$��!\�	D|\�c=�\Z=�6}K��q�*\0[��tF\0\�uF\0���!\�K��\�A�R��K��ȗǈs��\�A\�\�d\��\�d�^-	\�[��$`iI�\\:L-19Z�w\���,diY\�ܲ��e!#f!G�\�\'��\�\�N���aku��\�!�V��[b\�Y�\n!#B�V\��H���B\�@�\�,=�\�\n��o4|\�\��1�V�x9\0����͐�5C�㆞?�+��l=��`})\0��\�x\�H\"�@[2�R|x\0�^\���\�p�\0\\\0.\0WEt\�\\�\�:�_\�\\\�]\�^\��_L�oF\�g��\�鷞\���\�\��\�K�\�\�\�ߦ\�\��W:{\0��\��^q���[~]\�\�;,���\�&\�3\�;��^��ۮ\�7Ly8�Ӽ\�6\�;\�;��\���>\�\�\�\'0�3(�)-\r�zK>�&�Ɠ\�#\�\'2\�3�\�\\�\\�|2[>���Η\�\'\�\'4\�3*\�)���\�|Rk>���\�\�\�+\�\'6�D��\��\��zr{>���O\�\�\�/\�_p\�߰\�_�\�\�1\�_ry����?\�9�\�Ȟ4z��\�G�\�S���QUzk�q���]\0\�\�.\0�vG�\0\�\�`���[�|�]v2x�?X,e\n\�8\�\�k��p�~���RA�[}�l\nE\0xhw�[\�\�4\�\�\�n%`\nU\�\�\�V�\0�]>\Z\�;���׍9\��4BJ­$!ܝ_?Cq��6	\���X*\'�B�N���M�6�J�q�*\0�\0�\����\0IA\0{3��)�K�)t\"\�(e\�dms���!qrT\��\�\� k��̥\�\� G\�\��\�\� ks$\0`is��bq��B[K\�R�anI�Ԓ����%[K֖\�-	�Z0\�r8Z��$`\�\�!`iY\�ܲ��e!#f!G\�B����-YZ2�,djYȈY\�Ѳ���H���\�VXZ`ne���F,���2�\�\�\0k�\�!�V��[bju�\�G�C\�9�V\�Zbmu��\�!\�@+�L�2b!\�\��B\�\�\n![+��9�V�YZ!d\��J\�\�*1�~>�Vb�V�\�s\0��}\0��5�o=[�k����\�@\�EL�\�f\�hW�7C�@k�\�9�\�\�r\0��\�\0\�r�wm9�Kq]0\r\0����-��\�$\�\"\�װ�5₈\�\�mIt�Ƴ\�OmI\�vhkR\�@[��.\�X���ПK�/\09��d\����\�ٔ\�Z�\�>�{N=�_4�7U�\��*�\�\0\0\0\0IEND�B`�',NULL,''),(18,'johnny','john','lim','johnny@gmail.com',NULL,'','','2022-06-12 01:16:47.599000','5f4dcc3b5aa765d61d8327deb882cf99',_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0\0\0\0\0\0\0�<i\0\0\0PLTE\�\�\����\�\�\�\�\�\��� p\0\0�IDATx\���\0\0\0\0�����\0\0\0\0\0\0\0\0\0\0\0�ۻc$��#�\�Y\n��t��\�����\�p\\b��\�\�`\�\0��6�#\�.\�M�b����[\�|�f��\��a�\��?�\�Ɵ?T��/���\�\�_��xh�@��\0�<�\�\0�tn�\���T�\��8�z\"�G>�q\�&��_\�V00\�\�>w\'-��O\�9K�O\�\�Q\�D\"�:\"<�.�k���\�\�YL���\�\�<#\r\����\�`ow�[�L���;��S!\�\���\�5@\���E��$��!\�	D|\�c=�\Z=�6}K��q�*\0[��tF\0\�uF\0���!\�K��\�A�R��K��ȗǈs��\�A\�\�d\��\�d�^-	\�[��$`iI�\\:L-19Z�w\���,diY\�ܲ��e!#f!G�\�\'��\�\�N���aku��\�!�V��[b\�Y�\n!#B�V\��H���B\�@�\�,=�\�\n��o4|\�\��1�V�x9\0����͐�5C�㆞?�+��l=��`})\0��\�x\�H\"�@[2�R|x\0�^\���\�p�\0\\\0.\0WEt\�\\�\�:�_\�\\\�]\�^\��_L�oF\�g��\�鷞\���\�\��\�K�\�\�\�ߦ\�\��W:{\0��\��^q���[~]\�\�;,���\�&\�3\�;��^��ۮ\�7Ly8�Ӽ\�6\�;\�;��\���>\�\�\�\'0�3(�)-\r�zK>�&�Ɠ\�#\�\'2\�3�\�\\�\\�|2[>���Η\�\'\�\'4\�3*\�)���\�|Rk>���\�\�\�+\�\'6�D��\��\��zr{>���O\�\�\�/\�_p\�߰\�_�\�\�1\�_ry����?\�9�\�Ȟ4z��\�G�\�S���QUzk�q���]\0\�\�.\0�vG�\0\�\�`���[�|�]v2x�?X,e\n\�8\�\�k��p�~���RA�[}�l\nE\0xhw�[\�\�4\�\�\�n%`\nU\�\�\�V�\0�]>\Z\�;���׍9\��4BJ­$!ܝ_?Cq��6	\���X*\'�B�N���M�6�J�q�*\0�\0�\����\0IA\0{3��)�K�)t\"\�(e\�dms���!qrT\��\�\� k��̥\�\� G\�\��\�\� ks$\0`is��bq��B[K\�R�anI�Ԓ����%[K֖\�-	�Z0\�r8Z��$`\�\�!`iY\�ܲ��e!#f!G\�B����-YZ2�,djYȈY\�Ѳ���H���\�VXZ`ne���F,���2�\�\�\0k�\�!�V��[bju�\�G�C\�9�V\�Zbmu��\�!\�@+�L�2b!\�\��B\�\�\n![+��9�V�YZ!d\��J\�\�*1�~>�Vb�V�\�s\0��}\0��5�o=[�k����\�@\�EL�\�f\�hW�7C�@k�\�9�\�\�r\0��\�\0\�r�wm9�Kq]0\r\0����-��\�$\�\"\�װ�5₈\�\�mIt�Ƴ\�OmI\�vhkR\�@[��.\�X���ПK�/\09��d\����\�ٔ\�Z�\�>�{N=�_4�7U�\��*�\�\0\0\0\0IEND�B`�',NULL,'');
/*!40000 ALTER TABLE `lifex_users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-14 20:16:09
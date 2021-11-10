-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: opportunity
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `academic_resource`
--

DROP TABLE IF EXISTS `academic_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `academic_resource` (
  `academic_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `payment_cost` decimal(8,2) NOT NULL,
  `acad_subject` varchar(200) DEFAULT NULL,
  `academic_description` varchar(400) NOT NULL,
  `acad_location` varchar(100) NOT NULL,
  PRIMARY KEY (`academic_id`,`user_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `academic_resource_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=100002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `academic_resource`
--

LOCK TABLES `academic_resource` WRITE;
/*!40000 ALTER TABLE `academic_resource` DISABLE KEYS */;
INSERT INTO `academic_resource` VALUES (4,2,'Writing Center',0.00,'English ','Students can use this resource on campus to check their papers.  ','On campus'),(5,1,'CS TA Office hours online',0.00,'Computer Science','TA office hours for computer science. ','Zoom/blackboard '),(6,5,'Library',0.00,'Any','Students can use the resources in the library for studying. ','On campus library'),(100000,3,'design_pattern',0.00,'computer_science','This book is about design pattern. ','Library'),(100001,4,'journal',4.00,'medical','This is a medical journal. ','Library');
/*!40000 ALTER TABLE `academic_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `company` (
  `company_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(300) NOT NULL,
  `industry` varchar(100) NOT NULL,
  `comp_address` varchar(200) NOT NULL,
  `review` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (1,'UIC Company','education','1234 Internet St.','5 stars!'),(2,'Deloitte','Management Consulting','St Michael, MN','Great Company to work for!'),(3,'Nike','Sports/Clothing','Beaverton, OR','4.5 stars'),(4,'Amazon','Computer Software, Information Technology and Services','Arlington, VA','3 stars'),(5,'Roku','Entertainment','New York, NY','3.5 stars');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_resource`
--

DROP TABLE IF EXISTS `health_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `health_resource` (
  `health_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `contact` varchar(100) NOT NULL,
  `health_type` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `service_description` varchar(500) NOT NULL,
  `payment` varchar(100) NOT NULL,
  PRIMARY KEY (`health_id`,`user_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `health_resource_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_resource`
--

LOCK TABLES `health_resource` WRITE;
/*!40000 ALTER TABLE `health_resource` DISABLE KEYS */;
INSERT INTO `health_resource` VALUES (1,1,'123--456-78910','Mental Health','1234 Real St,Chicago, IL 12345','Provide therapy sessions for students','free'),(2,2,' (312) 949-1289','Medical Health','1845 S Michigan Ave, Chicago, IL 60616','Chicago InHealth Center is a multidisciplinary clinic offering chiropractic care, functional gait analysis, physical therapy, active release therapy, and acupuncture.','Consultation: Free, Other Service Fees may vary'),(3,3,'773-768-5000','Medical','9119 S Exchange Ave, Chicago, IL 60617','Chicago Family Health Center provides comprehensive primary healthcare for all who seek care.','Service Fees may vary'),(4,4,'312-747-7496','Mental Health','641 W. 63rd Street','Care that can provide supports for emotional, traumatic, or behavioral difficulties. ','Service fees may vary'),(5,5,' (773) 907-8255','Medical','5106 N Lincoln Ave, Chicago, IL 60625','Lincoln Medical Center is a private medical practice located in the prominent neighborhood of Lincoln Square. ','Service Fees may vary');
/*!40000 ALTER TABLE `health_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_opportunity`
--

DROP TABLE IF EXISTS `job_opportunity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `job_opportunity` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `job_description` varchar(1000) NOT NULL,
  `application_info` varchar(1000) NOT NULL,
  `benefit_description` varchar(1000) NOT NULL,
  `company_id` int(11) NOT NULL,
  `salary` decimal(8,2) NOT NULL,
  `position_title` varchar(1000) NOT NULL,
  PRIMARY KEY (`job_id`,`user_id`),
  KEY `company_id` (`company_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `job_opportunity_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON DELETE CASCADE ON UPDATE RESTRICT,
  CONSTRAINT `job_opportunity_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_opportunity`
--

LOCK TABLES `job_opportunity` WRITE;
/*!40000 ALTER TABLE `job_opportunity` DISABLE KEYS */;
INSERT INTO `job_opportunity` VALUES (1,2,'Coding cool stuff','Apply by 10/2022','Health, Life, Dental, and Vision Insurance',1,87000.00,'Software Engineer'),(2,3,'Accounting & Auditing','Apply at: https://dtt.taleo.net/careersection/13100/jobdetail.ftl?job=BGI122105RG&lang=en','Health, Life, Dental, and Vision Insurance',2,80000.00,'Accountant'),(3,5,'Concept and Product Creation','Apply at: https://jobs.nike.com/job/URSRCAPPINNGI22?from=job%20search%20funnel','Disability',3,67000.00,'Nike Innovation Intern'),(4,1,'Business Planning','BA/BS degree in Computer Science, Mathematics, Information Systems\n','Health, Life, Dental, and Vision Insurance',4,95000.00,'Strategy/Planning, Analyst, and Information Technology'),(5,4,'Media Analysis\n','Preferred Majors: Public Relations, Communications, Marketing\n\n\n','Unknown',5,97000.00,'Marketing, Public Relations, and Writing/Editing');
/*!40000 ALTER TABLE `job_opportunity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `legal_resource`
--

DROP TABLE IF EXISTS `legal_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `legal_resource` (
  `legal_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `cost` decimal(8,2) NOT NULL,
  `legal_description` varchar(500) NOT NULL,
  `resource_location` varchar(200) NOT NULL,
  `resource_name` varchar(100) NOT NULL,
  `contact_information` varchar(80) NOT NULL,
  PRIMARY KEY (`legal_id`,`user_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `legal_resource_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=300001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `legal_resource`
--

LOCK TABLES `legal_resource` WRITE;
/*!40000 ALTER TABLE `legal_resource` DISABLE KEYS */;
INSERT INTO `legal_resource` VALUES (2,4,50.00,'Consultation for interview ','Chicago, IL','Legal consultation  ','3120001111'),(5,2,100.00,'Consultation regarding to Visa status','Chicago, IL','Visa consultation','3121110022'),(5614,3,500.00,'Get help with your H1-B visa sponsorship','Chicago, IL','H1-B Visa','+1 3125642311'),(12345,5,1.00,'Office of International Students that can help answer questions. ','On campus ','OIS office','3129901234'),(300000,1,200.00,'Lawyer consultation for visa','100 W 100th St, Chicago, IL','lawyer_consultation','6301234567');
/*!40000 ALTER TABLE `legal_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scholarship`
--

DROP TABLE IF EXISTS `scholarship`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `scholarship` (
  `scholarship_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `award_name` varchar(1000) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `requirement` varchar(1000) NOT NULL,
  `reward_amount` decimal(8,2) NOT NULL,
  `deadline` date NOT NULL,
  PRIMARY KEY (`scholarship_id`,`user_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `scholarship_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scholarship`
--

LOCK TABLES `scholarship` WRITE;
/*!40000 ALTER TABLE `scholarship` DISABLE KEYS */;
INSERT INTO `scholarship` VALUES (1,4,'UIC Cool Student Scholarship','A scholarship for cool students attending UIC','Must be attending UIC, must be cool, must have some form of financial need, must have at least a 3.0 GPA',10000.00,'2021-10-19'),(2,4,'FUA Scholarship','The Fearless Undocumented Alliance at UIC is offering up to $5,000 of rewards for undocumented students at UIC. ','Must be an undocumented undergraduate or graduate student at UIC, Must have at least a 3.0 GPA, Must have at least 1 letter of recommendation.',1000.00,'2022-03-21'),(3,3,'The Aga Khan Foundation International Scholarship','The Aga Khan Foundation International Scholarship provides scholarships to students from select developing countries who have no other source of financial help for their graduate studies. The scholarships are 50 percent grant and 50 percent loan.','The main criteria for selecting award winners are: l) consistently excellent academic records, 2) genuine financial need, 3) admission to a highly reputable university or programme of study',50000.00,'2022-03-31'),(4,5,'Yale University Scholarship','Yale University Scholarship is a fully funded scholarship for international students. This scholarship is offered for undergraduate, masters and PhD.','Must be a  undergraduate, masters or PhD student at Yale University.',50000.00,'2022-05-13'),(5,2,'PepsiCo Cesar Chavez Latino Scholarship','This scholarship applies to Hispanic students who are beginning or continuing their studies at higher educational institutions in Arizona and California\'s Central Valley ','Eligible applicants must: demonstrate leadership in extra-curricular activities, a commitment to volunteer service in the community and financial need; be an incoming or continuing full-time undergraduate student full-time; have a 3.0 GPA; be a U.S. Citizen, Permanent Legal Resident, Undocumented, DACA, CA Dreamer or Eligible Non-Citizen (as defined by FAFSA); and, must be a resident and attending a college in Arizona or California\'s Central Valley (see website for more details).',5000.00,'2022-07-20');
/*!40000 ALTER TABLE `scholarship` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutor`
--

DROP TABLE IF EXISTS `tutor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tutor` (
  `tutor_id` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(100) NOT NULL,
  `grade_level` int(11) NOT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `fee` decimal(8,2) NOT NULL,
  `service_id` int(11) NOT NULL,
  `phone_number` varchar(100) NOT NULL,
  `tutor_hours` varchar(100) NOT NULL,
  PRIMARY KEY (`tutor_id`),
  KEY `service_id` (`service_id`),
  CONSTRAINT `tutor_ibfk_1` FOREIGN KEY (`service_id`) REFERENCES `tutoring_service` (`service_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutor`
--

LOCK TABLES `tutor` WRITE;
/*!40000 ALTER TABLE `tutor` DISABLE KEYS */;
INSERT INTO `tutor` VALUES (1,'John Doe',9,'Math',15.00,1,'773-202-2020','MWF:9:00am-5:00pm, Sat: 10:00am-2:00pm, Sun:N/A '),(2,'Jane Doe',12,'Science',15.50,2,'773-111-1010','Mon-Fri: 8:00-1:00'),(3,'Michael Myers',13,'Biology',20.00,3,'772-222-2121','Mon - Thur: 3:00-6:00'),(4,'Sean Mchloghlin',13,'Calculus',20.00,4,'771-3132-0001','Mon-Fri: 9:00-12:00, Sat: 9:00-3:00'),(5,'Kevin Kostner',13,'Computer Science',25.00,5,'773-3120-3458','Mon-Thur: 3:00 - 7:00');
/*!40000 ALTER TABLE `tutor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutoring_service`
--

DROP TABLE IF EXISTS `tutoring_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tutoring_service` (
  `service_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `address` varchar(500) NOT NULL,
  `total_tutors` int(11) NOT NULL,
  `operation_hours` varchar(500) NOT NULL,
  `service_name` varchar(300) NOT NULL,
  `contact_info` varchar(300) NOT NULL,
  PRIMARY KEY (`service_id`,`user_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `tutoring_service_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutoring_service`
--

LOCK TABLES `tutoring_service` WRITE;
/*!40000 ALTER TABLE `tutoring_service` DISABLE KEYS */;
INSERT INTO `tutoring_service` VALUES (1,2,'1234 Internet Street, Chicago, IL 12345',10,'Mon-Fri: 9:00am-5:00pm, Sat-Sun:10:00am-2:00pm','Tutors R Us','123-456-78910'),(2,2,'600 N Kingsbury St Chicago, IL 60654',25,'Mon - Sun  8:00 AM - 11:00 PM','MyGuru','(312) 278-0321'),(3,3,'2117 B South China Pl Ste B Chicago, IL 60616',33,'Mon: 3:00-6:00, Thur: 3:00-6:00, Sat: 9:30-12:00','Kumon Math and Reading Center of Chicago - South Loop','(312) 791-1440'),(4,5,'1505 W Fullerton Ave Chicago, IL 60614',7,'Mon - Fri: 9:00-7:00, Sat: 9:00-3:00','Huntington Learning Center','(773) 348-4444'),(5,1,'1444 W Fullerton Ave Chicago, IL 60614',12,'Mon - Thurs: 3:00 - 7:00, Sat: 10:00 - 2:00, Sun: 12:00 - 3:00 ','Mathnasium','(773) 880-6284');
/*!40000 ALTER TABLE `tutoring_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `date_time` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'jborow7','pd5_demo','2021-10-18 15:36:24'),(2,'rrajan7','CS480@UIC','2021-11-05 15:13:07'),(3,'cwen7','CS_480_is_cool','2021-11-05 15:14:21'),(4,'bradha5','password','2021-11-05 15:15:01'),(5,'jborowy','VeryStrongPassword','2021-11-05 15:15:49');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-09 18:45:49

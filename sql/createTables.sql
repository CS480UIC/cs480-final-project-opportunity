CREATE DATABASE opportunity;


use  opportunity;

CREATE TABLE user
(
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  date_time DATETIME NOT NULL
);

CREATE TABLE entity1 
(
  username VARCHAR(50) primary key,
  `password` VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL
);

CREATE TABLE tutoring_service
(
	service_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    address VARCHAR(500) NOT NULL,
    total_tutors INT NOT NULL,
    operation_hours VARCHAR(500) NOT NULL,
    service_name VARCHAR(300) NOT NULL,
    contact_info VARCHAR(300) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
    PRIMARY KEY(service_id, user_id)
);

CREATE TABLE tutor
(
	tutor_id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    grade_level INT NOT NULL,
    `subject` VARCHAR(100),
    fee DECIMAL(8,2) NOT NULL,
    service_id INT NOT NULL,
    phone_number VARCHAR(100) NOT NULL,
    tutor_hours VARCHAR(100) NOT NULL,
    FOREIGN KEY (service_id) REFERENCES tutoring_service(service_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT
);

CREATE TABLE scholarship
(
	scholarship_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    award_name VARCHAR(1000) NOT NULL,
    `description` VARCHAR(1000) NOT NULL,
    requirement VARCHAR(1000) NOT NULL,
    reward_amount DECIMAL(8,2) NOT NULL,
    deadline DATE NOT NULL,
    FOREIGN KEY(user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	PRIMARY KEY(scholarship_id, user_id)
);

CREATE TABLE company
(
	company_id INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(300) NOT NULL,
    industry VARCHAR(100) NOT NULL,
    comp_address VARCHAR(200) NOT NULL,
    review VARCHAR(500)
);

CREATE TABLE job_opportunity
(
	job_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    job_description VARCHAR(1000) NOT NULL,
    application_info VARCHAR(1000) NOT NULL,
    benefit_description VARCHAR(1000) NOT NULL,
    company_id INT NOT NULL,
    salary DECIMAL(8,2) NOT NULL,
    position_title VARCHAR(1000) NOT NULL,
    FOREIGN KEY (company_id) REFERENCES company(company_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	FOREIGN KEY(user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	PRIMARY KEY(job_id, user_id)
);

CREATE TABLE health_resource
(
	health_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    contact VARCHAR(100) NOT NULL,
    health_type VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    service_description VARCHAR(500) NOT NULL,
    payment VARCHAR(100) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	PRIMARY KEY(health_id, user_id)
);

CREATE TABLE legal_resource
(
	legal_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    cost DECIMAL(8,2) NOT NULL,
    legal_description VARCHAR(500) NOT NULL,
    resource_location VARCHAR(200) NOT NULL,
    resource_name VARCHAR(100) NOT NULL,
    contact_information VARCHAR(80) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	PRIMARY KEY(legal_id, user_id)
);

CREATE TABLE academic_resource
(
	academic_id INT AUTO_INCREMENT,
    user_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    payment_cost DECIMAL(8,2) NOT NULL,
    acad_subject VARCHAR(200),
    academic_description VARCHAR(400) NOT NULL,
    acad_location VARCHAR(100) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES user(user_id)
		ON DELETE CASCADE
        ON UPDATE RESTRICT,
	PRIMARY KEY(academic_id, user_id)
);
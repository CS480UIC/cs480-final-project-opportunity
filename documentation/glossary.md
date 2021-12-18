# Glossary
## All entities name(9)
- scholarship
- job_opportunity
- tutoring_service
- tutor
- company
- academic_resource
- legal_resource
- health_resource
- login_user

## Assumptions
- Each tutor is matched to exactly one tutoring service
- Each job_opporunity is matched to exactly one company  

## Synonyms and descriptions
Entity Name: scholarship <br />
Synonyms: Grant, Award, Fellowship<br />
Description: A grant or payment made to support a student's education, awarded on the basis of academic or other achievement<br />
<br />
Entity Name: job_opportunity <br />
Synonyms: Employment, Job, Post<br />
Description: A paid position of regular employment<br />
<br />
Entity Name: tutoring_service <br />
Synonyms: Educational Service, Teaching Service<br />
Description: A group or organization that provides additional help and support to students outside of class<br />
<br />
Entity Name: tutor <br />
Synonyms: Teacher, Instructor<br />
Description: A teacher that provides guidance to one or a small group of students outside of class<br />
<br />
Entity Name: company <br />
Synonyms: Business, Cooperation<br />
Description: A commercial business<br />
<br />
Entity Name: academic_resource <br />
Synonyms: Educational Materials <br />
Description: Any support outside of their class that provides support to student<br />
<br />
Entity Name: legal_resource <br />
Synonyms: Law Services<br />
Description: Resouces, materials, consultation relate to law or legal process<br />
<br />
Entity Name: health_resource <br />
Synonyms: Health info center<br />
Description: All materials, personnel, facilities etc. that can provide health care services<br />
<br />
Entity Name: login_user <br />
Synonyms: Login credential<br />
Description: A account infomation for user including username and password<br />

## Relationships
login_user-Learns From-academic_resource (*Maximum Cardinality*)<br />
many-many: many users can use different resources<br />
<br />
login_user-Utilizes-legal_resource (*Maximum Cardinality*)<br />
many-many: many users can use different resources<br />
<br />
login_user-Benefits From-health_resource (*Maximum Cardinality*)<br />
many-many: many users can use different resources<br />
<br />
login_user-Attends-tutoring_service (*Maximum Cardinality*)<br />
many-many: many users can use many different tutoring services<br />
<br />
tutoring_service-Hires-tutor (*Maximum Cardinality*)<br />
1-many: Each tutoring service can hire many different tutors<br />
<br />
login_user-Qualifies For-scholarship (*Maximum Cardinality*) <br />
many-many: many users can apply to many scholarships<br />
<br />
login_user-Applies To-jobs (*Maximum Cardinality*) <br />
many-many: many users can apply to many jobbs<br />
<br />
company-Offers-job_opportunity (*Maximum Cardinality*) <br />
1-many: Each company can offer many opportunities<br />
## Attributes
1. scholarship
   - **scholarship_id**(primary key)(UNIQUE, NOT NULL, INTEGER)
   - award_name(NOT NULL,VARCHAR(100))
   - description(NOT NULL, VARCHAR(500)) 
   - requirement(NOT NULL, VARCHAR(300)) 
   - reward_amount(NOT NULL, DECIMAL(8,2))
   - deadline(NOT NULL, DATETIME)
2. job_opportunity
   - **job_id**(UNIQUE, NOT NULL, INTEGER)
   - job_descripiton(NOT NULL, VARCHAR(500))
   - application_info(NOT NULL, VARCHAR(100))
   - benefit_desciption(NOT NULL, VARCHAR(300))
   - company_id (foreign key)(NOT NULL, INTEGER)
   - salary(NOT NULL, DECIMAL(8,2))
   - position_title(NOT NULL, VARCHAR(100))
3. tutoring_service
   - **service_id**(UNIQUE, NOT NULL, INTEGER)
   - address(NOT NULL, VARCHAR(100))
   - total_tutors(NOT NULL, INTEGER)
   - operation_hours(NOT NULL, VARCHAR(100))
   - service_name(NOT NULL, VARCHAR(300))
   - contact_info(NOT NULL, VARCHAR(300))
4. tutor
   - **tutor_id**(UNIQUE, NOT NULL, INTEGER)
   - fullname(NOT NULL, VARCHAR(100))
   - grade_level(NOT NULL, INTEGER)
   - fee(NOT NULL, DECIMAL(8,2))
   - subject(VARCHAR(100)) 
   - tutor_hours(NOT NULL, VARCHAR(100))
   - service_id (foreign key)(NOT NULL, INTEGER)
   - phone_number(NOT NULL, VARCHAR(100))<br />
5. company
   - **company_id**(UNIQUE, NOT NULL, INT)
   - comp_address(NOT NULL, VARCHAR(200))
   - review(VARCHAR(500))
   - name(NOT NULL, VARCHAR(300))
   - industry(NOT NULL, VARCHAR(100))<br />
6. academic_resource
   - **academic_id**(UNIQUE, NOT NULL, INTEGER)
   - academic_description (NOT NULL, VARCHAR(400))
   - title(NOT NULL, VARCHAR(100))
   - acad_subject(VARCHAR(200))
   - acad_location(NOT NULL, VARCHAR(100))
   - payment_cost(NOT NULL,DECIMAL(8,2))<br />
7. legal_resource
   - **legal_id**(UNIQUE, NOT NUL, INTEGER)
   - resource_location(NOT NULL, VARCHAR(200))
   - resource_name(NOT NULL, VARCHAR(100))
   - contact_information(NOT NULL, VARCHAR(80))
   - cost(NOT NULL, DECIMAL(8,2))
   - legal_description(NOT NULL, VARCHAR(500))<br />
8. health_resource
   - **health_id**(UNIQUE, NOT NULL, INTEGER)
   - contact(NOT NULL, VARCHAR(100))
   - health_type(NOT NULL, VARCHAR(50))
   - location(NOT NULL, VARCHAR(100))
   - service_description(NOT NULL, VARCHAR(500))
   - payment(NOT NULL, DECIMAL(8,2))<br />
9. login_user
   - **user_id**(UNIQUE, NOT NULL, INTEGER)
   - username(UNIQUE, NOT NULL, VARCHAR(50))
   - password(NOT NULL, VARCHAR(50)) 
   - date_time(NOT NULL, DATETIME)

## Dependent entities:
- job_opportunity depends on company (Relationship: company-Offers-job_opportunity)
- tutor depends on tutoring_service  (Relationship: tutoring_service-Hires-tutor)

## Cascade and Restrict Constraints:
- Cascade when company_id and service_id are inserted or deleted
- Restrict when job_id and tutor_id are updated

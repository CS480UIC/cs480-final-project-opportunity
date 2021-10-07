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

## Relationship
login_user-Uses-academic_resource<br />
many-many: many users can use different resources<br />
<br />
login_user-Uses-legal_resource<br />
many-many: many users can use different resources<br />
<br />
login_user-Uses-health_resource<br />
many-many: many users can use different resources<br />
<br />
login_user-Attends-tutoring_service<br />
many-many: many users can use many different tutoring services<br />
<br />
tutoring_service-Hires_tutor<br />
many-many: many tutoring service can hire many different tutors<br />
<br />
login_user-Applies To-scholarship<br />
many-many: many users can apply to many scholarships<br />
<br />
login_user-Applies To-jobs<br />
many-many: many users can apply to many jobbs<br />
<br />
company-Offers-job_opportunity<br />
many-many: many companies can offer many opportunities<br />
## Attribute
1. scholarship
   - **id**(primary key)
   - name
   - description 
   - requirement 
   - award_amount
   - deadline
2. job_opportunity
   - **job_id**
   - job_descripiton
   - application
   - benefit_desciption
   - salary
   - position_title
3. tutoring_service
   - **service_id**
   - location
   - total_tutors
   - operation_hours
   - name
   - contact_info
4. tutor
   - **fullname**
   - grade_level
   - cost
   - subject 
   - contact<br />
5. company
   - **company_id**
   - address
   - review
   - name
   - industry<br />
6. academic_resource
   - **id**
   - description 
   - name
   - subject
   - payment_method<br />
7. legal_resource
   - **rsource_id**
   - location
   - name
   - contact_info
   - cost
   - description <br />
8. health_resource
   - **id**
   - contact
   - health_type
   - location
   - service_description
   - payment<br />
9. login_user
   - **user_id**
   - username
   - password 
   - date_time


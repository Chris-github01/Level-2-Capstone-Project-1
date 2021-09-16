# Level-2-Capstone-Project-1
## Poised Construction Project
### Information for a construction project is uploaded to record persons details and project information
### Persons is divided into three types:
1. Architect
2. Client
3. Contractor
### The information needed for persons is as follow:
* Name
* Telephone Number
* Email Address
* Company Address
### The information needed for the project is as follow:
* Project Number
* Project Name
* Project Type
* Project Address
* ERF Number
* Project Value
* Amount paid to date
* Project Deadline
### This program has two Classes, one for the project information and one for persons information
### *Project Class*
#### The following meatods are in Project Class
* toString
* project_deadline (Used to change the deadline)
* proj_new_amount_paid (Used to update the total amount paid)
### *Person Class*
#### The following meathods are in Person Class
* toString
* phone_num (To update the Contractor's telephone number)
* email_address (To update the Contractor's email address)
### The user is asked to enter the above information and it is printed on the screen
### The following menu 'menu_update' is used to update the information after it is recorded:
1. Change due date
2. Change total amount paid
3. Change contractor's details
4. Finalise project
### *1. Change due date*
#### Method 'proj_deadline' is called from ProjectClass to update the due date
### *2. Change total amount paid*
#### Method 'proj_new_amount_paid' is called from ProjectClass to update the amount paid to date
### *3. Change contractor's details*
#### A second menu 'contractor_info_update' is created to update the following information
1. Update email address (Method 'email_address' is called to update the email address)
2. Update telephone number (Method 'phone_num' is called to update the telephone number)
### *4. Finalise Project*
#### An invoise is generated if the total project fee is outstanding. This inclueds:
* Client name
* Client number
* Client email address
* Client telephone number
* Project due date
* Total amount due

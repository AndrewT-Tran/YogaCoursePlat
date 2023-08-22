Yoga Course Platform
====================

Create a course platform where the users are instructors who can create, read, update and destroy courses.
![1634165479__yoga exam](https://github.com/AndrewT-Tran/JavaBelt/assets/112746783/b2475e5f-64bd-48e7-971e-a183ef255659)


Proficiency Requirements (for a Red Belt):
------------------------------------------

*   Login and Registration with BCrypt or Spring Security
    *   Login/logout feature should ensure that a user cannot access the dashboard unless logged in.
*   CRUD
    *   Display all of the courses with their name, instructor, day of the week, and price. If the logged-in user is the instructor for that course, also display a link to go to an edit page.
    *   Ability to create a new course.
    *   Include a page to show the information of a specific course, it's instructor as well as the course details.
    *   Ability for the logged-in user to update their own courses.
    *   Ability for the logged-in user to delete their own courses.
*   Routing
    *   Follow the ReSTful convention.
*   Validations
    *   Add the correct validations for registration and login.
    *   Add the correct validations for the course on create.
    *   Add the correct validations for the course on update.
*   **_Note: Red belt is 8.0 and above. For a detailed point breakdown see the [full rubric.](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1642190397__JavaRubric.pdf)_**

Additional Mastery Features (toward earning a Black Belt):
----------------------------------------------------------

*   Deployed on Amazon EC2
*   Ensure users are unable to access pages they shouldn't have access to.
*   Include a time field for classes (LocalTime) and validate with annotations. Must not be blank, must be a valid time.
*   Be able to create students to add to a class on the class details page.
*   Be able to add existing students to the class. Note: Students are NOT users, as the users are the instructors. You only need to store a student's name and email. They do not have a password, they do not log in; they are not users.
*   Show a list of all of the students who were added to the class on the class details page.

General Guidelines
------------------

*   Do everything the prompts ask for. Ask your instructor if you are not sure
*   You can download the wireframe here: [courses wireframe](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1634165479__yoga exam.png)
*   You must deploy to earn the Black Belt. For a black belt, assume you need to implement all Mastery features. However, point values vary, so in some cases you still earn a black belt without all, but it will depend on the point allocation. So do the best you can!
*   _**Note: Black belt is 9.5 and above. For a detailed point breakdown see the [full rubric.](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1642190397__JavaRubric.pdf)**_



### _All files must be submitted in order to receive a grade. This includes all files required for the project to run as intended and any extra files the course may require. Failure to include all files will result in the exam not being graded, which may result in an automatic fail for the exam attempt._

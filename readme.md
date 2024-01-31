# Yoga Course Platform Readme

## Overview

This project aims to create a comprehensive course platform tailored for yoga enthusiasts. In this platform, users take on the role of instructors who can create, read, update, and delete courses.

![Yoga Course](https://github.com/AndrewT-Tran/JavaBelt/assets/112746783/b2475e5f-64bd-48e7-971e-a183ef255659)

## Features Implemented

### User Authentication
![CleanShot 2024-01-31 at 11 51 09@2x](https://github.com/AndrewT-Tran/YogaCoursePlat/assets/112746783/288245ee-3d2e-4383-b4cc-9f946ec94b37)

- Utilizes BCrypt or Spring Security for secure user login and registration.
- Ensures that only logged-in users can access the dashboard.

### Course Management (CRUD)
![CleanShot 2024-01-31 at 12 01 57@2x](https://github.com/AndrewT-Tran/YogaCoursePlat/assets/112746783/a0fb2f6e-aad8-4ff9-b9f2-42fd8f531211)

- Allows instructors to view a list of all courses, including their name, instructor, day of the week, and price.
- Instructors can edit their courses, with a convenient link provided.
- Provides the ability to create new courses.
- Offers a detailed course information page, including the instructor and course details.
- Instructors can easily update their courses.
- Allows instructors to delete their courses.

### Routing
- Follows the ReSTful convention for clean and organized routing.

### Validations
- Implements appropriate validations for user registration and login processes.
- Ensures correct validations for course creation and updates.

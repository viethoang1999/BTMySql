CREATE SCHEMA IF NOT EXISTS student_cms_plusplus CHARACTER SET utf8mb4;
 USE student_cms_plusplus;
 
 CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NULL,
    ` mssv` VARCHAR(12) NULL,
    `password` VARCHAR(20) NULL,
    `phone` VARCHAR(20) NULL,
    `address` VARCHAR(70) NULL,
    `age` VARCHAR(3) NULL,
    `email` VARCHAR(70) NULL,
    `created_timstamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ,
    `last_updated_timestamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) 

);
 
 
CREATE TABLE IF NOT EXISTS class (
    id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NULL,
    `major` VARCHAR(30) NULL,
    `total_student` VARCHAR(10) NULL,
    `teacher_name` VARCHAR(50) NULL,
    `teacher_phone` VARCHAR(10) NULL,
    `created_timstamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP (6),
    `last_updated_timestamp` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP (6)
);

create table if not exists class1 as(select * from class);
create table if not exists student1 like student;
use student_cms_plusplus;
CREATE table if not exists student_class(
`student_id` int AUTO_INCREMENT ,
`class_id` int AUTO_INCREMENT 
);
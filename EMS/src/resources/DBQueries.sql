create database EMS;
use EMS;
create table ADMIN(
   USER_NAME varchar(10) PRIMARY KEY,
   NAME varchar(10),
   PHONE_NUMBER varchar(11),
   PASSWORD varchar(10)
);
insert into ADMIN values("zadid-ahsan5274","Zadid Ahsan Nabi","+123456789","123456");
create table EMPLOYEES(
   EMPLOYEE_ID varchar(10) PRIMARY KEY,
   FIRST_NAME varchar(10),
   LAST_NAME  varchar(10),
   EMAIL varchar(10),
   PHONE_NUMBER varchar(11),
   HIRE_DATE DATE,
   JOB_ID varchar(10),
   SALARY INT,
   MANAGER_ID varchar(10),
   DEPARTMENT_ID varchar(7)
);
create table DEPARTMENTS(
   DEPARTMENT_ID varchar(7) PRIMARY KEY,
   DEPARTMENT_NAME varchar(10),
   LOCATION_ID varchar(7)
);
create table COUNTRIES(
   COUNTRY_ID varchar(7) PRIMARY KEY,
   COUNTRY_NAME varchar(10),
   REGION_ID varchar(10)
);
create table JOBS(
   JOB_ID varchar(10) PRIMARY KEY,
   JOB_TITLE varchar(10),
   MIN_SALARY INT,
   MAX_SALARY INT
);
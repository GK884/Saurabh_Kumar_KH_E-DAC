CREATE DATABASE CURSORS;
USE CURSORS;

Create table EMP 
(
EMPNO numeric(4) not null, 
ENAME varchar(30) not null, 
JOB varchar(10), 
MGR numeric(4), 
HIREDATE date, 
SAL numeric(7,2), 
DEPTNO numeric(2) 
);

Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1000,  'Manish' , 'SALESMAN', 1003,  '2020-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1001,  'Manoj' , 'SALESMAN', 1003,  '2018-02-18', 600,  30) ;
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1002 , 'Ashish', 'SALESMAN',1003 , '2013-02-18',  750,  30 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1004,  'Rekha', 'ANALYST', 1006 , '2001-02-18', 3000,  10);
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1005 , 'Sachin', 'ANALYST', 1006 ,  '2019-02-18', 3000, 10 );
Insert into EMP (EMPNO ,ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO ) 
values(1006,  'Pooja',  'MANAGER'  , null, '2000-02-18' ,6000, 10 );
SELECT * FROM EMP;
/*
1.	Write a Procedure that displays names and salaries 
of all Analysts recorded in the “emp” table by making 
use of a cursor.
*/
DELIMITER $$
CREATE PROCEDURE QUES01 (INOUT VAL VARCHAR(20))
BEGIN
	DECLARE EMPNAME VARCHAR(10);
    DECLARE SALARY INTEGER;
    DECLARE FINISHED INTEGER DEFAULT 0;
    DECLARE EMP_CURSOR CURSOR FOR SELECT ENAME, SAL FROM EMP WHERE JOB = 'ANALYST';
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
		OPEN EMP_CURSOR;
        SAURABH : LOOP
			FETCH EMP_CURSOR INTO EMPNAME, SALARY;
            IF FINISHED = 1 THEN
				LEAVE SAURABH;
			ELSE
				SELECT EMPNAME, SALARY;
			END IF;
			ITERATE SAURABH;
		END LOOP SAURABH;
        CLOSE EMP_CURSOR;
END $$

CALL QUES01('ANALYST');s

/*
2.	Write a Procedure to display top 5 employees based 
on highest salary and display employee number, employee 
name and salary using Cursor.
*/
DELIMITER $$
CREATE PROCEDURE DISPLAY()
BEGIN
	DECLARE FLAG INT default 1;
    declare A INTEGER default 0;
    declare B VARCHAR (20);
    DECLARE C INTEGER ;
    DECLARE DISPLAY_CUR CURSOR FOR SELECT EMP_NO, EMP_NAME, SAL FROM EMP order by SAL DESC;
    DECLARE EXIT handler for NOT found SET FLAG = 1;
    OPEN DISPLAY_CUR;
    WHILE(FLAG < 6) DO
		FETCH DISPLAY_CUR into A,B,C;
        SELECT A,B,C;
    END WHILE;
    CLOSE DISPLAY_CUR;
END$$

/*
3.	Write  a procedure to display the concatenated first_name 
and last_name from “emp” table using cursors handle the  
errors with Exit handler
*/





/*
4.	Write a procedure which select all the data from 
employee table and display the data of employee where 
employee name is ‘Manish’ using cursors.
*/




/*
5.	Write a procedure which select delete the data from employee 
table if emp sal is less than 10000  using cursor and handle 
the  Sqlexception with continue handler
*/
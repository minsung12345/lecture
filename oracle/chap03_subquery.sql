-- 서브 쿼리

-- 100번 사원이 소속되어 있는 부서의 부서명을 알아보자.
-- 1) 100번 사원이 소속되어 있는 부서변호를 알아낸다. (employees 테이블)
select department_id from employees where EMPLOYEE_ID =100;
-- 2) 1번에서 알아낸 부서번호의 부서 이를을 알아낸다.
select department_name from departments where department_ID =90;

--서브쿼리를 사용하면--
select department_name from departments 
where department_ID =(select department_id from employees where EMPLOYEE_ID =100);

----사원들이 소속되어 있는 부서의 사번, 이름, 소속 부서명을 출력하자.
--select employee_id ,FIRST_name, department_name from departments join employees
--where department_id = (select department_id from employees);
--위 문장은 에러 : 서브쿼리는 메인 쿼리문의 테이블에 있는 컬럼 정보밖에 얻지 못한다.
--이 문제를 해결하기 위해서는 조인(join)으로 해결해야 한다.

-- executive부서의 국가코드, 주, 시, 도로명 주소를 출력해 보자.
-- location 테이블, departments
-- subquery이용
-- 1) executive부서의 location_id를 조회
select location_id from departments where department_name = initcap('Executive');
-- 2) location_id = 1700인 국가코드, 주, 시, 도로명 주소를 조회
select COUNTRY_ID,STATE_PROVINCE,CITY,STREET_ADDRESS from locations
where location_id = (select location_id from departments where department_name = initcap('Executive'));

-- -----------------------------------------------------------------------------
-- 서브쿼리의 종류
-- -----------------------------------------------------------------------------
-- 1) 단일행 서브쿼리 (single row subquery) : 내부 select 문장으로부터 하나의 행만
-- 반환을 받으며, 연산자로 =, <, >, <=, >=, !=을 사용할 수 있다.
-- 문제) 'diana'와 같은 부서에 다니는 동료들의 모든 정보를 출력하세요
select * from employees
where department_id = (select department_id from employees
where FIRST_NAME  = 'Diana');

-- 사원들의 평균 급여보다 더 많은 급여를 받는 사원의 사번, 이름, 급여를 출력하세요
select EMPLOYEE_ID,FIRST_NAME,SALARY from employees where salary >= (select avg(salary) from employees);

-- 2) 다중행 서브쿼리(multiple-row subquery)
-- : 서브쿼리에서 반환되는 행의 갯수가 2개 이상일 때
-- 다중행 서브쿼리에서 사용하는 연산자
-- 1) in : 메인 쿼리의 비교 조건이 서브쿼리의 결과 중에서 하나라도 일치하면 참.
-- 2) any : 메인 쿼리의 비교조건이 서브쿼리의 결과와 하나 이상이 일치하면 참.
-- 3) all : 메인 쿼리의 비교조건이 서브쿼리의 결과와 모든 값이 일치하면 참.



-- 급여를 7000이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 정보를 출력하세요.
-- 1) 급여를 7000이상 받는 사원이 소속된 부서
select DEPARTMENT_ID  from employees
where salary >= 7000;

-- 2)
select * from employees
where department_id = (select DEPARTMENT_ID  from employees
where salary >= 7000);
-- ORA-01427: single-row subquery returns more than one row

select * from employees
where department_id in(select DEPARTMENT_ID  from employees
where salary >= 7000);

-- all연산자
-- 문제) 30번 부서에 소속된 사원 중에서 급여를 가장 많이 받는 사원보다
-- 더 많이 받는 사원의 이름, 급여를 출력해보자
--방법 1)
select max(salary) from employees where DEPARTMENT_ID = 30; 
select first_name,salary from employees
where salary > (select max(salary) from employees where DEPARTMENT_ID = 30);

-- 방법2)
-- all : 메인 쿼리의 비교조건이 서브쿼리의 결과와 모든 값이 일치하면 참
select salary from employees where DEPARTMENT_ID = 30;
select first_name, salary  from employees 
where salary > all(select salary from employees where DEPARTMENT_ID = 30);

--any : 메인 쿼리의 비교조건이 서브쿼리의 결과와 하나 이상이 일치하면 참.

-- (1) < any()
select first_name, salary from employees where salary < any(4000,6000,9000
,12000);
select first_name, salary from employees where salary > any(4000,6000,9000
,12000);

-- 문제) 30번 부서에 소속된 사원 중에서 급여를 가장 적게 받는 사원보다 더 많이 받는 사원의 이름, 급여를 출력하세요
select first_name,salary from employees
where salary > any(select min(salary) from employees where DEPARTMENT_ID = 30);

-- 다중열 서브쿼리
select * from employees
where (department_id, salary) in(select department_id, max(salary)
from employees GROUP by department_id);

--select절에 사용하는 서브쿼리
select employee_id , first_name, salary, department_id  
,(select department_name from departments where employees.department_id = departments.department_id)
from employees;







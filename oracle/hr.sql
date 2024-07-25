-- select 문으로 특정 데이터를 추출하자.
-- select * | [조회할컬럼명1, 조회할컬럼명2,조회할컬럼명3, ...] 
-- FROM 테이블명;
-- where 조건
select * from countries;

--부서 테이블의 모든 컬럼 조회

select * from departments;

--사원 테이블의 모든 컬럼 조회
select * from employees;

select * from locations;

--사원테이블의 사원 이름만 조회
select FIRST_NAME from employees;

--부서테이블에서 부서명만 조회
select department_name from departments;

--지역 테이블에서 도로명 주소만 조회
select STREET_ADDRESS from LOCATIONS;

--사원테이블에서 사원명과 급여를 조회
select EMPLOYEE_ID,SALARY from EMPLOYEES;

--사원테이블에서 사번, 이름 입사일을 조회
select EMPLOYEE_ID,FIRST_NAME,HIRE_DATE from EMPLOYEES;

-- 2. 컬럼명에 별칭을 지을 수 있다.
-- -- 1) 컬럼명에 별칭을 지으면 컬럼명을 기술한 뒤 컬럼명 뒤에 as라는 키워드를 쓴다.
select first_name as name from employees;
-- -- 2) as 키워드를 생략해도 된다.
select FIRST_name 이름 from employees;
-- -- 3) 별칭에 공백이나 특수문자를 포함하는 경우에는 별칭을 "별칭" (큰따옴표)로 묶는다.
select FIRST_name "이 름" from employees;

-- 3. distinct 중복 결과 하나씩만 출력
select distinct job_id  from jobs;

-- 4. where 절을 사용하여 조건절을 사용할 수 있다.
select *
from employees
where employee_id >= 100;

--조건식에 사용되는 연산자 (>,<,>=,<=,=,!=(NOT Equal) 등)
--사원테이블에서 이름이 adam인 사원의 사번, 이름, 입사일을 조회
--sql에서 문자열이나 날짜를 표현할 때는 '' (작은 따옴표)를 이용한다.
select EMPLOYEE_ID,FIRST_NAME,HIRE_DATE 
from EMPLOYEES 
where first_name = 'Adam'; --문자열은 대소문자 구분

-- 사원테이블에서 급여가 5000이상인 사원들의 사번, 이름, 급여를 조회
select EMPLOYEE_ID,FIRST_NAME,SALARY
from employees
where SALARY>=5000;

--지역테이블 (location)에서 지역번호가 1800번 이하인 지역의 모든 컬럼 조회
select * 
from locations
where location_id<=1800;

--사원테이블에서 입사일이 2002년 이전에 입사한 사원들의 사번,이름,급여,입사일
select EMPLOYEE_ID,FIRST_NAME,SALARY,HIRE_DATE
from employees
where HIRE_DATE<'02/01/01';

-- 2) 조건연산자를 연결할 때 논리연산자 (and,or,not,xor)를 사용할 수 있다.
-- 사번에 130번 보다 작거나 급여가 5000보다 큰 사원들의 사번, 급여를 출력
select employee_id, salary from employees
where employee_id <130 or salary > 5000;

-- 급여가 5000이상이고 부서번호가 30번보다 작은 사원들의 사번, 급여, 부서번호를 출력
select employee_id, salary, department_id from employees 
where salary >= 5000 and department_id <30;

--부서 번호가 100번이 아닌 모든 사원들의 모든 컬럼을 조회
select * from employees
where department_id != 100;

-- 3) between A and B : A이상이고 B이하
select * from employees
WHERE salary between 5000 and 7000;

--입사년도가 2003년에서 2005년인 사원들의 모든 정보를 출력
select * from employees
WHERE hire_date BETWEEN '03/01/01' and '05/12/31';

-- 4) in(A,B,C)연산자 : A또는 B또는 C
select * from employees
where department_id in('10','50','100');
select * from employees
where department_id = 10 or department_id = 50 or department_id = 100;

-- 5) 패턴을 이용하여 검색하는 like 연산자
-- -- 컬럼명 like 패턴 
-- -- -- 패턴은 아래의 2가지를 이용할 수 있다.
-- -- -- -- '%' : 문자가 없거나 하나 이상의 문자가 어떤 값이든 상관없이 검색
-- -- -- -- '_' : 하나의 문자가 어떤 값이 오든 상관없이 검색
-- 이름이 s로 시작하는 모든 사원들의 정보를 출력
select * from employees
where first_name like 'S%';

-- 이름이 n으로 끝나는 모든 사원들의 정보를 출력

select * from employees
where first_name like '%n';

--직무(job_id)가 AN으로 끝나는 모든 사원들의 정보를 출력
select * from employees where job_id like '%AN';

-- 이름의 끝에서 두번쨰 글자가 a인 사원들의 모든 정보를 출력
select * from employees where first_name like '%a_';

--이름의 세번째 글자가 r인 사원들의 모든 정보를 출력
select * from employees where first_name like '__r%';

--직무 (job_id)에 _가 포함된 사원들의 모든 정보를 출력
select * from employees where job_id like '%_%';

-- 6) null을 위한 연산자
-- 커미션(commission_pct)을 받는 사원의 모든 정보를 출력
--is null (null과 같다), is not null (null과 같지 않다)
--select * from employees where commission_pct != null;
select * from employees where commission_pct is not null;

-- 7) 정렬을 하기 위해서는 order by 절을 사용한다.
-- 사원들의 급여 내림차순으로 모든 사원들의 정보를 출력
--정렬기준은 오름차순 (asc), 내림차순 (desc)를 사용하되, 오름차순일 경우 asc는 생략가능 
select * from employees order by salary desc; 

-- 정렬은 ,(콤마)로 구분하여 여러개를 사용할 수 있다.
-- 부서번호가 50번인 사원들의 모든 정보를 출력하되,
-- 급여 오름차순으로 정렬하고, 급여가 같을 경우 이름 내림차순으로 정렬하자.
select * from employees where department_id = 50 order by salary, first_name desc;



-- 조인 (join)
-- 두개 이상의 테이블에서 결과를 얻기 위한 sql문

-- 사번이 100번인 사원의 정보(사번, 이름, 부서번호)와 그가 속한 부서명까지 출력
select employee_id, first_name, employees.department_id, department_name
from employees, departments
where employees.department_id = departments.department_id
and employee_id = 100;

-- 문제) CEO가 휴가철을 맞이하여 모든 직원에게 선물을 택배로 보내려 한다.
-- 모든 직원들이 택배를 무사히 받을 수 있도록
-- 사무실의 주소, 사원 정보 출력

select e.first_name || ''|| e.last_name,e.PHONE_NUMBER,d.DEPARTMENT_NAME,
l.STREET_ADDRESS,l.POSTAL_CODE,l.CITY,l.STATE_PROVINCE,c.COUNTRY_NAME,r.REGION_NAME
from employees e, departments d, locations l, countries c, regions r
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.country_id = c.country_id
and c.region_id = r.region_id;

-- -----------------------------------------------------------------------------
-- 조인의 종류
-- -----------------------------------------------------------------------------
-- 1) Cross Join(교차 조인): 단순하게 두개 이상의 테이블을
-- 곱연산 결과를 냄.
-- 조인 조건에 해당하는 where절이 존재하지 않기 때문에,
-- 테이블간의 관계를 파악해서 조인하지 않음.
select * from employees, departments;
select count(*) from employees, departments;
select count(*) from employees;
select count(*) from departments;
select 107 * 27 from dual;

-- 2) equi join (등가 조인, equal join) : 가장 많이 사용되는 조인
-- 조인 대상이 되는 테이블에서 공통적으로 존재하는 컬럼을 연결 ("="로 연결)하여
-- 결과를 생성하는 조인.
select e.first_name, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

-- 조인 문장이 지켜야 할 조건
-- 1) 기본키 (primary key)와 외래키(foreign key)컬럼을 통해서 서로 다른 테이블을 연결한다.
-- 2) where 절을 사용하여 조인 조건을 기술한다. (조인조건의 갯수 = 연결하는 테이블 수 - 1)
-- 3) 명확성을 위해 컬럼명 앞에 테이블 별칭을 기술한다.

-- 3) Non-Equi Join (비등가 조인)
-- : 조인할 테이블 사이의 컬럼 값이 직접적으로 일치하지 않을 때 사용하는 조인
select e.empno, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

-- 4)Self Join 
-- 하나의 테이블에서 조인을 하여 원하는 데이터를 얻는 조인
select worker.employee_id,worker.first_name || '의 직속상사는 ' || manager.first_name || '입니다.' as 직속상사
from employees worker, employees manager
where worker.manager_id = manager.employee_id
order by worker.employee_id ;

-- 5) outer join (외부 조인)
-- : 행이 조인 조건에 만족하지 않는 경우, 그 행은 조인 결과에 나타나지 않는다.
-- 그러나 가끔 조인 조건에 만족하지 않는 행들도 나타내기 위해 outer join을 사용해야 할 때가 있다.
-- left outer join (왼쪽 외부 조인)
select e.first_name, d.department_name 
from employees e,departments d
where e.department_id = d.department_id;
-- 위에 결과에는 178번 kimberly 사원이 부서 번호가 null이라 누락되어 있다.
-- 아무 부서에도 배치되지 않은 178번 사원의 정보까지 출력하고 싶다면,
-- 아래처럼 outer join사용한다.
select e.first_name, d.department_name 
from employees e,departments d
where e.department_id = d.department_id(+);

-- ANSI Join : ANSI(미국 표준 연구소)에서 제정한 다른 DBMS와의 호환성을 위해 만든 것
-- 1) ANSI Cross join
select * from employees cross join departments;

-- 2) ANSI INNER JOIN : EQUI JOIN과 동일
select e.first_name, d.department_name
from employees e join departments d
on e.department_id = d.department_id;

select count(*)
from employees e join departments d
on e.department_id = d.department_id;

select e.first_name, d.department_name
from employees e join departments d
on e.department_id = d.department_id
where first_name like '%n';

--using() 절을 이용하여 join 조건을 지정하기.
-- 조인되는 컬럼명이 동일해야하고, using()절에는 테이블 별칭이
select e.first_name, d.department_name
from employees e join departments d
using(department_id);



select e.first_name, d.department_name
from employees e join departments d
using(e.department_id);

--natural join
-- 조인이 되는 컬렴명이 동일할 때,
-- DBMS가 알아서 테이블을 살펴보고 동일한 컬럼으로 inner join 진행
-- 단, 동일한 컬럼명이 2개 이상 나오면 and 조건으로 inner join을 진행
select e.employee_id, e.first_name, d.department_name
from employees e natural join departments d;

-- 3) ANSI outer join
-- 왼쪽 테이블에 누락된 정보를 보임
select e.first_name, d.department_name 
from employees e left join departments d
on e.department_id = d.department_id;
-- 오른쪽 테이블에 누락된 정보를 보임
select e.first_name, d.department_name 
from employees e right join departments d
on e.department_id = d.department_id;

-- 양쪽 테이블에 누락된 정보를 모두 보임
select e.first_name, d.department_name 
from employees e full join departments d
on e.department_id = d.department_id;
-- -----------------------------------------------------------------------------
-- 연습문제
-- -----------------------------------------------------------------------------
1. 급여가 3000에서 5000사이인 직원의 이름과 소속 부서명을 출력
select e.ENAME,d.DNAME
from emp e join dept d
on e.deptno = d.deptno
and e.sal between 3000 and 5000;
2. 직급이 manager인 사원의 이름, 부서명을 출력하세요
select e.ENAME,d.DNAME
from emp e join dept d
on e.deptno = d.deptno
and e.job = upper('manager');
3. accounting 부서 소속 사원의 이름과 입사일 출력하세요
select e.ename, e.hiredate,d.dname
from emp e join dept d
on e.deptno = d.deptno
and d.dname = upper('accounting');

4. 커미션을 받는 사원의 이름과 그가 속한 부서명을 출력
select e.ename,d.dname
from emp e join dept d
on e.deptno=d.deptno
and comm is not null;

5. 뉴욕에서 근무하는 사원의 이름과 급여를 출력
select e.ename, e.sal,d.loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
and loc = 'NEW YORK';
6. 급여가 1200 이하인 사원 이름과 급여와 그가 근무하는 근무지를 출력하세요
select e.ename, e.sal, d.loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
and e.sal <=1200;
7. smith와 동일한 근무지에서 근무하는 사원의 이름을 출력하세요
select e.ename, d.loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
and d.loc =
(select d.loc
from emp e join dept d
on e.DEPTNO = d.DEPTNO
and e.ename = upper('smith'))
and e.ename != upper('smith');


8. 매니저가 king인 사원들의 이름과 직급을 출력하세요
select ename, job
from emp
where mgr = (select empno from emp where ename = upper('king'));
9. 월급이 2000 초과인 사원들의 부서번호, 부서이름, 사원번호, 사원이름, 월급을 출력하세요
select d.deptno, d.dname, e.empno,e.ename,e.sal
from dept d join emp e
on d.deptno = e.deptno
where e.sal > 2000;
10. 각 부서별 평균 급여, 최대급여, 최소급여, 사원수를 출력하되, 부서번호, 부서이름도 같이 출력하세요.
select round(avg(e.sal),2),max(e.sal),min(e.sal),count(*),d.deptno,d.dname
from emp e join dept d
on e.deptno = d.deptno
group by d.deptno,d.dname;
11. 모든 부서 정보와 사원 정보를 부서번호, 사원 이름순으로 정렬하여 출력하세요
select d.deptno,d.dname,e.empno,e.ename
from emp e join dept d
on e.deptno=d.deptno
order by d.deptno,e.ename;
12. 모든 부서 정보, 사원 정보, 급여 등급 정보, 각 사원의 매니저의 정보를 
 부서번호, 사원 번호 순서로 정렬하여 다음과 같이 출력하세요.
부서번호, 부서이름, 사원번호, 사원이름, losal, hisal, grade, 매니저번호, 매니저이름
select d.deptno,d.dname,e.empno,e.ename,s.grade,e.mgr AS 매니저번호,
(SELECT A.ename FROM emp A WHERE A.empno = e.mgr) AS 매니저이름
from emp e right join dept d 
on e.deptno=d.deptno 
left join salgrade s on (sal between s.losal and s.hisal)
order by d.deptno,e.ename;
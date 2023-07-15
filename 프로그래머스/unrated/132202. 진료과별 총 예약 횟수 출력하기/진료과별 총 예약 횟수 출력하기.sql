-- 코드를 입력하세요
SELECT mcdp_cd as "진료과코드", count(*) as "5월예약건수"
from APPOINTMENT
where TO_CHAR(apnt_ymd, 'mm') = '05'
group by mcdp_cd
order by count(*),"진료과코드"

-- 코드를 입력하세요
SELECT to_number(to_char(datetime,'hh24')) as hour,count(*) as count 
from animal_outs 
where to_char(datetime,'hh24') >8 and  to_char(datetime,'hh24') <20
group by to_char(datetime,'hh24')
order by hour


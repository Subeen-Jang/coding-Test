-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF f INNER JOIN ICECREAM_INFO i on  f.FLAVOR= i.FLAVOR
group by INGREDIENT_TYPE
order by TOTAL_ORDER
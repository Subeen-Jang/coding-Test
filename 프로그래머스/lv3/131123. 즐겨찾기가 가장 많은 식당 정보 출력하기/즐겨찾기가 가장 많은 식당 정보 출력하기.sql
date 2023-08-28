-- 코드를 입력하세요
SELECT a.food_type, b.rest_id, b.rest_name,a.favorites
from (select food_type, max(favorites) favorites 
      from rest_info 
      group by food_type) a, rest_info b
where a.food_type = b.food_type and
      a.favorites = b.favorites
order by food_type desc
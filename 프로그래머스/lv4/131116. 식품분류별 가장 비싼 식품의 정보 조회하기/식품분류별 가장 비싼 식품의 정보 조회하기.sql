-- 코드를 입력하세요
SELECT b.category, a.max_price, b.product_name
from (select category, max(price) as max_price 
      from food_product 
      group by category
     having category in ('과자','국','김치','식용유'))a inner join food_product b
on a.max_price = b.price and a.category = b.category
order by max_price desc
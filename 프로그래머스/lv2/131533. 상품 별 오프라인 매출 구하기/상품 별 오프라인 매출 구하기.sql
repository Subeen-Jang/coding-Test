-- 코드를 입력하세요
SELECT p.product_code,sum(price*sales_amount) sales
from product p, offline_sale o 
where  p.product_id = o.product_id
group by p.product_code,price
order by sales desc, product_code
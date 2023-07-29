-- 코드를 입력하세요
SELECT trunc(price,-4) as product_group, count(*) as products
from product
group by trunc(price,-4)
order by product_group
-- 코드를 입력하세요
SELECT a.cart_id
from (
    select cart_id, name
    from cart_products
    group by cart_id,name
    having name = 'Milk'
)a join 
(
    select cart_id, name
    from cart_products
    group by cart_id,name
    having name = 'Yogurt'
)b
on a.cart_id = b.cart_id
order by cart_id
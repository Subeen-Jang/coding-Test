-- 코드를 입력하세요
SELECT category, sum(sales) as total_sales
from book a join book_sales b
on a.book_id = b.book_id
where to_char(sales_date,'mm') = '01'
group by category
order by category 
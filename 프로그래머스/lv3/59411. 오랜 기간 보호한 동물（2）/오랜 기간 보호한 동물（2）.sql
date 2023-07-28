-- 코드를 입력하세요
select *
from (
    select a.animal_id, a.name
    from animal_ins a inner join animal_outs b
    on a.animal_id = b.animal_id
    order by (b.datetime-a.datetime+1) desc
)
FETCH first  2 ROWS ONLY
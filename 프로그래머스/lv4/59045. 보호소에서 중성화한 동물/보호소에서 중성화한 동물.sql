-- 코드를 입력하세요
SELECT b.animal_id, b.animal_type, b.name
from animal_ins a  join animal_outs b 
on a.animal_id = b.animal_id
where sex_upon_intake like "Intact%" 
        and sex_upon_outcome not like "Intact%"
order by animal_id
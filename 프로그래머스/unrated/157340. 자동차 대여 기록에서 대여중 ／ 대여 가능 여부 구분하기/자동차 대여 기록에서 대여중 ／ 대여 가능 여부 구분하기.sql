-- 코드를 입력하세요
SELECT car_id, max(availability) as availability
FROM (
SELECT
    car_id,
    CASE WHEN
        start_date <= to_date('20221016','yyyymmdd')
        AND end_date >= to_date('20221016','yyyymmdd')
        THEN '대여중'
        ELSE '대여 가능' END AS availability
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY)
GROUP BY car_id
ORDER BY car_id desc
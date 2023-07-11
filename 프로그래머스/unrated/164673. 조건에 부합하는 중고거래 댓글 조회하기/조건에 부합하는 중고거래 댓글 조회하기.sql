SELECT a.title,
        a.board_id, 
        b.reply_id, 
        b.writer_id, 
        b.contents, 
        to_char(b.created_date,'yyyy-mm-dd') as created_date
FROM used_goods_board a RIGHT OUTER JOIN used_goods_reply b
ON a.BOARD_ID = b.BOARD_ID
where a.created_date > to_date('20220930','yyyy-mm-dd') and a.created_date < to_date('20221101','yyyy-mm-dd')
order by b.created_date, a.title


-- SELECT B.TITLE AS TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, TO_CHAR(R.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
-- FROM USED_GOODS_REPLY R LEFT OUTER JOIN USED_GOODS_BOARD B
-- ON R.BOARD_ID = B.BOARD_ID
-- WHERE B.CREATED_DATE > TO_DATE('20220930', 'YYYY-MM-DD') AND B.CREATED_DATE < TO_DATE('20221101','YYYY-MM-DD') 
-- ORDER BY R.CREATED_DATE ASC, B.TITLE ASC;
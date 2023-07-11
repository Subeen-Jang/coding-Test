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
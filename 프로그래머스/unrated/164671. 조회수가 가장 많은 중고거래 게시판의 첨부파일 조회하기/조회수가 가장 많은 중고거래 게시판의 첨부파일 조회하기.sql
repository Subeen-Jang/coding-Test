-- 코드를 입력하세요
SELECT '/home/grep/src/'|| b.board_id || '/'||file_id || file_name || file_ext as file_path
FROM used_goods_board a inner join used_goods_file b
on a.board_id = b.board_id
where views = (select max(views) from used_goods_board) 
order by file_id desc


-- 코드를 입력하세요
SELECT a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from  appointment a LEFT JOIN patient p
    on a.pt_no = p.pt_no
    LEFT JOIN doctor d
    on a.mddr_id= d.dr_id 
where apnt_cncl_yn = 'N' and
      a.mcdp_cd ='CS' and
      to_char(apnt_ymd, 'yyyy-mm-dd') = '2022-04-13'
order by apnt_ymd
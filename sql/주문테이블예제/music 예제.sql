/* select [ all | distinct ] 속성1, 속성2, ... 속성n from 테이블1
				[join 테이블2 on 테이블1.속성명 = 테이블2.속성명]
				[where 조건]
                [group by 속성명]
                [order by 속성명1 [asc|desc], 속성명2 [asc|desc]};
*/
-- 소녀시대가 부른 노래를 검색할 때 필요한 쿼리문
/* singer 테이블(가수이름), sourse 테이블(노래명), sing 테이블(가수번호, 음원번호) */
-- 소녀시대(가수명) -> 가수 테이블 -> singer 테이블 -> 가수번호 가수명
-- 가수와 음원이 들어간 테이블 -> sing 테이블 -> 음원번호 가수번호
-- 노래(음원제목 so_title ) -> 음원 테이블 -> source 테이블 -> 음원제목, 음원번호
/*
select so_title from singer
 join sing
	on si_num = sn_so_num
 join `source`
	on so_num = sn_so_num
 where si_name = '소녀시대'; */
 -- 소녀시대의 멤버들을 검색하기 위한 쿼리문
 /* 가수테이블, 아티스트테이블, 가수에포함된아티스트 테이블  */
/*
select ar_name from singer
	join `member`
		on me_si_num = si_num
	join artist
		on ar_num = me_ar_num
where si_name = '소녀시대'; */
-- 소녀시대의 3집 앨범의 수록곡들을 확인하기 위한 쿼리문
-- 필요정보 : 소녀시대-앨범에포함된가수 // 앨범에포함된가수-앨범 // 앨범 - 앨범에포함된 음원 // 앨범에포함된음원 - 음원
-- 확인정보 : 음원
 /*
select so_title from singer
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where si_name = '소녀시대' and al_title like '%3집%'; */    
    /*
select so_title from (select * from singer where si_name = '소녀시대' ) as singer_search
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where si_name = '소녀시대' and al_title like '%3집%'; */
    
-- 노래 제목에 거짓말이 들어간 노래를 확인하는 쿼리문
-- 필요정보 음원 테이블
-- 확인정보 제목에 거짓말이 들어간 노래 제목
select so_title from `source` where so_title like '%거짓말%';

-- 노래 제목 또는 가사에 거짓말이 포함된 노래를 확인하는 쿼리문
-- 필요정보 : 음원테이블
-- 확인정보 : 제목 또는 가사에 거짓말이 들어간 노래
select so_title from `source` where so_title like '%거짓말%' or so_lyric like '%거짓말%';

-- sm 소속 아티스트 목록을 확인하는 쿼리문
-- 필요정보 : 소속사(아티스트 테이블), 아티스트(아티스트 테이블)
-- 확인정보 : 아티스트 목록
select ar_name from artist where ar_agency='sm';

-- 태연이 활동한 그룹들을 확인하는 쿼리문
-- 필요정보 : 태연(아티스트 테이블), 태연이 활동한 그룹(멤버 테이블), 그룹들(싱어 테이블)
-- 확인정보 : 그룹들(가수테이블)
select si_name from artist
	join `member`
		on me_ar_num = ar_num
	join singer
		on si_num = me_si_num
where ar_name like '%태연%';

-- 태연이 피쳐링한 노래들을 확인하는 쿼리문
-- 필요정보 : 가수 태연(가수 테이블), 태연이 피쳐링여부(싱 테이블) 피쳐링한 음원(소스 테이블)
-- 확인정보 : 노래들(소스테이블)
select * from singer
	join sing
		on sn_si_num = si_num
	join `source`
		on so_num=_sn_so_num
where si_name like '%태연%' and sn_featuring = 'Y';

-- 소녀시대의 메인 타이틀 곡들을 확인하는 쿼리문
-- 필요정보 : 가수 소녀시대(가수 테이블), 앨범에포함된가수(이슈테이블), 앨범에포함된음원(리스트테이블), 타이틀곡제목(소스테이블)
-- 확인정보 : 타이틀곡제목(소스테이블)
select so_title from singer
	join issue
		on is_si_num = si_num
	join `list`
		on li_al_num=is_al_num
	join `source`
		on so_num=li_so_num
where si_name like '%소녀시대%' and li_main = 'Y';

select so_title from singer
	join sing
		on si_num = sn_si_num
	join `source`
		on so_num = sn_so_num
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where si_name = '소녀시대' and li_main = 'Y';
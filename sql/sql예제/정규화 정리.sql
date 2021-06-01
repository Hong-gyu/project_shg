/* 정규화 : 데이터베이스를 효율적으로 관리하기 위해 데이터 중복을 제거하면서 무결성을 유지하기 위한 기법(쪼개기)
	제1정규화 : 속성의 값이 원자값을 갖도록 테이블을 분해
    제2정규화 : 완전 함수 종속을 만족하도록 테이블을 분해
			  기본키의 부분집합으로 속성을 검색하면 안된다
	제3정규화 : 이행종속을 제거하도록 테이블을 분해 (이행종속 : A->B 확인, B->C 확인 => A->C 확인 성립)
 */
 /* 반정규화 : 정규화로 인해 테이블이 너무 많아서 검색할 때 너무 많은 join이 필요한 경우 반정규화를 활용하여 테이블의 속성을 추가할 수 있음 */
 /* 소녀시대가 부른 노래 검색 */
 -- sing 테이블에 가수이름을 저장하는 sn_si_name을 추가하여(반정규화) 쿼리문 작성
 select so_title from sing
	join `source`
		on so_num = sn_so_num
	where sn_si_name = '소녀시대';
-- 소녀시대 3집 앨범의 수록곡을 확인하기 위한 쿼리문 
-- list 테이블에 가수 이름을 저장하는 li_st_name을 추가하여(반정규화) 쿼리문 작성
select so_title from `source`
	join `list`
		on so_num = li_so_num
	join album
		on al_num = li_al_num
	where li_si_name = '소녀시대' and al_title like '%3집%';
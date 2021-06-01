update professor
	set
		pr_pw = 'abc123';
select * from professor;
-- P2000135001 교수의 이름을 고길동으로 수정 홍길동 임꺽정 이순신 논개
update professor
	set pr_name = '고길동'
	where pr_num='p2000135001';

create table if not exists portal.board(
	bd_num int auto_increment,
    bd_title varchar(50) not null,
    bd_is_del char(10) not null default 'N',
    primary key(bd_num)
);
-- 게시글 5개 등록
insert into board(bd_title)
	values('제목1'),('제목2'),('제목3'),('제목4'),('제목5');
select * from board;
-- 1번 게시글 삭제
update board set bd_is_del = 'Y' where bd_num = 1;
-- 삭제 되지 않은 게시글 검색
select * from board where bd_is_del = 'N';


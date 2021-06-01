/* 
SQL - DDL, DML, DCL
	DDL - create, alter, drop
    DML(CRUD) - insert, select,  update, delete
		insert into 테이블명 ( 속성1, 속성2, ... 속성# )
			values ( 속성1 값, 속성2 값, ... 속성# 값 ), ( 속성1 값, 속성2 값, ... 속성# 값 ), ( 속성1 값, 속성2 값, ... 속성# 값 );
		select (all | distinct) 속성1, 속성2, ... 속성# from 테이블명
			(where 조건)
            (group by 속성 (havind 조건))
            (order by 속성 (desc | asc));
		update 테이블명 
            set 
				속성1 = 값1,
                속성2 = 값2,
                ...,
                속성# = 값#
			(where 조건);
			- update문은 조건이 없으면 모든 튜플에 대해 수정을 적용
            - update문에 조건절을 생략하면 mysql 워크벤치에서는 안정성을 위해 update문을 실행하지 않음
             -> 실행하려면 워크벤치 기본 설정을 변경해야 함
			- 단, 워크벤치가 아닌 MySQL 8.0 Command Like Client 로 접속해서 해당 쿼리를 실행하면 설정에 상관없이 실행 됨
		delete from 테이블면 (where 조건);
			- 해당 조건을 만족하는 튜플을 삭제
            - 조건이 생략되면 전체 튜플을 삭제
	DCL - 데이터 제어, grant, revoke, commit, rollback
		grant  : 특정 데이터베이스 사용자에게 권한 부여
        revoke : 특정 데이터베이스 사용자에게 권한을 회수
        commit : 트랜잭션의 작업이 정상적으로 완료됨을 알려줌
        rollback : 트랜잭션 작업이 비정상적으로 완료 되었을 때 복구
*/

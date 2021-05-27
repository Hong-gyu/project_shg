package day22;

public class MySQL {

	public static void main(String[] args) {
		/* 명령어 
		 * show databases; - 현재 만들어져 있는 데이터베이스들을 확인
		 * use 데이터베이스명; - 해당 데이터베이스를 선택
		 * show tables; - 선택된 데이터베이스에 있는 테이블들을 보여줌
		 * create database 데이터베이스명; - 새로운 데이터베이스 생성
		 * create table 테이블_이름 ( );
		 *  
		 * 예시) 대학생 테이블을 만드는 쿼리문(DDL)
		 * create table student(
		 * 		st_num varchar(10) not null,
		 * 		st_id varchar(15) not null,
		 * 		st_res_num varchar(14) not null,
		 * 		st_pw varchar(255) not null,
		 * 		st_dep varchar(20) not null default '컴퓨터공학',
		 * 		st_name varchar(30) not null,
		 * 		primary key(st_num),
		 * );
		 * not null -> 필수항목
		 * 
		 * desc 테이블명; - 해당 테이블의 속성 정보를 자세히 보여준다
		 * 
		 * 
		 * foreign key(속성이름)
		 * 
		 * on update|delete
		 * cascade : 참조되는 테이블에서 데이터를 삭제/수정하면 참조하는 테이블에서도 삭제와 수정이 같이 이루어짐
		 * set null : 참조되는 테이블에서 데이터를 삭제/수정하면 참조하는 테이블의 데이터를 null로 변경
		 * no action : 참조되는 테이블에서 데이터를 삭제/수정하면 참조하는 테이블의 데이터는 수정/변경되지 않음
		 * set default : 참조되는 테이블에서 데이터를 삭제/수정하면 참조하는 테이블의 데이터를 기본값으로 변경
		 * restrict : 참조하는 테이블에 데이터가 남아있으면, 참조되는 테이블의 데이터를 수정/삭제할 수 없다 
		 * 
		 * AI : Auto Increment, 기본키에 설정하는 속성으로 기본키의 값이 차례대로 1씩 증가하는 경우 체크
		 * 		기본값이 가장 큰 수 보다 1증가된 수가 입력된
		 *  */ 

		// SQL
		/* DDL(데이터 정의어)
		 * create : 테이블/데이터베이스 생성
		 * alter : 테이블 정보 수정
		 * drop : 테이블/데이터베이스 삭제
		 * 
		 * DML(데이터 조작어)
		 * insert : 테이블에 데이터 추가
		 * 
		 * DCL(데이터 제어어)
		 *  */
	}

}

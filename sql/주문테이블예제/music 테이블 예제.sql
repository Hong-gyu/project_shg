/* 음악 차트를 관리하는 사이트를 구축하려고 한다.
이 때 필요한 테이블을 정리해보세요.(순위x)

xxx 테이블
 - 번호 : xx_num */

-- create database if not exists music;
-- use music
-- select * from music;
/*
가수 테이블(소녀시대와 같은 그룹 포함) - singer
 - 가수번호(기본키), 가수명, 데뷔년도, 소속사 등
 - 가수번호 : si_num, int, auto_increment, primary key, 
 - 가수명 : si_name, varchar(50)		* varchar(길이가정해져있지않음) vs char(길이가정해져있음)
 - 데뷔년도 : si_start_year, int
 - 소속사 : si_agency, varchar(30)
 */
/*
create table if not exists singer(
 si_num int auto_increment, -- auto_increment -> 기본키에만 가능
 si_name varchar(50),
 si_start_year int,
 si_agency varchar(30),
 primary key(si_num),
 check(si_start_year>=0 and si_start_year <=9999)
); */
/* 아티스트 테이블(태연, 유리 와 같은 각각의 아티스트) - artist
 - 아티스트번호(기본키), 아티스트명, 생일, 현재소속사, 본명 등
 - 아티스트번호 : ar_num
 - 생일 : ar_birthday
 - 현재소속사 : ar_agency
 - 아티스트명 : ar_name
 - 본명 : ar_rname */
 /* 
create table if not exists artist (
	ar_num int auto_increment,
	ar_birthday datetime not null,
    ar_agency varchar(30),
    ar_name varchar(50) not null,
    ar_rname varchar(30) not null,
    primary key(ar_num)
); */
/* 가수에포함된아티스트 테이블(소녀시대에 태연이 소속, 태티서에 태연이 소속) - member
 - 멤버번호(기본키), 가수번호, 아티스트번호, 포지션(담당역할) 등
 - 멤버번호 : me_num, int auto_increment
 - 가수번호 : me_si_num
 - 아티스트번호 : me_ar_num
 - 포지션 : me_position */
/*
create table if not exists member (
	me_num int auto_increment,
    me_si_num int not null,
    me_ar_num int not null,
    me_position varchar(20),
    primary key(me_num),
    foreign key(me_si_num) references singer(si_num),
    foreign key(me_ar_num) references artist(ar_num)
); */
/* 음원 테이블 - sourse
 - 음원번호, 제목, 가사, 공개일, 작곡가, 작사가 등
 - 음원번호 : so_num int auto_increment,
 - 제목 : so_title varchar(50) not null,
 - 가사 : so_lyric longtext not null,
 - 공개일 : so_public_day datetime not null, 
 - 작곡가 : so_songwriter varchar(50) not null
 - 작사가 : so_lyricist varchar(50) not null */
/*
create table if not exists source (
	so_num int auto_increment,
    so_title varchar(50) not null,
    so_lyric longtext not null,
    co_public_day datetime not null,
    so_songwriter varchar(50) not null,
    so_lyricist varchar(50) not null, 
    primary key(so_num)
); */
/* 음원에포함된가수 테이블 - sing
 - 음포가번호, 음원번호, 가수번호, 피처링여부 등
 - 음포가번호 : sn_num int auto_increment
 - 음원번호 : sn_so_num int not null
 - 가수번호 : sn_ar_name int not null
 - 피처링여부 : sn_featuring char(1) not null */
 create table if not exists sing (
	sn_num int auto_increment,
    sn_so_num int not null,
    sn_si_num int not null,
    sn_featuring char(1) not null,
    primary key(sn_num),
    foreign key(sn_so_num) references `source` (so_num),
    foreign key(sn_si_num) references singer(si_num)
);
/* 앨범 테이블 - album
 - 앨범번호, 앨범명, 발매일 등
 - 앨범번호 : al_num int auto_increment
 - 앨범명 : al_title varchar(50) not null,
 - 발매일 : al_issue_date date */
/*
create table if not exists album(
	al_num int auto_increment,
    al_title varchar(50) not null,
    al_issue_date date,
    primary key (al_num)
); */
/* 앨범에포함된가수 테이블 - issue
 - 앨포가번호, 앨범번호, 가수번호 등
 - 앨포가번호 is_num
 - 앨범번호 : is_al_num 외래키 not null,
 - 가수번호 : is_si_num 외래키 not null, */
/*
create table if not exists issue (
	is_num int auto_increment,
    is_al_num int not null,
    is_si_num int not null,
    primary key(is_num),
    foreign key(is_al_num)references album(al_num),
    foreign key(is_si_num)references singer(si_num)
); */ 
/* 앨범에포함된음원 테이블 - list
 - 앨포음번호, 앨범번호, 음원번호, 대표곡여부
 - 앨포음번호 : li-num auto_increment
 - 앨범번호 : li_al_num int 외래키 not null,
 - 음원번호 : li_so_num int 외래키 not null,
 - 대표곡여부 : li_main char(1) */
/*
create table if not exists list (
	li_num int auto_increment,
    li_al_num int not null,
    li_so_num int not null,
    li_main char(1),
    primary key(li_num),
    foreign key(li_al_num) references album(al_num),
    foreign key(li_so_num) references `source`(so_num)
); */
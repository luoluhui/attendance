CREATE TABLE tb_user(
    user_id BIGINT NOT NULL AUTO_INCREMENT COMMENT'用户id',
    username VARCHAR(50) NOT NULL COMMENT'用户名',
    passwords VARCHAR(50) NOT NULL COMMENT'密码',
    PRIMARY KEY(user_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'用户信息表';

CREATE TABLE attend(
    attend_id BIGINT NOT NULL AUTO_INCREMENT COMMENT'考勤id',
    uid BIGINT NOT NULL COMMENT'用户id',
    attend_date DATE NOT NULL COMMENT'考勤日期',
    attend_week TINYINT NOT NULL COMMENT'星期',
    fisrt_clock_in DATETIME COMMENT'首次打卡时间',
    end_clock_in DATETIME COMMENT'末次打卡时间',
    attend_status TINYINT NOT NULL COMMENT'考勤状态：1，正常；2，异常',
    absenteeism INT COMMENT'缺勤时长',
    PRIMARY KEY(attend_id),
    CONSTRAINT attend_user_fk FOREIGN KEY(uid) REFERENCES tb_user(user_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT'考勤信息表'
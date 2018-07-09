package com.luolh.attend.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 考勤信息表
 * created by luolh on 20180706
 */
public class Attend {

    private long attendId;

    private long uid;

    private LocalDate attendDate;

    private byte attendWeek;

    private LocalDateTime firstClockIn;

    private LocalDateTime endClockIn;

    private byte attendStatus;

    private int absenteeism;

    public long getAttendId() {
        return attendId;
    }

    public void setAttendId(long attendId) {
        this.attendId = attendId;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public LocalDate getAttendDate() {
        return attendDate;
    }

    public void setAttendDate(LocalDate attendDate) {
        this.attendDate = attendDate;
    }

    public byte getAttendWeek() {
        return attendWeek;
    }

    public void setAttendWeek(byte attendWeek) {
        this.attendWeek = attendWeek;
    }

    public LocalDateTime getFirstClockIn() {
        return firstClockIn;
    }

    public void setFirstClockIn(LocalDateTime firstClockIn) {
        this.firstClockIn = firstClockIn;
    }

    public LocalDateTime getEndClockIn() {
        return endClockIn;
    }

    public void setEndClockIn(LocalDateTime endClockIn) {
        this.endClockIn = endClockIn;
    }

    public byte getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(byte attendStatus) {
        this.attendStatus = attendStatus;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    @Override
    public String toString() {
        return "Attend{" +
                "attendId=" + attendId +
                ", uid=" + uid +
                ", attendDate=" + attendDate +
                ", attendWeek=" + attendWeek +
                ", firstClockIn=" + firstClockIn +
                ", endClockIn=" + endClockIn +
                ", attendStatus=" + attendStatus +
                ", absenteeism=" + absenteeism +
                '}';
    }
}

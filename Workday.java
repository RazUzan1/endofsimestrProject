package com.company;


public class Workday {
    private Date date;
    private Time start;
    private Time end;

    public Workday(Date date) {
        this.date = date;
        start = new Time(9, 00);
        end = new Time(17, 00);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    double workTime() {
        double t = 0.0;
        t = (start.hour - end.hour + start.minute - end.minute);
        return t;
    }

    Boolean isExtra() {
        if (workTime() > 8) {
            return true;
        }
        return false;
    }



    //מתודה לחישוב כמה שעות נוספות יש לי
    double Extra() {
        int x = 0;
        if (workTime() > 8) {
            x += workTime() - 8;
        }
        return x;
    }
}
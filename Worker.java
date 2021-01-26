package com.company;

import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<Workday> workdays;
    private int pay;

    public Worker(String name, int pay) {
        this.name = name;
        this.pay = pay;
        workdays = new ArrayList<Workday>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Workday> getWorkdays() {
        return workdays;
    }

    public void setWorkdays(ArrayList<Workday> workdays) {
        this.workdays = workdays;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    int workingDays() {
        int i = 0, sum = 0;
        for (i = 0; i < workdays.size(); i++) {
            if (workdays.get(i).workTime() > 0) {
                sum++;
            }
        }
         return sum;
        }
        int Salary() {
        double sum = 0;
        int i = 0;
        for (i = 0; i<workdays.size(); i++){
            sum += workdays.get(i).workTime() * pay;
        }
       return (int) sum;
    }

    Worker diligent(Worker other){
          if(this.workingDays() > other.workingDays()){
              return this;
          }
          else
              return other;
    }

}


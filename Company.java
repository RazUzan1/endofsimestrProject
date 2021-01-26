package com.company;

import java.util.ArrayList;

public class Company {
    String name;
    ArrayList <Worker> allWorkers;
    ArrayList<Integer> sales;

    public Company(String name){
        this.name = name;
        allWorkers = new ArrayList<Worker>();
             sales = new ArrayList<Integer>();
    }

    int totalPayments(){
        int i =0;
        double sum = 0;
        for(i=0; i<allWorkers.size(); i++){
           sum += allWorkers.get(i).Salary();
        }
        return (int) sum;
    }


    int totalEarnings() {
        double sum = 0;
        int i = 0;
        for (i = 0; i<sales.size(); i++) {
            sum += sales.get(i);
        }
            return (int) sum;
        }

        Worker workedMost(){
        int max=0;
        Worker mostDays = allWorkers.get(0);
        for(int i=0; i<allWorkers.size(); i++){
            if( allWorkers.get(i).workingDays()>max){
                mostDays=allWorkers.get(i);
                max=allWorkers.get(i).workingDays();
            }

        }
            return mostDays;
        }

    void addWorker(Worker w){
        allWorkers.add(w);
    }
}

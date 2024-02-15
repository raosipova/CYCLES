package ru.netology.mvnjava.javamvn.service;

public class VacationService {
    public int calculation(int income, int expenses, int threshold) {
        int count = 0; //счётчик месяцев отдыха
        int money = 0; //количество денег на счету
        for (int month=1; month< 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                count = count + 1;
                money = (money - expenses) / 3;
            }
        }


        return count;
    }
}
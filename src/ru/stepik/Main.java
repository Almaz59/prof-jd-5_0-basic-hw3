package ru.stepik;

public class Main {

    public static void main(String[] args) {
        // Задача 1:
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2:
        int clientOS1 = 0;
        int clientDeviceYear = 2018;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");

        // Задача 3:
        int year = 1997;
        if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");

        // Задача 4:
        int deliveryDistance = 95;
        int timeDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (timeDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (timeDelivery + 2));
        }

        // Задача 5:
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                break;
        }

        // Задача 6:
        int age = 19;
        int salary = 58_000;
        if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей");
        }

        // Задача 7:
        int age1 = 31;
        int salary1 = 85_000;
        int wantedSum = 330_000;
        double rate = 1.1;
        double maxPayment = salary1 * 0.5;
        double creditPayment = wantedSum * rate / 12;
        boolean yes = maxPayment >= creditPayment;
        if (salary1 > 80_000) {
            rate -= 0.007;
            creditPayment = wantedSum * rate / 12;
        }
        if (age1 < 30) {
            creditPayment = wantedSum * (rate + 0.005) / 12;
        }
        if (age1 < 23) {
            creditPayment = wantedSum * (rate + 0.01) / 12;
        }
        System.out.print("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. " +
                "Платеж по кредиту " + (int) creditPayment + " рублей. ");

        if (yes) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отклонено");
        }

    }
}




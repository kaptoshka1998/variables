package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        byte a = 6;
        short b = 20;
        int c = 12500;
        long z = 23654800L;
        float e = 12.2f;
        double f = 345.87457;
        char g = 'Q';
        boolean h = true;

        //Задача 2

        double first = 78.2;
        double second = 82.7;
        double fssumm = first + second;

        double fsdiff = second - first;
        System.out.println("Разница в весе двух бойцов составляет: " + fsdiff + " кг");


        System.out.println("Суммарный вес двух бойцов составляет: " + fssumm + " кг");

        //Задача 3

        int banana = 5;
        int milk = 2;
        int icecream = 2;
        int eggs = 4;
        double breakfast = banana * 80 + milk * 105 + icecream * 100 + eggs * 70; //грамм
        double kg = breakfast / 1000;
        System.out.println("Cуммарный вес коктейля: " + kg + " кг");

        //Задача 4

        int beginning = 7;
        int fir = 250;
        int sec = 500;
        int middle = (fir + sec) / 2;
        int flw = beginning * 1000 / fir;
        int slw = beginning * 1000 / sec;
        double mlw = (double) beginning * 1000 / middle;
        System.out.println("При похудении на 250 г в день: " + flw + " дней");
        System.out.println("При похудении на 500 г в день: " + slw + " дней");
        System.out.println("В среднем похудение займет: " + Math.round(mlw) + " дней");

        //Задача 5

        int m = 67760;
        int d = 83690;
        int k = 76230;
        int y = 12; //месяцев в году
        double ps = 1.1;
        double psm = ps * m;
        double psd = ps * d;
        double psk = ps * k;
        int ym = m * y;
        int yd = d * y;
        int yk = k * y;
        double ypsm = psm * y;
        double ypsd = psd * y;
        double ypsk = psk * y;
        double rm = (psm - m) * y;
        double rd = (psd - d) * y;
        double rk = (psk - k) * y;
        System.out.println("Маша теперь получает: " + Math.round(psm) + " рублей. Годовой доход вырос на: " + Math.round(rm) + " рублей");
        System.out.println("Денис теперь получает: " + Math.round(psd) + " рублей. Годовой доход вырос на: " + Math.round(rd) + " рублей");
        System.out.println("Кристина теперь получает: " + Math.round(psk) + " рублей. Годовой доход вырос на: " + Math.round(rk) + " рублей");

    }
}


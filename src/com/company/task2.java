package com.company;

public class task2 {
    public static final int tickets = 999999;

    public static void main(String[] args) {
        task2();
    }

    //2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 - те у которых сумма первых 3 цифр равна сумме последних 3
//
//
//
//*) Результат скинуть как ссылка на github, без лишних файлов (out, .idea, project.iml) где каждое задание отдельным коммитом, и у каждого коммита нормальное сообщение, которое отображает что в этом коммите добавилось нового.
//
//Т.е. должно быть 3 коммита примерно так:
//
//Initial commit
//Task1
//Task2
    private static void task2() {
        StringBuilder num = new StringBuilder();
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();
        StringBuilder countNum=new StringBuilder();

        int count = 0;

        for (int i = 0; i <= tickets; i++) {
            int sumStart = 0;
            int sumEnd = 0;
            num.delete(0, num.length());
            start.delete(0, start.length());
            end.delete(0, end.length());
            countNum.delete(0,countNum.length());
            countNum.append(i);
            while(num.length()<6-countNum.length()){
                num.append(0);
            }
            num.append(i);
            start.append(num.substring(0, 3));
            end.append(num.substring(3, 6));
            for (int j = 0; j <= 2; j++) {

                sumStart += Integer.parseInt(String.valueOf(start.toString().charAt(j)));

                sumEnd +=Integer.parseInt(String.valueOf(end.toString().charAt(j)));

            }
            if(sumStart==sumEnd){
                count++;
            }

        }
        System.out.println("Количество счастливых билетов равняется - " + count);
    }
}

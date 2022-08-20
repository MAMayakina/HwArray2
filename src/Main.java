public class Main {
    public static void main(String[] args) {

        int[] accountValue = new int[30];
        for (int i = 0; i < accountValue.length; i++) {
            accountValue[i] = ((int)(Math.random() * 100000)+100000);
            System.out.println(accountValue[i]);
        }

        //Задание 1 - сумма всех трат за месяц
        int sum = 0;
        for (int i = 0; i < accountValue.length; i++) {
            sum = sum+accountValue[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание 1 - минимальная и максимальная траты за день
        int min = accountValue[0];
        int max = accountValue[0];
        for (int i = 1; i < accountValue.length; i++) {
            if(accountValue[i]<min){
                min=accountValue[i];
            } else if (accountValue[i]>max){
                max=accountValue[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей."+ "Максимальная сумма трат за день составила " + max + " рублей.");

        //Задание 3 - среднее значение
        double average = (double) sum/30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Задание 4 - переворачиваем массив
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for(int i=reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }

}
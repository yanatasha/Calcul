import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculations {

    private double num1;
    private double num2;
    Scanner sc = new Scanner(System.in);


    public double sum(double num1, double num2){
        DecimalFormat deci = new DecimalFormat("0.###");
        String n1 = deci.format(num1);
        DecimalFormat decim = new DecimalFormat("0.###");
        String n2 = decim.format(num2);
        double ressum  = num1 + num2;
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        String secondResult = decimalFormat.format(ressum);
        System.out.println(n1 + " + " + n2 + " = " + (secondResult));
        return ressum;
    }
    public double minus(double num1, double num2){
        DecimalFormat deci = new DecimalFormat("0.###");
        String n1 = deci.format(num1);
        DecimalFormat decim = new DecimalFormat("0.###");
        String n2 = decim.format(num2);
        double resmin  = num1 - num2;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String secondResult = decimalFormat.format(resmin);
        System.out.println(n1 + " - " + n2 + " = " + (secondResult));
        return resmin;
    }
    public double del(double num1, double num2){
        DecimalFormat deci = new DecimalFormat("0.###");
        String n1 = deci.format(num1);
        DecimalFormat decim = new DecimalFormat("0.###");
        String n2 = decim.format(num2);

        if (num2 == 0){
            System.out.println("Делить на ноль нельзя");
            return 0;
        }else {
            double resdel  = num1 / num2;
            DecimalFormat decimalFormat = new DecimalFormat("0.###");
            String secondResult = decimalFormat.format(resdel);
            System.out.println(n1 + " : " + n2 + " = " + (secondResult));
            return resdel;
        }
    }
    public double umn(double num1, double num2){
        DecimalFormat deci = new DecimalFormat("0.###");
        String n1 = deci.format(num1);
        DecimalFormat decim = new DecimalFormat("0.###");
        String n2 = decim.format(num2);
        double resumn  = num1 * num2;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String secondResult = decimalFormat.format(resumn);
        System.out.println(n1 + " * " + n2 + " = " + (secondResult));
        return resumn;
    }
    public static void vixod(){
        System.out.println("Вы вышли");
        System.exit(0);
    }



}

/*
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = 0;
        double num2 = 0;
        String op;
        ArrayList<Double> res = new ArrayList();

        System.out.println("Вас приветствует калькулятор!");

        System.out.println("Введите первое число:");
        try {
            num1 = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Exception was processed. Program continues");
        }

        Calculations oper= new Calculations();


        while (true) {

        System.out.println("Выберите действие: \n +, - , * , : или \n Начать сначала, Посмотреть все ответы, Продолжить с определенного ответа, Удалить последний ответ, Выход");
        op = scanner.nextLine();

            switch (op) {

                case ("+"):
                    System.out.println("Введите второе число:");
                    try {
                        num2 = scanner.nextDouble();
                    }catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }
                    double a = oper.sum(num1,num2);
                    System.out.println("Результат равен: " +  a);
                    res.add(a);
                    num1 = a;
                    break;
                case ("-"):
                    System.out.println("Введите второе число:");
                    try {
                       num2 = scanner.nextDouble();
                    }catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }
                    double b = oper.minus(num1,num2);
                    System.out.println("Результат равен: " + b);
                    res.add(b);
                    num1 = b;
                    break;

                case ("*"):
                    System.out.println("Введите второе число:");
                    try {
                        num2 = scanner.nextDouble();

                    }catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }
                    double c = oper.umn(num1,num2);
                    System.out.println("Результат равен: " + c);
                    res.add(c);
                    num1 = c;

                    break;


                case (":"):
                    System.out.println("Введите второе число:");
                    try {
                        num2 = scanner.nextDouble();

                    }catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }

                    double d = oper.del(num1, num2);
                    System.out.println("Результат равен: " + d);
                    res.add(d);
                    num1 = d;
                    break;


                case ("Начать сначала"):
                        res.clear();
                        System.out.println("Введите первое число:");
                        num1 = scanner.nextDouble();
                        scanner.nextLine();
                        break;



                case ("Посмотреть все ответы"):

                    try {
                        if (res.size()<=5){
                            System.out.println(res);
                        }else{
                            int numberOfElements = 5;
                            int startIndex = Math.max(0, res.size() - numberOfElements);
                            List<Double> lastFiveElements = res.subList(startIndex, res.size());
                            System.out.println(lastFiveElements);
                        }
                    } catch (NullPointerException e){
                        System.out.println("Нет предыдущих ответов");
                    }
                    break;


                case ("Продолжить с определенного ответа"):
                    if (res.size()>=0){
                    System.out.println(res);
                    System.out.println("С какого числа Вы хотите продолжать действия?");
                    double znach = scanner.nextDouble();
                    scanner.nextLine();
                    if (res.contains(znach)){
                        num1 = znach;
                    } else{
                        System.out.println("Нет такого результата");
                    }
                    }else{
                        System.out.println("Вы за пределами массива");
                    }
                    break;

                case("Удалить последний ответ"):
                    try {
                        int lastIndex = res.size() - 1;
                        res.remove(lastIndex);
                        System.out.println(res);
                        num1=res.getLast();
                        break;
                    }
                    catch (NullPointerException e){
                        System.out.println(e.getMessage());
                        System.out.println("Exception was processed. Program continues");
                    }
                    break;

                case ("Выход"):
                    res.clear();
                    oper.vixod();
                    break;

                default:
                    System.out.println("Ничего не выбрано");
                    break;
                    
            }
        }
    }
*/

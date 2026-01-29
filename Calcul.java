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

//    public String vivod(){
//
//    }
//


}

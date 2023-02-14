//find the perimeter and area of circle given a value of radius
import java.util.Scanner;
public class Exercise1_3{
    public static void main(String[]args){
        Scanner s  =  new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        // calculate the area and perimeter
        if(radius<=0)
        {
            System.out.println("please enter non zero positive integer");
        }
        else{
            perimeter=2*Math.PI*radius;
            area=Math.PI*radius*radius;
            System.out.println(perimeter);
            System.out.println(area);
        }
    }
}
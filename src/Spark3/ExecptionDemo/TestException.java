package Spark3.ExecptionDemo;
import java.util.Scanner;
import java.io.File;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before exception");
        System.out.println("calculating....");
        try {
            System.out.println(" Still calculating....1");
            System.out.println(" Still calculating....2");
            System.out.println(" Still calculating....3");
            File file = new File("demo.tex");
            Scanner sc = new Scanner(file);    ///system.in nhi file hai qki wo jo b file hai usk anadar ka data read krne k liye use hta hai
            System.out.println(" Still calculating....4");
            //System.out.println(10/0);
        }
        catch (Exception e) ///kch b name rkh sktey hai e k alwa .
        {
            System.out.println("catch working....");
            System.out.println(e); ///jo b exception ayi wo e mein store hgyi ab, printing
        }
        System.out.println("after calulation");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
    }
}

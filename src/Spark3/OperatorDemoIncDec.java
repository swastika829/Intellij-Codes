package Spark3;

public class OperatorDemoIncDec {

        public static void main(String[] args)
        {
            int a=5;
            int b=7;
            int res = a++ + ++b - --a + b++ - a++;
            System.out.println(res);


            int c=5;
            int d=7;
            int e=c++ + d;
            System.out.println(e);
            System.out.println(c);

            int f=5;
            int g=a++;
            System.out.println(g);
            System.out.println(f);

            int h=10;
            int k=--b;
            int i=++b;
            int l=b++;
            System.out.println("b===>"+h);
            System.out.println("k===>"+k);
            System.out.println("f===>"+i);
            System.out.println("l===>"+l);
        }


}

package Spark3;

public class ConditionalOperator
{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        /// varaible=(conditions)?value_if_t:value_if_f
        b=(a==1) ? 30:40; ///chota if else condition jaisa hai
        System.out.println(b);

        b=(a==10) ? 30:40;
        System.out.println(b);
    }
}

package patternprinting;

import java.sql.SQLOutput;

public class solidsquarepattern {
    static void main() {
        //hollow piramid
        int n =4;
        for(int r=1;r<=n-1;r++){
            for(int c=1;c<=n-r;c++){
                System.out.print("  ");
            }
            if(r==1 ){
                for(int c=1;c<=2*r-1;c++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int c=1;c<=2*r-3;c++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int r=1;r<=n-1;r++){
            for(int c=1;c<r;c++){
                System.out.print("  ");
            }
            if(r==3) {
                for (int c = 1; c <= n - 3; c++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int c = 1; c <= 2 * (n - r) - 3; c++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }

            System.out.println();
        }

/*        //hollow piramid
        int n =5;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r;c++){
                System.out.print("  ");
            }
            if(r==1 || r==n){
                for(int c=1;c<=2*r-1;c++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int c=1;c<=2*r-3;c++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }*/
 /*       //hollow right angles triangle
        int n =5;
        for(int r =1;r<=n;r++){
            if(r==1||r==2||r==5){
                for(int c=1;c<=r;c++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int c=1;c<=r-2;c++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();

        }*/
/*        //hollow rectangle
        int n =10;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=6;c++){
                if(r==1 || r==n){
                    System.out.print("* ");
                }
                else{
                    if(c==1 || c==6){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }*/

/*        //solid piramid
        *//*    int n =5;*//*
        //part1
        int n =4;
        for(int i =1;i<=n;i++){
            for(int j =1; j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
//inverted solid pyramid
        //part2
        for(int r=1;r<=n;r++){
            int sp=r-1;
            if(r==1){
                continue;
            }
            for(int c=1;c<=sp;c++){
                System.out.print("  ");
            }
            for(int c=1;c<=2*n-r-sp;c++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


/*        //ABC right angles downwards
        int n =5;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r+1;c++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/
/*        //solid rhombus
        int n =5;
        for(int r=1;r<=n;r++){
            for(int col=1;col<=n-r;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/






/*        //right angles triangle
        int n=5;
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/
/*        //solid rectangle
        int r=3;
        int c=5;
        for(int row=1;row<=r;row++){
            for(int col=1;col<=c;col++){
                System.out.print(" * ");
            }
            //for next line
            System.out.println(" ");
        }*/

/*        //solid square pattern
        int n =4;
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n;col++){
                System.out.print(" * ");
            }
            //move to next line
            System.out.println(" ");
        }*/
    }
}

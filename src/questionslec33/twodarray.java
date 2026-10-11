package questionslec33;

import java.util.Arrays;

public class twodarray {
    public int maximumWealth(int[][] accounts) {
        int []rowsums=new int[accounts.length];
        for(int i=0;i<accounts.length;i++) {
            int sum = 0;

            for (int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];

            }
            rowsums[i] = sum;


        }

        int maxi = rowsums [0];
            for (int index = 0; index < rowsums.length; index++) {
                if (rowsums[index]>maxi) {
                    maxi = rowsums[index];

                }
            }
            System.out.println("this is the maximum :" + maxi);

            return maxi;

    }
    static void main(String[] args) {
        int accounts[][]={{1,2,3},{4,5,6},{7,8,9}};
        twodarray onj=new twodarray();
        onj.maximumWealth(accounts);
    }



}


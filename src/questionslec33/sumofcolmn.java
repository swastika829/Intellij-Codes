package questionslec33;

import java.util.ArrayList;
import java.util.List;

public class sumofcolmn {
    List<Integer> result=new ArrayList<>();
    public List<Integer> sums( int[][] matrix){

        for(int col=0;col<matrix[0].length;col++){
            int sum=0;
            for(int row=0;row<matrix.length;row++){
                sum=sum+matrix[row][col];

            }
            //jaise hi main ek column mein entire traversal krke sum nikaal chuki hingi
            //main usko store krwa dungi result list mein
            result.add(sum);
        }
        return result;

    }

    static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        sumofcolmn obj=new sumofcolmn();
        List<Integer> ans=obj.sums(matrix);
        System.out.println(ans );

    }




}

package questionslec33;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wavematrix {
    public List<Integer> wavePrintmatrix(int[][] matrix, int m , int n){
        List<Integer> result=new ArrayList<>();

        for(int col=0;col<n;col++){
            //even check krnge
            if((col & 1)==0){
                //agr even hga to top to bottom jaiga
                // next logic for top to bottom
                for(int row=0;row<m;row++){
                    result.add(matrix[row][col]);


                }

            }else{
                for(int row=m-1;row>=0;row--){
                    result.add(matrix[row][col]);

                }
            }

        }
        return result;
    }

    static void main(String[] args) {
        int[][] matrix ={{1,2,3,4,5}};

        int m = 1;
        int n = 5;

        wavematrix obj = new wavematrix();
        List<Integer>ans=obj.wavePrintmatrix(matrix,m,n);
        System.out.println(ans);

    }
}

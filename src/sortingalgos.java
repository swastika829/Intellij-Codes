public class sortingalgos {
    private static Object obj;

    static void bubblesort(int[]arr){
/*        int n =arr.length;
        for(int i=0;i<n-1;i++){  //iterations k liye
            for(int j =0;j<n-i-1;j++){ //neighbouring elements ke comparision k liye
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }*/

    }
    static void selectionsort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }

            }
           int temp=arr[i];
           arr[i]=arr[min_index];
           arr[min_index]=temp;

        }

    }
    public static void insertionsort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=i;
            int prev=i-1;
            int currValue=arr[curr];
            while(prev>=0 && currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //place the current value
            arr[prev+1]=currValue;

        }
    }

    static void main() {
        int []arr={4,1,5,2,3};
        insertionsort(arr);
        for (int ans:arr){
            System.out.println(ans);
        }









/*        int arr[]={6,5,1,3,4};
        selectionsort(arr);
        for(int value :arr){
            System.out.println(value);
        }*/









/*        int []arr={5,6,1,3};
        bubblesort(arr);
        System.out.println("prinitng the array");
        for(int ans:arr){
            System.out.print(" " + ans);
        }*/

    }
}

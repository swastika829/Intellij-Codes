public class precision {
    static double precisioninsqrt(int x){
        double ans = 0;
        while ((ans + 1) * (ans + 1) <= x) {
            ans++;
        }
        double factor=1;
        int precisionn=3;
        for(int r=1;r<precisionn ; r++){
            factor=factor/10;
            for(int i =1;i<=10.0;i++){
                double newans= ans+factor;
                if(newans*newans <x){
                    ans =newans;

                }else{
                    break;
                }
            }
            System.out.println("printing ans in each round:"+ Math.round(ans*1000.0/1000.0));
        }
        System.out.println("printing final answers:"+Math.round(ans*1000.0/1000.0));


        return -1;
    }

    static void main(String[] args) {
        int x=57;
        precision onj=new precision();
        System.out.println(onj.precisioninsqrt(57));

    }
}

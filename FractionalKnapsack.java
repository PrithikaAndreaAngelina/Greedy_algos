import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static double fractionalKnapsack(int val[],int wt[],int cap)
    {
        int n = val.length;
        int [][] item = new int[n][2];
        //o(n)
        for(int i=0;i<n;i++){
            item[i][0] = val[i];
            item[i][1] = wt[i];
        }//o(n log n)
        Arrays.sort(item,new Comparator<int[]>(){
            public int compare(int a[],int b[])
        {
            double r1 = (double) (a[0]/a[1]);
            double r2 = (double) (b[0]/b[1]);
            return Double.compare(r2,r1);
        }
        });
        
        int ct = cap;
        double res = 0.0;//o(n)
        for(int i=0;i<n;i++)
        {
            if(item[i][1]<=ct){
                res = res+item[i][0];
                ct = ct-item[i][1];
            }
            else{
                res += ((double) item[i][0] / item[i][1]) * ct;
                break;
            }
        }
        //time complexity = o(n)+o(log n)+o(n)= n + n log n + n = 
        // 2n + n log n -> n log n
        return res;
    }
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }
}

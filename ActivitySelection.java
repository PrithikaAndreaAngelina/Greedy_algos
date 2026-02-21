import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static int activitySelection(int[] start, int[] finish)
    {
        int n = start.length;
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }
        
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[1]-b[1];
            }
        });
        
        int count = 1;
        int j = 0;
        for(int i = 1;i<n;i++){
            if(arr[i][0]>arr[j][1]){
                count++;
                j=i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {5, 1, 3, 0, 8, 5};
        int[] finish = {9, 2, 4, 6, 9, 7};

        System.out.println(activitySelection(start, finish));
    }
}

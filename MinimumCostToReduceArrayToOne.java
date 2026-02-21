class Main {
    public static int cost(int[]arr, int len)
    {
        int min = arr[0];
        //Time complexity = o(n)
        for(int i=1;i<len;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
            return min * (len-1);
    }
    public static void main(String[] args) {
        int []a = {5, 1, 4, 3};
        int n = a.length;
        
        System.out.println(cost(a, n));
    }
}

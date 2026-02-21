class Main {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        //Time complexity = o(n logn)
        Arrays.sort(s);
        //Time complexity = o(n logn)
        int count = 0;
        int i=0;
        int j=0;
        //Time complexity = o(n)
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
        //Time complexity = n log n + n log n + n = 2n log n + n = 2n log n = o(n log n)
    }
      public static void main(String[] args) {
        int[] g = {1, 10, 3};
        int[] s = {1, 2,3};
      
        System.out.println(findContentChildren(g, s));
    }
}

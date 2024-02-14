class Solution {
    public int climbStairs(int n) {
            if(n==1) return 1;
    if(n==2) return 2;

    int[] a =  new int[n];
    a[0]=1;
    a[1]=2;
    System.out.println(Arrays.toString(a));

    for(int i=2;i<n;i++){
        a[i]=a[i-1]+a[i-2];
        System.out.println(Arrays.toString(a));
    }
    return a[n-1];
    }
}
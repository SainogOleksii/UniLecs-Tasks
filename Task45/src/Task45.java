public class Task45 {
    private static long factorial(int n){ return (n == 0)? 1: n * factorial(n - 1);}

    private static long parquet(int a, int b){
        long res = 0;
        for(int i = 0; i <= a / b; i++)
            res += factorial(a - i * b + i)/(factorial(i) * factorial(a - i * b));
        return res;
    }

    public static void main (String args[]){
     //test
        System.out.println(parquet(2, 3));
        System.out.println(parquet(4, 4));
        System.out.println(parquet(8, 4));
        System.out.println(parquet(8, 3));
        System.out.println(parquet(10, 3));
    }
}

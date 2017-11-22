public class Task44 {
    private static int bell_bells(int h1, int m1, int h2, int m2){
        h2 += (h2 >= h1)? 0: 24;
        int res =   ((m2 > 30)? 0: -1) + ((m1 > 30)? 0: 1);
        for (int i = h1 + 1; i < h2 + 1; i++)
            res +=  (i - 1) % 12 + 2;
        return res;
    }

    public static void main (String args[]){
     //Tests
        System.out.println(bell_bells(0, 15, 4, 36));
        System.out.println(bell_bells(0, 15, 0, 34));
        System.out.println(bell_bells(11, 3, 13, 15));
        System.out.println(bell_bells(12, 34, 13, 15));
        System.out.println(bell_bells(12, 34, 0, 15));
    }
}

public class Task46 {
    private static int revers(int num, int res){
        return (num == 0)? res: revers(num / 10, res * 10 + num % 10);
    }

    public static void main(String args[])
    {
        System.out.println(revers(1234, 0));
    }
}

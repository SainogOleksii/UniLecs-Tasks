public class Task47 {
    private static int byteDifference(int a, int b){
        return Integer.
                toBinaryString(a ^ b).
                    replace("0","").
                        length();
    }

    public static void main (String args[]){
        System.out.println(byteDifference(75, 15));
        System.out.println(byteDifference(2, 5));
        System.out.println(byteDifference(-1, -11));
        System.out.println(byteDifference(43, 13));

    }
}

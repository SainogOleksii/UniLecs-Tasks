import java.util.Scanner;

public class Task43 {
    public static void main (String args[]){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        Box box_1 = new Box(a, b, c);
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        Box box_2 = new Box(a, b, c);
        if(box_1.fitIn(box_2) && box_2.fitIn(box_1))
            System.out.println("Boxes are equal");
        else  if(box_1.fitIn(box_2))
                System.out.println("The first box is smaller than the second one");
              else  if(box_1.fitIn(box_2))
                System.out.println("The first box is smaller than the second one");
                    else if(box_2.fitIn(box_1))
                            System.out.println("The first box is larger than the second one");
                         else
                             System.out.println("Boxes are incomparable");
    }
}

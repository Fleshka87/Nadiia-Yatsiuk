import java.util.Random;

public class RandomFromArray {
    public static void main(String[] args) {
        int [] array = {15, 8, 24, 41, 9, 84};
        Random r= new Random();
        int randomNumber =r.nextInt(array.length);
        int x = (array[randomNumber]);
        System.out.println(x);
        if (x % 2 == 0){
            System.out.println("I am lucky");
        }
        else {
            System.out.println("try again");
        }
    }
}



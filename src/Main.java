import homework5.RubberDuck;
import homework5.Swan;

public class Main {

    public static void main(String[] args) {
        RubberDuck jacl =new RubberDuck("kjj", "lkll","kkjj", "kjj");
        jacl.iAm();
        jacl.canSwim();

        Swan mySwan = new Swan("Swan Vania", "Real",45.5 );
        mySwan.speed("kkj");
        System.out.println("My speed is "+ mySwan.speed("My Fly Speed"));
    }


}


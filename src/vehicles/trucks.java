package vehicles;

public class trucks extends car{
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public trucks(int carrying) {
        this.carrying = carrying;
    }
    trucks Volvo = new trucks(250);

}





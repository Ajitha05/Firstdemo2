public class Vechical {
    int tirecount ;
    String color;
    public Vechical() {
        System.out.println("non prameter");
    }

    public Vechical(int tirecount, String color) {
        this.tirecount = tirecount;
        this.color = color;
        System.out.println("prameter called");

    }

    public static void main(String args[]) {
        Vechical sc = new Vechical(3,"black");


    }


}

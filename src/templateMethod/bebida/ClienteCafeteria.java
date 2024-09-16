package templateMethod.bebida;

public class ClienteCafeteria {

    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        Cha cha = new Cha();

        System.out.println(cafe.prepararBebida());
        System.out.println(" ");
        System.out.println(cha.prepararBebida());
    }
}

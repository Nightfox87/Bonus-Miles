public class Main {
    public static void main(String[] args) {

        int price = 5000;  // стоимость авиабилета
        int bonus = 20;  // за каждые 20 рублей начисляется одна бонусная миля

        System.out.println("За покупку билета начислено бонусных миль:");
        System.out.println(price / bonus);

    }
}

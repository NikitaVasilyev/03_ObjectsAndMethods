public class Main
{
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 80, 5, 1000);
        basket.print("Milk");
        System.out.println("\nОбщий вес: " + basket.getTotalWeight() + " кг." +
                "\nОбщая стоимость: " + basket.getTotalPrice() + " руб.");
    }
}
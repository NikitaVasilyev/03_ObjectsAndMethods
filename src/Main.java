public class Main {
    public static void main(String[] args) {
        /*Basket basket = new Basket();
        basket.add("Milk", 80, 5, 1000);
        basket.print("Milk");
        System.out.println("\nОбщий вес: " + basket.getTotalWeight() + " кг." +
                "\nОбщая стоимость: " + basket.getTotalPrice() + " руб.");*/

    Arithmetic total = new Arithmetic(500, 200);
        System.out.println("Сумма чисел равна: " + total.sum());
        System.out.println("Разность чисел равна: " + total.difference());
        System.out.println("Произведение чисел равно: " + total.product());
        System.out.println("Среднее значение равно: " + total.averageValue());
        System.out.println("Максимальное значение из двух чисел: " + total.maxValue());
        System.out.println("Минимальное значение из дух чисел: " + total.minValue());
    }
}
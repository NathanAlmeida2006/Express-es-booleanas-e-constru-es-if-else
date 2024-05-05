public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Camisa";
        boolean outOfStock = false;

        double price = 10.00;
        int quantity = 2;
        double total;
        String message;

        total = (price * quantity);

        if (quantity > 1) {
            itemDesc = "Camisas";
            message = custName + " quer comprar " + quantity + " " + itemDesc + ".";

        } else if (quantity <= 0) {
            outOfStock = true;
            message = "Item fora do estoque!";

        } else {
            message = custName + " quer comprar " + quantity + " " + itemDesc + ".";
        }

        if (!outOfStock) {
            System.out.println("Preço: R$" + total);
        }

        if (outOfStock) {
            System.out.println("Item fora do estoque!");
            System.out.println("Acesse o site para reservar seu item!");

        } else {
            System.out.println(message);
        }
    }
}

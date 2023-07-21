package exercises_week2.Ex1;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboardA = new Keyboard();
        keyboardA.brand = "Multilaser";
        keyboardA.manufacturer = "Multilaser";
        keyboardA.model = "BG8967";
        keyboardA.connectionType = "Wireless";
        keyboardA.color = "White";
        keyboardA.dimensions = "46 x 3 x 15 cm; 490 g";

        System.out.println(keyboardA.brand);
        System.out.println(keyboardA.manufacturer);
        System.out.println(keyboardA.model);
        System.out.println(keyboardA.connectionType);
        System.out.println(keyboardA.color);
        System.out.println(keyboardA.dimensions);
    }
}

package io.github.eugenezakhno.listing14_1;


public class MyClass {
    public static void main(String[] args) {

        PrintChar obj = new PrintChar("Строка");
        for (Character ch: obj) {
            System.out.println(ch);
        }

        for (Character character : obj) {
            System.out.println(character);
        }
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
    }
}


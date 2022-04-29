import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Ingrese el primer número a operar");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número a operar");
            int num2 = sc.nextInt();
            System.out.println("Ingrese la operación a realizar");
            String operation = sc.next();
            operate(num1, num2, operation);
            System.out.println("\n-----------------------------\n");
        }
    }

    public static void operate(int num1, int num2, String operation) {
        if (operation.equals("add")) {
            add(num1, num2);
        } else if (operation.equals("sub")) {
            sub(num1, num2);
        } else if (operation.equals("mul")) {
            mul(num1, num2);
        } else if (operation.equals("div")) {
            div(num1, num2);
        } else if (operation.equals("mod")) {
            mod(num1, num2);
        } else {
            System.out.println("¡Parece que hubo un problema!");
        }
    }

    public static void add(int num1, int num2) {
        System.out.println("Resultado: " + (num1 + num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("Resultado: " + (num1 - num2));
    }

    public static void mul(int num1, int num2) {
        System.out.println("Resultado: " + (num1 * num2));
    }

    public static void div(int num1, int num2) {
        System.out.println("Resultado: " + (num1 / num2));
    }

    public static void mod(int num1, int num2) {
        System.out.println("Resultado: " + (num1 % num2));
    }
}
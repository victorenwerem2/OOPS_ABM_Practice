public class Addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

public class Subtraction {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a - b;
        System.out.println("Result = " + result);
    }
}

public class Multiplication {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a * b;
        System.out.println("Result = " + result);
    }
}

public class Modulus {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int remainder = a % b;
        System.out.println("Remainder = " + remainder);
    }
}

public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if (b != 0) {
            int result = a / b;
            System.out.println("Result = " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

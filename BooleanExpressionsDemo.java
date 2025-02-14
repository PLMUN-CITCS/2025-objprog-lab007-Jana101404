public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        // Declare Boolean Variables
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;

        // Declare Integer Variables
        int a = 15;
        int b = 20;

        // Relational Expressions
        boolean isAGreater = a > b; // Checks if 'a' is greater than 'b'
        boolean areEqual = a == b; // Checks if 'a' is equal to 'b'

        // Logical Operators
        boolean bothTrue = isJavaFun && (a < b); // Logical AND
        boolean eitherTrue = isJavaFun || isHomeworkTiring; // Logical OR
        boolean notTrue = !isHomeworkTiring; // Logical NOT
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring; // Logical XOR

        // Output Results
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        System.out.println("Are 'a' and 'b' equal? " + areEqual);
        System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
        System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}

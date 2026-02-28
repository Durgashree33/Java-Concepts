public class StringExample {
    public static void main(String[] args) {

        //Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("Original Strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        //String Methods
        System.out.println("\nString Methods:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Concatenation: " + str1.concat(" " + str2));
        System.out.println("Equals check: " + str1.equals(str2));

        //Immutability of String
        String original = "Java";
        original.concat(" Programming"); // This does not change original
        System.out.println("\nAfter concat without assignment: " + original);

        original = original.concat(" Programming");
        System.out.println("After concat with assignment: " + original);

        //StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Code");
        sb.append(" Practice");
        System.out.println("\nUsing StringBuilder: " + sb);
    }
}
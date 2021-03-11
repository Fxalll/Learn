package Study2;

public class S8 {
    public static < E > void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("Interger: ");
        printArray(intArray);
        System.out.println("\nDouble: ");
        printArray(doubleArray);
        System.out.println("\nChar: ");
        printArray(charArray);
    }
}

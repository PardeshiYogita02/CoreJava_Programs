/*2. Write a java program for  Unboxing.(all types).
*/
package Java_Internship;

public class UnboxingExample {
    
    public static void main(String[] args) {
        
        // Wrapper classes to primitive types (Unboxing)

        Byte byteObj = 02;
        byte bytePrimitive = byteObj;
        
        Short shortObj = 12;
        short shortPrimitive = shortObj;
        
        Integer intObj = 20;
        int intPrimitive = intObj;
        
        Long longObj = 50L;
        long longPrimitive = longObj;
        
        Float floatObj = 10.5f;
        float floatPrimitive = floatObj;
        
        Double doubleObj = 10.65;
        double doublePrimitive = doubleObj;
        
        Character charObj = 'P';
        char charPrimitive = charObj;
        
        Boolean boolObj = false;
        boolean boolPrimitive = boolObj;

        // Printing the unboxed values
        System.out.println("byte: " + bytePrimitive);
        System.out.println("short: " + shortPrimitive);
        System.out.println("int: " + intPrimitive);
        System.out.println("long: " + longPrimitive);
        System.out.println("float: " + floatPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("char: " + charPrimitive);
        System.out.println("boolean: " + boolPrimitive);
     }
}
/*OUTPUT

byte: 2
short: 12
int: 20
long: 50
float: 10.5
double: 10.65
char: P
boolean: false
*/
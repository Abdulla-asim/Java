public class TypePromotions {
    public static void main(String[] args) {
        byte b = 10;
        // b = b * 2; // error: incompatible types: possible lossy conversion from int to byte
        b = (byte) (b * 2);
        // byte b2 = (byte) 128; // = -127
        // byte b2 = 128; // = 128
        // byte b2 = (byte )(256 + 127); // = 127
        byte b2 = (byte) (2000 + 48); 
        System.out.println(b + " " + b2);
    }
}

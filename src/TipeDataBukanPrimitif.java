public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100L;

        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte = 0;
        System.out.println(iniByte);

//        Konversi tipe data Primitif menjadi bukan primitif
        int age = 100;
        Integer ageObject = age;

        short iniShort = ageObject.shortValue();
        float iniFloat = ageObject.floatValue();
        long iniLong2 = ageObject.longValue();




    }
}

package prak13;

public class test
{
    public static void main(String[] args) {
        address address = new address();
        address.setAddress1("Россия, Алтайский край, Барнаул, Ленина, 1, 1, 2");
        System.out.println(address);
        address.setAddress2("Россия. Республика Бурятия. Улан-Удэ. Гагарина. 34. 1. 1");
        System.out.println(address);

    }
}

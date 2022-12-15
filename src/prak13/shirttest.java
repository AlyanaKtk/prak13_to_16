package prak13;

public class shirttest
{
    public static void main(String[] args) {
        shirt[] s = new shirt[3];
        String[] shirts = new String[3];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        for (int i = 0; i < 3; i++){
            s[i] = new shirt();
            s[i].setInfo(shirts[i]);
            System.out.println(s[i]);
        }
    }
}

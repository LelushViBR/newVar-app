package by.itstep.strs;

public class MutableStringsTest {
    public static void main(String[] args) {
        StringBuffer sBuff;
        StringBuilder sBuild = new StringBuilder();
        sBuild.append("hello ");
        String str = null;
        sBuild.append(str);
        sBuild.append( 123 ).append('x').append("world!");
        System.out.println(sBuild.toString());

        StringBuilder sBuild2 = new StringBuilder(128);
        sBuild2.append("hello world!");
        sBuild2.append("hello world!");
        sBuild2.append("hello world!");
        System.out.println(sBuild2);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild.append(sBuild2));
        System.out.println(sBuild4);

        System.out.println(sBuild4.reverse());

        System.out.println("capacity" + sBuild4.capacity());
        System.out.println("length" + sBuild4.length());
        System.out.println("free" + (sBuild4.capacity() - sBuild4.length()));

        String words[] = sBuild4.toString().split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}

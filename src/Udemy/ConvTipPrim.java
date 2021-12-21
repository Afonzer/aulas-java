package Udemy;

public class ConvTipPrim {
    public static void main(String[] args) {
        double a = 1.168132168165168; //conv implicita
        int e = (int) a;
        System.out.println(a);

        float b = (float) 1.06516516516816; //conv explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; //sem conv para byte ele nn funciona
        System.out.println(d);
    }
}

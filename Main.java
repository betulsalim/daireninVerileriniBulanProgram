import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float aci,alan,cevre,yaricap,pi=3.14f;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextFloat();

        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        aci = input.nextFloat();

        cevre = 2*pi*yaricap;
        System.out.println("Dairenin çevresi: "+cevre);

        alan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Dairenin alanı: "+alan);

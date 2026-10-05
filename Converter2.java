package Array;

import java.util.Scanner;

public class Converter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter cv = new Converter();
        System.out.println("Nhap do F muon doi: ");
        double F = sc.nextDouble();
        double C = cv.doiTuDoFSangDoC(F);
        System.out.printf("Ket Qua: %.2f F = %.2f C\n\n", F, C);

        System.out.println("Nhap do dai inch muon doi: ");
        double inch = sc.nextDouble();
        double met = cv.doiTuInchSangMet(inch);
        System.out.printf("Ket Qua: %.4f i = %.4f m\n\n", inch, met);

        System.out.println("Nhap do dai met muon doi: ");
        double inputMet = sc.nextDouble();
        double inputInch = cv.doiTuMetSangInch(inputMet);
        System.out.printf("Ket Qua: %.4f m = %.4f i\n", inputMet, inputInch);
    }

}

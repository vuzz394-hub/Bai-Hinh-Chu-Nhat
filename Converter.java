package Array;

public class Converter {
    public double doiTuDoFSangDoC(double F){
        return (F - 32) * 5 / 9;
    }
    public double doiTuInchSangMet(double inch){
        return inch * 0.0254;
    }
    public double doiTuMetSangInch(double met){
        return met / 0.0254;
    }
}

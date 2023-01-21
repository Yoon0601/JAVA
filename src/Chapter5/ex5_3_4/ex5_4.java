package Chapter5.ex5_3_4;

class Km2Mile extends Converter{
    public Km2Mile(double ratio){
        this.ratio=ratio;
    }

    @Override
    protected double convert(double src) {
        return src/ratio;
    }

    @Override
    protected String getSrcString() {
        return "KM";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
public class ex5_4 {
    public static void main(String args[]) {
        Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
        toMile.run();
    }
}

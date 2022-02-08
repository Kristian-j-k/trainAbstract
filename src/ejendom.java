//3.8.1
abstract class ejendom {
}

class villa extends ejendom{
    private int antalrum;
    private int kvm;
    private double pris;

    @Override
    public String toString() {
        return "villa{" +
                "antalrum=" + antalrum +
                ", kvm=" + kvm +
                ", pris=" + pris +
                '}';
    }

    public villa(int antalrum, int kvm, double pris) {
        this.antalrum = antalrum;
        this.kvm = kvm;
        this.pris = pris;


    }
}
class butik extends ejendom{
    private double beboelsesareal;
    private double butiksareal;
    private double pris;

    public butik(){}

    public butik(double beboelsesareal, double butiksareal, double pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
        this.pris = pris;
    }
}
class etage extends ejendom{
    private double beboelsesareal;
    private double butiksareal;
    private int etager;
    private double pris;

    public etage(double beboelsesareal, double butiksareal, int etager, double pris) {
        this.beboelsesareal = beboelsesareal;
        this.butiksareal = butiksareal;
        this.etager = etager;
        this.pris = pris;
    }
}


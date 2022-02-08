//3.4.1

public class koeretoej {
    private int vaegtafgift;
    protected int registreringsnummer;

    public int getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(int vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }
}

class personvogn extends koeretoej{
    protected double hastighed;
    private double motorStorelse;
    private int hestekrafter;
    public int test;

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }

    public double getMotorStorelse() {
        return motorStorelse;
    }

    public void setMotorStorelse(double motorStorelse) {
        this.motorStorelse = motorStorelse;
    }

    public int getHestekrafter() {
        return hestekrafter;
    }

    public void setHestekrafter(int hestekrafter) {
        this.hestekrafter = hestekrafter;
    }
}

class lastbil extends koeretoej{
public int hestekrafter;
protected int lastkapasitet;
}

class bus extends koeretoej{
private int antalpassagere;
private int antaldore;
}


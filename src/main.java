public class main {
    public static void main(String[] args) {

      // TESTER KØRETØJ
        koeretoej k1 =new personvogn();
        koeretoej k2 =new lastbil();
        koeretoej k3 =new bus();
        personvogn p1 =new personvogn();
        lastbil l1 =new lastbil();
       // bus b1 = new koeretoej(); IKKE MULIG

        k1.registreringsnummer=1000;
        System.out.println(k1.registreringsnummer);
        k1.setVaegtafgift(500);
        System.out.println(k1.getVaegtafgift());
        p1.setHestekrafter(10);
        System.out.println(p1.getHestekrafter());
        l1.setVaegtafgift(6000);
        System.out.println(l1.getVaegtafgift());
        System.out.println();

        //TESTER EJENDOM
        //ejendom e1 =new ejendom(); IKKE MULIG
        ejendom v1 =new villa(5,100,1000000);
        villa v2 =new villa(10,150,150000);

        butik b1 =new butik(); //der er defineret tom constructor
        //b1.butik(10,150,15000);  ikke mulig

        System.out.println(v2.toString());




    }
}

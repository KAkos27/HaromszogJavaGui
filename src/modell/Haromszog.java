package modell;

public class Haromszog {

    private int a, b, c;

    public Haromszog(int a, int b, int c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;
        szerkeszthetosegVizsgalat();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        this.a = a;
        szerkeszthetosegVizsgalat();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws Exception {
        this.b = b;
        szerkeszthetosegVizsgalat();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) throws Exception {
        this.c = c;
        szerkeszthetosegVizsgalat();
    }

    public int kerulet() {
        return a + b + c;

    }

    public String oldalakAdatai() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }

    private void szerkeszthetosegVizsgalat() throws Exception {
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new Exception("Nem szerkesztehtő a háromszög");
        }
    }

}

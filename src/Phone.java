public class Phone {
    String brent;
    String versiya;
    double ekran;
    int pamyat;
    int sena;

    public String getBrent() {
        return brent;
    }

    public String getVersiya() {
        return versiya;
    }

    public void setBrent(String brent) {
        this.brent = brent;
    }

    public void setVersiya(String versiya) {
        this.versiya = versiya;
    }

    public Phone(double ekran, int pamyat, int sena) {
        this.ekran = ekran;
        this.pamyat = pamyat;
        this.sena = sena;
    }
}

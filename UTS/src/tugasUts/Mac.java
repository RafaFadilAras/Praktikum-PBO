package tugasUts;

public class Mac extends Laptop {

    String security;

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security            : " + security);
    }

}

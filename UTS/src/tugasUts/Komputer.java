package tugasUts;
public class Komputer {
    String merk;
    int kecProsesor;
    int sizeMemory;
    String jnsProsesor;

    public Komputer(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor) {
        this.merk = merk;
        this.kecProsesor = kecepatanProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jenisProsesor;
    }

    public void tampilData() {
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Prosesor  : " + kecProsesor);
        System.out.println("Size Memory         : " + sizeMemory);
        System.out.println("Jenis Prosesor      : " + jnsProsesor);
    }
}

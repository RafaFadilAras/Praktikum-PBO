package tugasUts;

public class PC extends Komputer {
    int ukuranMonitor;

    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC() {
        super.tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor);
    }
}

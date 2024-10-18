package tugasUts;

public class Main {
    public static void main(String[] args) {
        Mac macbook = new Mac("Apple", 2500, 16, "Intel", "Lithium-ion", "Touch ID");
        Windows windows = new Windows("Gaming", "MSI", 3000, 16, "Intel", "Lithium-ion");
        PC gamingPC = new PC("Asus",3000, 16, "Intel", 14);

        macbook.tampilMac();
        windows.tampilWindows();
        gamingPC.tampilPC();
    }
}

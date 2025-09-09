package FunctionalInterface;

interface Exporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting to JSON...");
    }
}

class ReportExporter implements Exporter {
    public void exportToCSV() { System.out.println("Exporting CSV"); }
    public void exportToPDF() { System.out.println("Exporting PDF"); }
}

public class ExportApp {
    public static void main(String[] args) {
        Exporter exporter = new ReportExporter();
        exporter.exportToCSV();
        exporter.exportToJSON();
    }
}

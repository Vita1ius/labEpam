public class Main {
    public static void main(String[] args) {
        System.out.println("CSV object");
        System.out.println(new CSV_imple().getlist().toString());
        System.out.println("XLSX object");
        System.out.println(new XLSX_imple().getlist().toString());
    }
}


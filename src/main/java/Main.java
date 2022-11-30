public class Main {
    public static void main(String[] args) {
        System.out.println("CSV object");
        System.out.println(new ListFromCSV_ServiceImpl().getlist().toString());
        System.out.println("XLSX object");
        System.out.println(new ListFromXLSX_ServiceImpl().getlist().toString());
    }
}


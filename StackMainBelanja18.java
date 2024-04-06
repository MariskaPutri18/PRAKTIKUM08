public class StackMainBelanja18 {
    public static void main(String[] args) {
        StackBelanja18 stackBelanja18 = new StackBelanja18(8);

        stackBelanja18.push(new Belanja18("1", "2024-01-01", 5, 100000));
        stackBelanja18.push(new Belanja18("2", "2024-01-08", 3, 75000));
        stackBelanja18.push(new Belanja18("3", "2024-01-15", 4, 90000));
        stackBelanja18.push(new Belanja18("4", "2024-01-22", 6, 120000));
        stackBelanja18.push(new Belanja18("5", "2024-02-05", 2, 50000));
        stackBelanja18.push(new Belanja18("6", "2024-02-12", 5, 110000));
        stackBelanja18.push(new Belanja18("7", "2024-02-19", 4, 95000));
        stackBelanja18.push(new Belanja18("8", "2024-02-26", 3, 80000));

        // Menampilkan informasi struk belanja yang tersimpan di dalam stack
        System.out.println("Informasi struk belanja yang masih tersimpan di dalam stack:");
        stackBelanja18.print();

        // Proses pengambilan data struk belanja sesuai dengan jumlah struk yang akan ditukarkan dengan voucher
        int jumlahStrukDitukarkan = 5;
        System.out.println("\nStruk belanja yang akan ditukarkan dengan voucher:");
        for (int i = 0; i < jumlahStrukDitukarkan; i++) {
            Belanja18 belanja = stackBelanja18.pop();
            System.out.println(belanja);
        }
    }
}
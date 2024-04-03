import java.util.Scanner;

public class StackMain18 {
    public static void main(String[] args) {
        stack218 stk = new stack218(5);
        Scanner sc = new Scanner(System.in);

        char pilih;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("Pilih operasi (1/2/3/4): ");
            int operasi = sc.nextInt();
            sc.nextLine();

            switch (operasi) {
                case 1:
                System.out.print("jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("merk: ");
                String merk = sc.nextLine();
                System.out.print("ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
                sc.nextLine();

                Pakaian18 p = new Pakaian18(jenis, warna, merk, ukuran, harga);
                System.out.print("apakah Anda akan menambhakan data baru ke stack (y/n)? ");
                pilih = sc.next().charAt(0);
                sc.nextLine();
                stk.push(p);
                    break;
                case 2:
                stk.pop();
                 break;
            
                case 3:
                stk.peek();
                    break;
                
                case 4:
                stk.print();
                    break;
                default:
                    System.out.println("Operasi tidak ada");
            }
    
            System.out.print("apakah Anda akan menambhakan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        }while (pilih == 'y');

       
    }
}

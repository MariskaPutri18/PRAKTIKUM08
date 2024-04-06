public class stack218 {
    int size;
    int top;
    Pakaian18 data[];

    public stack218(int size) {
        this.size = size;
        data = new Pakaian18[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Pakaian18 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian18 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna +
                    " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna +
                    " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna +
                    " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }

    public void clear() {
        top = -1;
        System.out.println("Stack sudah dikosongkan");
    }

    public void getMax() {
        if (!isEmpty()) {
            double maxHarga = data[0].harga;
            int maxIndex = 0;
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxHarga) {
                    maxHarga = data[i].harga;
                    maxIndex = i;
                }
            }
            System.out.println("Pakaian dengan harga tertinggi: " + data[maxIndex].jenis + " " + data[maxIndex].warna +
                    " " + data[maxIndex].merk + " " + data[maxIndex].ukuran + " " + data[maxIndex].harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}

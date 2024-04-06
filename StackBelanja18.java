class StackBelanja18 {
     Belanja18[] stackBelanja;
     int top;
     int size;

    public StackBelanja18(int size) {
        this.size = size;
        stackBelanja = new Belanja18[size];
        top = -1;
    }

    public void push(Belanja18 belanja) {
        if (top == size - 1) {
            System.out.println("Stack penuh, tidak bisa menambahkan data lagi");
        } else {
            stackBelanja[++top] = belanja;
        }
    }

    public Belanja18 pop() {
        if (top == -1) {
            System.out.println("Stack kosong, tidak ada data yang bisa diambil");
            return null;
        } else {
            return stackBelanja[top--];
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackBelanja[i]);
        }
    }
}

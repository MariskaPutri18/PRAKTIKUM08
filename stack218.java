public class stack218 {
    int size;
    int top;
    Pakaian18 data[];

    public stack218(int size){
        this.size = size;
        data = new Pakaian18[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1) {
            return true; 
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (top == size-1){
            return true;
        } else 
        {
            return false;
        }
    }

    public void push(Pakaian18 pkn){
        if (!isFull()){
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop (){
        if (!IsEmpty()){
            Pakaian18 x = data [top];
            top --;
            System.out.println("Data yang keluar: "+ x.jenis + " " + x.warna + 
            " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("stack masih kosong;");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas : "+ data[top].jenis + " " + data[top].warna + 
        " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print (){
        System.out.println("Isi stack: ");
        for (int i = top; i>=0; i --){
            System.out.println(data[i].jenis + " " + data[i].warna + 
            " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }

    public void clear (){
        if (!IsEmpty ()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("stack sudah dikosongkan");
        } else {
            System.out.println("stack masih kosong");
        }
    }
}

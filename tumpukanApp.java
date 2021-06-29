package stack;
public class tumpukanApp {
    public static void main(String[] args){
        tumpukan tumpuk= new tumpukan(10);
        tumpuk.push(41);
        tumpuk.baca();
        tumpuk.push(30);
        tumpuk.baca();
        
        long nilai = tumpuk.peek();
        System.out.println("nilai teratas="+nilai);
        System.out.println("nama saya adalah mentari putri meyranita");
        long nilai1 = tumpuk.pop();
        System.out.println("nilai yang dihapus="+nilai1);
        tumpuk.baca();
        System.out.println(" ");
        tumpuk.push(40);
        tumpuk.baca();
        tumpuk.push(50);
        tumpuk.baca();
        
    }
}

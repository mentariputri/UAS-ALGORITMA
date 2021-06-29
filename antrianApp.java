package queue;
public class antrianApp {
    public static void main(String[] args){
        antrian antrian= new antrian(10);
        antrian.enqueue(10);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan adalah = " + antrian.peek());
        System.out.println("nama saya adalah mentari putri meyranita");
        antrian.enqueue (70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
}
}

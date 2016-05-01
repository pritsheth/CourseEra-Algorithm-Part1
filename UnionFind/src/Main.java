/**
 * Created by Jerry on 30-04-2016.
 */
public class Main {

    public static void main(String[] args) {

        QuickUnion quickFind = new QuickUnion(10);
        quickFind.quickUnion(0, 1);
        quickFind.quickUnion(0, 2);
        quickFind.quickUnion(0, 3);
        quickFind.quickUnion(4, 5);
        quickFind.quickUnion(4, 6);

        System.out.println(quickFind.isConnecnted(0, 4));
        quickFind.quickUnion(0, 6);
        System.out.println(quickFind.isConnecnted(0, 4));
        System.out.println(quickFind.isConnecnted(0, 5));


    }

}

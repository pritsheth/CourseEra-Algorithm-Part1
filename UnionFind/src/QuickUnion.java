/**
 * Created by Jerry on 30-04-2016.
 */
public class QuickUnion {
    int id[];

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i++)
            id[i] = i;
    }

    private int getRoot(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    //It will take O(N) time
    public void quickUnion(int source, int destination) {
        int destinationRoot = getRoot(destination);
        int sourceRoot = getRoot(source);
        id[sourceRoot] = destinationRoot;
    }

    //In constant time
    public boolean isConnecnted(int source, int destination) {
        return getRoot(destination) == getRoot(source);
    }

}

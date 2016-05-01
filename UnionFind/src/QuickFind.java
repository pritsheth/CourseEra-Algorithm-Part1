/**
 * Created by Jerry on 30-04-2016.
 */
public class QuickFind {

    int id[];

    public QuickFind(int N) {
        id = new int[N];
        for(int i=0;i<id.length;i++)
        id[i]=i;
    }

    //It will take O(N) time
    public void union(int source , int destination){
     int destinationId = id[destination];
     int sourceId = id[source];

        //changing the destinationIds to sourceIds
        for(int i=0;i<id.length;i++)
        if(id[i]==destinationId)
            id[i]=sourceId;

    }
    //In constant time
    public boolean quickFind(int source, int destination){
        return id[source]==id[destination];
    }

}

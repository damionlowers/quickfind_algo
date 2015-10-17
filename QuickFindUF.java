
/**
 * Write a description of class QuickFindUF here.
 * 
 * @author (Damion Lowers) 
 * @version (a version number or a date)
 */
public class QuickFindUF
{
    // instance variables - replace the example below with your own
    private int[] id;

    /**
     * Constructor for objects of class QuickFindUF
     */
    public QuickFindUF(int n)
    {
        // initialise instance variables
        id = new int[n];
        for(int i=0;i<n; i++){
            id[i] = i;
        }
    }
    
    
    public boolean connected(int p,int q){
        return id[p] == id[q];
    }
    
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i=0;i<id.length;i++){
            if( id[i] == pid ) id[i] = qid;
        }
    }
    
    public String toString(){
        String output = "";
        for(int i=0;i<id.length;i++){
            output = output + id[i] + ",";
        }
        return output;
    }
}

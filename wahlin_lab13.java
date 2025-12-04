import java.util.ArrayList;
public class wahlin_lab13 {
    private ArrayList<Integer> values;

    public void readData(String filename){

    }

    public long getTotalCount(){
        return values.stream().count();
    }

    public long getOddCount(){
        //return values.stream();
    }

    public long getEvenCount(){
        return -1;
    }

    public long getDistinctGreaterThanFiveCount(){
        return -1;
    }

    public Integer[] getResult1(){
        return null;
    }

    public Integer[] getResult2(){
        return null;
    }

    public Integer[] getResult3(){
        return null;
    }
}

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class wahlin_lab13 {
    private ArrayList<Integer> values;

    public void readData(String filename){
        values = new ArrayList<Integer>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line = br.readLine()) != null){
                int ynt = Integer.parseInt(line);
                values.add(ynt);
            }
        }
        catch(Exception e){
            System.err.println("Error during file read process! " + e.getMessage() + e.toString());
            System.exit(0);
        }
        
    }

    public long getTotalCount(){
        return values.stream().count();
    }

    public long getOddCount(){
        List<Integer> oddvals = values.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        return oddvals.size();
    }

    public long getEvenCount(){
        List<Integer> evenvals = values.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        return evenvals.size();
    }

    public long getDistinctGreaterThanFiveCount(){
        List<Integer> g5 = values.stream().filter(n -> n > 5).distinct().collect(Collectors.toList());
        return g5.size();
    }

    public Integer[] getResult1(){
        List<Integer> r1 = values.stream().filter(n -> n > 5 && n < 50 && n % 2 == 0).sorted().collect(Collectors.toList());
        return r1.toArray(new Integer[0]);
    }

    public Integer[] getResult2(){
        List<Integer> r2 = values.stream().map(n -> n * n * 3).limit(50).collect(Collectors.toList());
        return r2.toArray(new Integer[0]);
    }

    public Integer[] getResult3(){
        List<Integer> r3 = values.stream().filter(n -> n % 2 != 0).map(n -> n*2).sorted().skip(20).distinct().collect(Collectors.toList());
        return r3.toArray(new Integer[0]);
    }
}

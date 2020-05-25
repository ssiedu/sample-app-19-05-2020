
public class ForEachExampleThree {

    public static void main(String[] args) {

        int x[][]={{10,20},{30,40},{50,60},{70,80},{90,100}};
        
        for(int row[]:x){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println("");
        }
        
        
    }
}

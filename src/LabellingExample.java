
public class LabellingExample {
    public static void main(String[] args) {

        p:  for(int i=1; i<=3; i++){
        q:      for(int j=1; j<=4; j++){
                    if(j==3){
                        break p;
                    }
                    System.out.println(j);  
                }
            }
    }
}

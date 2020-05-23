
public class IfElseExample {

    public static void main(String[] args) {

            int per=20;
            
            String div="";
            
            if(per>=60){
                div="I";
            }else if(per>=45){
                div="II";
            }else if(per>=33){
                div="III";
            }else{
                div="FAIL";
            }
            
            System.out.println("DIVISION  : "+div);
        
    }
}


public class SwitchCaseExampleTwo {
    public static void main(String[] args) {
        String state="RJ";
        String capital="";
        
        switch(state){
            case "MP":
                capital="Bhopal";
            break;
            case "MH":
                capital="Mumbai";
            break;
            case "RJ":
                capital="Jaipur";
            break;
        }
        
        System.out.println("Capital of "+state+" is "+capital);
    }
}

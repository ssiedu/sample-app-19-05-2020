
public class ConversionExample {

    public static void main(String[] args) {

        long v=(long)23.4f;
        
        //byte b1=100;
        
        //int i=10;
        //byte b2=(byte)i;
        
        
        
        
        //case-1 (types are same)(conversion not required)
        int v1=10;
        double v2=2.5;
        
        //case-2 (types are diff)
        //case-2-a (no-error)(implicit conversion)
        double v3=10;
        long v4=5;
        //case-2-b (possible loss of precisions) (force fully conversion required) (explicit coversion)
        //we can convert value of one to type to another type using cast operator (data-type)
        int v5=(int)15.23;  //(double->int)
        System.out.println(v5); //.23 is your data loss.
        float v6=(float)15.23; //(double->float)
        //case-2-c (incovertible types) (conversion not possible)
        //double v7=(double)true;
        //boolean b=1;
        
    }
}

/*
    1) put f and make it a float value.
    2) take your variable type double.
    3) type-conversion (cast-operator)
*/

public class VariableExample {
    //Instance variable
    int InstanceVariable=100;
    //Instance variable can only be used in an object
    static boolean staticvariable=true;
    //To make an instance variable keyword 'static' is used before datatype
    //Local variable can be used inside a function
    void functionTest(){
        int LocalVariable=200;
        //here local variiable ony be used inside the functiontest()
        System.out.println(LocalVariable);

    }
    public static void main(String[] args) {
        //to make an object of a class, class name is the data type
        //To initiallize we use "new" keyword and end with the class name();
        VariableExample variableeeobj = new VariableExample();


        VariableExample variable1=new VariableExample();
        variable1.InstanceVariable=500;
        System.out.println("Instance Variable2:"+variable1.InstanceVariable);
        VariableExample.staticvariable= false;
        System.out.println("Static variable"+VariableExample.staticvariable);
        //Using instance variable through the object objName.variable
        System.out.println("Instance Vriable:"+variableeeobj.InstanceVariable);
        //Using static variable through calss directly
        System.out.println(VariableExample.staticvariable);





        /**
         * primitive data type type casting
         * Widening Casting/Implicit casting(Automatic)
         * -converting a smaller type to a larger type size----- ---byte -> short -> char -> int -> long -> float -> double
        */
         byte var1=10;
         short shortvar1=var1;//byte is automaticall converted into short
         System.out.println(shortvar1);


        /* 
         * Narrowing Casting|Explicit casting (manually) 
         * - converting a larger type to a smaller size type------- double -> float -> long -> int -> char -> short -> byte
         */


         float marks=91.235f;
         int intmarks= (int)marks;
         System.out.println("Int conversion:"+intmarks);
         int intkmarks = (int)12.55f;
         System.out.println("Int conversion:"+intkmarks);

        
    }
}

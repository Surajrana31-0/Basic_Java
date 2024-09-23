public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        //+,-,*,/,%
        int val1=20, val2=30;
        int add=val1+val2;
        int sub=val1-val2;
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);

        //Assignment operators
        //=,+=,-=,/=,%=
        int AssignmentOperator=300;
        AssignmentOperator+=200;
        System.out.println("Assignment:"+AssignmentOperator);
        AssignmentOperator-=200;
        System.out.println("Assignment:"+AssignmentOperator);
        AssignmentOperator*=200;
        System.out.println("Assignment:"+AssignmentOperator);
        AssignmentOperator/=200;
        System.out.println("Assignment:"+AssignmentOperator);
        AssignmentOperator%=200;
        System.out.println("Assignment:"+AssignmentOperator);

        //Relational Operators
        //true,false
        boolean Var1=100>=20;
        System.out.println("Bollean Value:"+Var1);
        boolean Var2=20>20;
        System.out.println("Equals to:"+Var2);
        boolean Var3=30!=10;
        System.out.println("Not equals operator:"+Var3);


        //Logical Operators
        //&&,||,!
        //Used between two boolean stsement
        boolean Log1=true&&false;
        System.out.println("AND gate:"+Log1);
        boolean AndExtended=(10>12)&&(20<30);
        System.out.println("Numerical AND:"+AndExtended);
        int logicVar1=20, logicVar2 = 30, logicVar3 = 30;
        boolean orlogic = (logicVar1== logicVar3) || (logicVar2 < logicVar1) || (logicVar1 == logicVar3);
        System.out.println("OR Gate:"+orlogic);
        boolean notlogic = !(10==10);
        System.out.println("NOT Gate:"+notlogic);


        // unary
        int intExample = 10 ;
        intExample --; //intExample
        intExample ++; //intExample
        System.out.println("Unary Operators:"+intExample);
    }
}

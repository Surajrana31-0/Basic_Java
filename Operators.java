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
    }
}

public class UserOutput {
    public static void main(String[] args) {
        /*Tternary operator
         * int marketing1=40;
         * int marketing2=45;
         * String status;
         * if (marketing1>30 && marketing2>30){
         * Status ="PAss";
         * }else{
         * status ="Fail";
         * }
        */
        int marketing1=40;
        int marketing2=45;
        String status = (marketing1>30 && marketing2>30) ? "Pass":"Fail";
        System.out.println("Status:"+status);



        /*Standerd Output
         * Print continous
         * Print Next line
         * Print Formating
         * Printf()
         * %f-> floating number, %d->integer, %s-> string(any)
        */
        System.out.printf("Name %s, Age %d, Weight %f", "Suraj",21,79.5);
        //The Formater must match the pattern of remaining argument
        //The arrangement %s than %d than %f
        //The remaining argument must be String ,int and floating number
        

    }
}

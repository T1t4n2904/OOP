class main{

    static class X {
        private static String str = "Inside Class X";
    }

    public static void main(String args[]){ 
        //X.str="Inside Class main"; 
        System.out.println("String stored in str is- "+ X.str); 
    }
}
class Bank {
    public int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank {
    public int getRateOfInterest(){
        return 8;
    }
}

class AXIS extends Bank {
    public int getRateOfInterest(){
        return 9;
    }
}

class ICICI extends Bank {
    public int getRateOfInterest(){
        return 7;
    }
}

class Main{
    public static void main(String args[]) {
        System.out.println("\nINTEREST RATES");
        SBI mySBI = new SBI();
        ICICI myICICI = new ICICI();
        AXIS myAXIS = new AXIS();
        System.out.println("SBI : "+mySBI.getRateOfInterest()+"%");
        System.out.println("ICICI : "+myICICI.getRateOfInterest()+"%");
        System.out.println("AXIS : "+myAXIS.getRateOfInterest()+"%");
    }
}









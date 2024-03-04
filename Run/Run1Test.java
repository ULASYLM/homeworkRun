package Run;

public class Run1Test {
    public static void main(String[] args) {
        int runnerArray[]={341,273,278,329,445,402,388,270,243,334,412,349,299,343,317,265};
        String nameArray[]={"Kadir","Gökhan","Hakan","Suzan","Pinar","Mehmet","Ali","Emel",
        "Firat","James","Jale","Ersin","Deniz","Gozde","Anil","Burak"};
        Run1 myRun1= new Run1(nameArray,runnerArray);
        myRun1.processRunner();
    }
}

package Run;

public class Run1 {
    private int[] run;
    private String[] name;
    public Run1(String[] nameArray, int[] runnerArray) {
        name = nameArray;
        run = runnerArray;}
    public void processRunner() {
        outputSira();nameRunner1();nameRunner2();nameRunner3();
        groupABC();}
    public void outputSira() {
        for (int x = 0; x < run.length; x++)
            System.out.println(name[x] + " : " + run[x]);}
    public void nameRunner1() {
        int high1 = run[0];
        String nam1 = name[0];
        for (int r = 0;run.length > r; r++) {
            if (high1 > run[r]){
                high1 = run[r];
                nam1 = name[r];}}
        System.out.println("Birinci: " +nam1 +" " +high1);
    }
    public void nameRunner2(){
        int high1 = run[0],high2=run[0];
        String nam1 = name[0],nam2=name[0];
        for (int r = 0;run.length > r; r++) {
            if (high1 > run[r]){
                high2=high1;high1 = run[r];
                nam2=nam1;nam1 =name[r];}
            else if (high2>run[r]){
                high2=run[r];
                nam2=name[r];}}
        System.out.println("Ikinci:"+" "+nam2 +" "+ high2);
    }
    public void nameRunner3(){
        int high1 = run[0],high2=run[0],high3=run[0];
        String nam1 = name[0],nam2=name[0],nam3=name[0];
        for (int r = 0;run.length > r; r++) {
            if (high1 > run[r]){
                high2=high1;high1 = run[r];
                nam2=nam1;nam1 =name[r];}
            else if (high2>run[r]){
                high3=high2;high2=run[r];
                nam3=nam2;nam2=name[r];}
        else if (high3>run[r]){
        high3=run[r];nam2=name[r];}}
        System.out.println("Ucuncu:"+" "+nam3 +" "+high3);}
public void groupABC(){
        int a=0,b=0,c=0;
        for (int r:run){
            if (r>200&r<300)
                a+=1;
        else  if (r>300&&r<400)
                b+=1;
            else c+=1;}
    System.out.println("A-> "+" "+a);
    System.out.println("B-> "+" "+b);
    System.out.println("C-> "+" "+c);}}

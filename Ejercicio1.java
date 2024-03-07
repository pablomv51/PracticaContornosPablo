public class Ejercicio1 {
    public static void main(String[] args) {

        int num[][]= new int[3][6];
        num[0][0]=0;
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;

        num[1][0]=75;
        num[1][0]=30;

        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
        System.out.println("\t \t" + "C0" + "\t" + "C1" + "\t" + "C2" + "\t" + "C3" + "\t" + "C4" + "\t" + "C5" );
        System.out.println("F1: " + "\t" + num[0][0] + "\t" + num[0][1] + "\t" + num[0][2] + "\t " + num[0][3] + "\t" + num[0][4] + "\t" + num[0][5]);
        System.out.println("F2: " + "\t" + num[1][0] + "\t" + num[1][1] + "\t" + num[1][2] + "\t " + num[1][3] + "\t" + num[1][4] + "\t" + num[1][5]);
        System.out.println("F3: " + "\t" + num[2][0] + "\t" + num[2][1] + "\t" + num[2][2] + "\t " + num[2][3] + "\t" + num[2][4] + "\t" + num[2][5]);
    }
}

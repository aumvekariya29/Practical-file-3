import java.util.ArrayList;
import java.util.Vector;

public class P3_2 {
    public static void main(String[] args) {
        Details d[] = new Details[5];
        d[0] = new Details();
        d[1] = new Details();
        d[2] = new Details();
        d[3] = new Details();
        d[4] = new Details();
        Vector<Details> object1 = new Vector<>();
        object1.add(d[0]);
        object1.add(d[1]);
        object1.add(d[2]);
        object1.add(d[3]);
        object1.add(d[4]);
        for (int i = 0; i < 5; i++) {
            d[i].getPersonalDetails();
            d[i].getJobDetails();
            System.out.println("\n");
        }
        for (int j = 0; j < 5; j++) {
            d[j].displayPersonalDetails();
            d[j].displayJobDetails();
        }
        System.out.println("This program is made by 21CE150_Aum");
    }
}

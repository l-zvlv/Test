package packagenew;

import java.util.ArrayList;
import java.util.HashMap;

public class Newclass  {
    public int a = 5;
    private static int b = 7;
    protected int c = 9;
    int d = 15;
    public static void main(String[] args) {
        int per = 10;
        String str = "name";
        int k = 0;
                if (b == 7) {
            System.out.println("Переменная равна десяти");
        }
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
            while ( k<6) {
                System.out.println(k);
                k++;
            }
            ArrayList<String> mas = new ArrayList<String>();
            mas.add("q");
            mas.add("w");
            mas.add("e");
            mas.add("r");
        for (String mass : mas) {
            System.out.println(mass);
            
        }
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Kate","Bulanova");
        map.put("Eliz","Karul");
        map.put("Dan","Luizov");

        for (String x : map.keySet()
             ) {
            System.out.println(map.get(x));

        }

        }
    public int getA() {
        return a;
    }

}

package matrica.suma;

public class MatricaSuma {

    public static void main(String[] args) {
        int[][] num = {
                        { 1, 2, 3, 4, 5 },
                        { 1, 2, 3, 4, 5 },
                        { 1, 2, 3, 4, 5 },
                        { 1, 2, 3, 4, 5 },
                        { 1, 2, 3, 4, 5 }
                      };
        int kolona0 = 0;
        int kolona1 = 0;
        int kolona2 = 0;
        int kolona3 = 0;
        int kolona4 = 0;
        for (int i = 0; i < num.length; i++)
        {
            kolona0 +=num[i][0];
            kolona1 +=num[i][1];
            kolona2 +=num[i][2];
            kolona3 +=num[i][3];
            kolona4 +=num[i][4];
         
        }
       System.out.println(kolona0); 
       System.out.println(kolona1);
       System.out.println(kolona2);
       System.out.println(kolona3);
       System.out.println(kolona4);
    }
    
}

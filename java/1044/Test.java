import java.util.Scanner;
public class Test{
    public static int evaluate(String[] dungeon, Jewel[] Jewel, 
            int me_position, int exit_position){
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int j = 1; j <= cases; j++){
            int width = in.nextInt();
            int height = in.nextInt();
            int limits = in.nextInt();
            int num_jewels = in.nextInt();
            Jewel[] jewels = new Jewel[num_jewels];
            int i = 0;
            char jewel_start = 'A';
            for(i = 0; i < num_jewels; i++){
                jewels[i] = new Jewel(jewel_start++, in.nextInt());
            }
            String[] dungeon = new String[height];
            int me = 0;
            int exit = 0;
            for(i = 0; i < height; i++) {
                dungeon[i] = in.next();
                if(dungeon[i].contains("@")){
                    me = i;
                }
                if(dungeon[i].contains("<")){
                    exit = i;
                }
            }
            System.out.println("Case "+j+":");
            int values = evaluate(dungeon, jewels, me, exit);
            if(values == -1){
                System.out.println("Impossible");
            }else{
                System.out.println("The best score is "+values+".");
            }
            if(j < cases){
                System.out.println();
            }
        }
        
        
        
        

    }
}
class Jewel{
    private char jewel;
    private int value;
    public Jewel(char jewel, int value){
        this.jewel = jewel;
        this.value = value;
    }
    public boolean equals(Jewel jewel){
        return this.jewel == jewel.jewel;
    }
}

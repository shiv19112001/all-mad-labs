public class Main{
    public static void main(String[]args){
        for(int i=4; i>=1; i--){
            for(int j=i; i>=1; j--)
                System.out.print(" ");
            for(int k=1; k<=5-i; k++)
                System.out.print("*");
            System.out.println();
    }
}
}
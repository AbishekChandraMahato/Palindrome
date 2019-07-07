import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfItems;
        numberOfItems=sc.nextInt();
        String[] items=new String[numberOfItems];


        Scanner sc1= new Scanner(System.in);
        for (int i = 0; i <items.length ; i++) {
            items[i]=sc1.nextLine();

        }
        String temp="";

        for (int i = 0; i <items.length ; i++) {
            for (int j = items[i].length(); j >0; j--){
                temp+=items[i].substring(j-1,j);

            }
            if(temp.equals(items[i])){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }

            temp="";

        }


    }
}

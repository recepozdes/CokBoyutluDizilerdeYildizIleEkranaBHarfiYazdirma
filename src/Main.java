public class Main {

    public static void main(String[] args) {

        String[][] bLetter=new String[7][4];

        for(int i=0;i<bLetter.length;i++){
            for(int j=0;j<bLetter[i].length;j++){
                if((i==0||i==3||i==6)&&j!=3){
                    bLetter[i][j]=" * ";
                }
                else if((i==1||i==2||i==4||i==5)&&(j==0||j==3)){
                    bLetter[i][j]=" * ";
                }else{
                    bLetter[i][j]="   ";
                }

            }
        }

        for (int i = 0; i < bLetter.length; i++) {
            for (int j = 0; j < bLetter[i].length; j++) {
                System.out.print(bLetter[i][j]);
            }
            System.out.println();
        }
    }
}

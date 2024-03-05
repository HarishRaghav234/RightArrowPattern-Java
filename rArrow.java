public class rArrow {
    public static void main(String[] args){
        int StarLoop=1,StarLoopTwo=2;
        int StarinMiddle=8;
        /*
         *      *
         *      **
         * ********
         * *********
         * ********
         *      **
         *      *
         */
        int spaces=5;
        for(int i=0;i<2;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int k=0;k<StarLoop;k++){
                System.out.print("*");
            }
            StarLoop++;
            System.out.println();
        }
        for(int l=0;l<3;l++){
            for(int m=0;m<StarinMiddle;m++){
                System.out.print("*");
            }
            System.out.println();
            if(StarinMiddle==9){
                StarinMiddle=8;
            }
            else{
                StarinMiddle++;
            }
        }
        for(int n=0;n<2;n++){
            for(int o=0;o<spaces;o++){
               System.out.print(" ");
            }
            for(int p=0;p<StarLoopTwo;p++){
                System.out.print("*");
            }
            StarLoopTwo--;
            System.out.println();
        }

        }
    }


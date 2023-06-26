package homeworks.battleShip;

import java.util.Arrays;

public class BattleShip {
    public static void main(String[] args) {
            int soloShip = 0;
            int doubleShip = 0;
            int middleShip = 0;
            int bigShip = 0;

            if(middleShip>2){
                throw new IllegalArgumentException("Слишком много трехпалубных кораблей");
            }
            if(bigShip>1){
                throw new IllegalArgumentException("Слишком много четырехпалубных кораблей");
            }
            int [][] array = new int[10][10];
            array[2][2]=1;
            array[5][2]=1;
            array[1][1]=1;
            array[9][9]=1;
            array[1][9]=1;
            array[2][9]=1;
            array[9][8]=1;
            array[9][0]=1;
            array[8][0]=1;
            array[9][7]=1;


            SoloShip soloShip1 = new SoloShip();
            DoubleShip doubleShip1 = new DoubleShip();
//    DoubleShip doubleShip1 = new DoubleShip();

//        System.out.println(doubleShip1.findDoubleShip(array));
            System.out.println(soloShip1.findSoloShip(array));
            System.out.println(doubleShip1.findDoubleShip(array));
//    for(int x = 0; x<array.length; x++){
//        System.out.println(Arrays.toString(array[x]));
//        for(int y = 0; y<array.length; y++){
//            if(array[y][x]!=0 && array[y][x+1]==0 && array[y+1][x]==0){
//                soloShip++;
//            }
//        }
//    }
//        System.out.println(soloShip);
            for (int i =0; i< array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }

}

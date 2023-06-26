package homeworks.battleShip;

public class SoloShip {
    public int findSoloShip(int[][]array) {
        int soloShip = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (array[y][x] != 0) {
                if((y==0 || y==9) && (x>0 || x<9)) {
                    if (array[y][x + 1] == 0 && array[y][x - 1] == 0) {
                        soloShip++;}
                    }
                if((x==0 || x==9) && (y>0 || y<9)){
                    if (array[y+1][x] == 0 && array[y-1][x] == 0) {
                        soloShip++;}
                }

                }



//                if (array[y][x] != 0) {
                    if(y<array.length-1 && x< array.length-1){
                        if(array[y][x + 1] == 0 && array[y + 1][x] == 0){
                            soloShip++;
                        }
                    }else if(x== array.length-1 && y== array.length-1 && array[array.length-2][array.length-1]==0 && array[array.length-1][array.length-2]==0){
                        soloShip++;
                    }
//                }
            }
        }
        if (soloShip > 4) {
            throw new IllegalArgumentException("Слишком много однопалубных кораблей");
        }
        return soloShip;
    }

}

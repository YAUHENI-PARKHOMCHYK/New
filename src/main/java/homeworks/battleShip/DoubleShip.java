package homeworks.battleShip;

public class DoubleShip {
    public int findDoubleShip(int[][]array) {
        int doubleShip = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (array[y][x] != 0) {
                    if(y<array.length-2 && x< array.length-2){
                        if(array[y][x + 1] != 0 && array[y + 1][x] != 0 && array[y][x + 2] == 0 && array[y + 2][x] == 0){
                            doubleShip++;
                        }
                    }
                    if(x== array.length-1 && y<=array.length-2){
                        if(array[y+1][x] !=0 && array[y-2][x]==0) {
                            doubleShip++;
                        }
                    }if(y== array.length-1 && x<=array.length-2){
                        if(array[y][x+1] != 0 && array[y][x-2]==0){
                            doubleShip++;
                        }
                    }
                }
            }
        }
        if(doubleShip>3){
            throw new IllegalArgumentException("Слишком много двухпалубных кораблей");
        }
        return doubleShip;
    }
}

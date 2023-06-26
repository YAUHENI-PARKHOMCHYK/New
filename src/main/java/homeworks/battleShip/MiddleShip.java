package homeworks.battleShip;

public class MiddleShip {
    public int findMiddleShip(int[][]array){
        int middleShip = 0;
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (array[y][x] != 0) {
                    if(y<array.length-3 && x< array.length-3){
                        if(array[y][x + 1] != 0 && array[y + 1][x] != 0 && array[y][x + 2] != 0 && array[y + 2][x] != 0 && array[y][x + 2] == 0 && array[y + 2][x]==0){
                            middleShip++;
                        }
                    }
                    if(x== array.length-1 && y<=array.length-3){
                        if(array[y+1][x] !=0 && array[y+2][x]!=0) {
                            middleShip++;
                        }
                    }if(y== array.length-1 && x<=array.length-3){
                        if(array[y][x+1] != 0 && array[y][x+2]!=0){
                            middleShip++;
                        }
                    }
                }
            }
        }
        if(middleShip>2){
            throw new IllegalArgumentException("Слишком много трехпалубных кораблей");
        }
        return middleShip;
    }
}

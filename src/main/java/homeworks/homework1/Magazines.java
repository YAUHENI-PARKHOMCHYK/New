package homeworks.homework1;

public class Magazines {
    private String magazineName;
    private int price;
    private int yearMagazine;
    private int numberMagazine;

    public Magazines(String magazineName, int price, int yearMagazine, int numberMagazine) {
        this.magazineName = magazineName;
        this.price = price;
        this.yearMagazine = yearMagazine;
        this.numberMagazine = numberMagazine;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "magazineName='" + magazineName + '\'' +
                ", price=" + price +
                ", yearMagazine=" + yearMagazine +
                ", numberMagazine=" + numberMagazine +
                '}';
    }

    public int getPrice() {
        return price;
    }

    //    public void draw(){
//        if(price >= 1000){
//            System.out.println("Извините мы не можем выдать вам " + magazineName + "стоимостью " + price);
//        }
//        System.out.println("Журнал " + magazineName +"год выпуска" + yearMagazine + "номер журнала " + numberMagazine);
//    }
}

package homeworks.homework1;

public class Books {


        private String bookName;
        private int isbn;
        private int price;
        private String userName;
        private int shelf;


        public Books(String bookName, int isbn, int price, int shelf) {
            this.bookName = bookName;
            this.isbn = isbn;
            this.price = price;
            this.shelf = shelf;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "bookName='" + bookName + '\'' +
                    ", isbn=" + isbn +
                    ", price=" + price +
                    ", shelf=" + shelf +
                    '}';
        }
}

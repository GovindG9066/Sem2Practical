package Feb_23;

class Book{
    String title;
    String author;
    int price;
    String isbn;

    public Book(String title,String author,int price,String isbn){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isbn=isbn;
    }
    void discount(int dis){
        System.out.println("---------------------");
        int tempDis=price/dis;
        System.out.println("Original price is:"+price);
        System.out.println("Discounted price is:"+(price-=tempDis));
        System.out.println(dis+"% of discount applied");
    }
    void display(){
        System.out.println("---------------------");
        System.out.println("Book details :");
        System.out.println("Book Title:"+title);
        System.out.println("Author of the book:"+author);
        System.out.println("price of the book:"+price);
        System.out.println("ISBN Num is :"+isbn);
    }
}

public class BookShop {
    public static void main(String[] args) {
        Book b1=new Book("Python","Gudo van russam",300,"152-96-854-632-15");
        b1.display();
        b1.discount(10);
        b1.display();
    }
}

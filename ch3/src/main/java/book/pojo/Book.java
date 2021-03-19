/*
 * Date: 2021/3/19
 * Author: <https://www.github.com/shaozk>
 */

package book.pojo;

/**
 * @author shaozk
 * @Description: TODO
 */
public class Book {
    String name;
    String press;
    String price;
    String author;

    public Book(String name, String press, String price, String author) {
        this.name = name;
        this.press = press;
        this.price = price;
        this.author = author;
    }


    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", press='" + press + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

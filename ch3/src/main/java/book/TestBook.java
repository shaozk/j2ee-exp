/*
 * Date: 2021/3/19
 * Author: <https://www.github.com/shaozk>
 */

package book;

import book.pojo.Book;
import book.service.BookService;
import book.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: 测试book保存
 */
public class TestBook {

    private static BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookServiceImpl bookService) {
        TestBook.bookService = bookService;
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bookContext.xml");

        // 使用构造方法装配测试
        Book book1 = (Book) applicationContext.getBean("bookConstructor");
        bookService.add(book1);

        // 使用setter方法装配测试
        Book book2 = (Book) applicationContext.getBean("bookSetter");
        bookService.add(book2);
    }


}

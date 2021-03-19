/*
 * Date: 2021/3/19
 * Author: <https://www.github.com/shaozk>
 */

package book.service;

import book.dao.BookDao;
import book.pojo.Book;

/**
 * @author shaozk
 * @Description: TODO
 */
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void add(Book book) {
        bookDao.save(book);
    }
}

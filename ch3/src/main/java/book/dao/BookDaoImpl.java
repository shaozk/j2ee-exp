/*
 * Date: 2021/3/19
 * Author: <https://www.github.com/shaozk>
 */

package book.dao;

import book.pojo.Book;

/**
 * @author shaozk
 * @Description: TODO
 */
public class BookDaoImpl implements BookDao{
    @Override
    public void save(Book book) {
        System.out.println(book + "正在保存。。。");
    }
}

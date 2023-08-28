package CleanCode.service;

import CleanCode.entities.Book;
import CleanCode.model.requestDTO.UpdateBookDTO;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    /**
     * consider
     * this book service class as library class
     * that will manage all the operations related to Book
     */

    // using this bookList as temporary storage
    private static List<Book> bookList = new ArrayList<>();

    Logger log = LoggerFactory.getLogger(BookServiceImpl.class);


    @Override
    public List<Book> getBookListByAuthorId(Long authorId) {
        // TODO: will add logic later
        return null;
    }

    @Override
    public Book getBookByBookTitle(String bookTitle) {
        // TODO: will add logic later

        return null;
    }

    @Override
    public Book updateBook(UpdateBookDTO updateBookDTO) {
        // TODO: will add logic later

        return null;
    }

    @Override
    public void addBook(Book book) {
        if (book != null) {
            bookList.add(book);
            log.trace("Book Added SuccessFully");
        }
        else
            log.warn("Book is null !");
    }

    @Override
    public int getCountOfBooks() {
        log.trace("count of books in store :" + bookList.size());
        return bookList.size();
    }
}

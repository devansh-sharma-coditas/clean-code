package CleanCode.service;

import CleanCode.entities.Book;
import CleanCode.model.requestDTO.UpdateBookDTO;

import java.util.List;

public interface BookService {
    List<Book> getBookListByAuthorId(Long authorId);

    Book getBookByBookTitle(String bookTitle);

    Book updateBook(UpdateBookDTO updateBookDTO);

    void addBook(Book book);

    int getCountOfBooks();
}

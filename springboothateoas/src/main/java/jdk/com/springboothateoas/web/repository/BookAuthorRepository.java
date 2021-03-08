package jdk.com.springboothateoas.web.repository;

import jdk.com.springboothateoas.support.jpa.CustomJpaRepository;
import jdk.com.springboothateoas.web.entity.Author;
import jdk.com.springboothateoas.web.entity.Book;
import jdk.com.springboothateoas.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}

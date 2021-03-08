package jdk.com.springboothateoas.web.repository;

import java.util.Set;

import jdk.com.springboothateoas.support.jpa.CustomJpaRepository;
import jdk.com.springboothateoas.web.entity.Book;

/**
 * <b>Book Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookRepository extends CustomJpaRepository<Book, Long> {

	public Book findByBookName(String bookName);

	public Set<Book> findByBookAuthors_Author_Id(Long authorId);
}

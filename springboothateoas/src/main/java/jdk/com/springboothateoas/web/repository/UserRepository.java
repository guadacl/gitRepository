package jdk.com.springboothateoas.web.repository;

import jdk.com.springboothateoas.support.jpa.CustomJpaRepository;
import jdk.com.springboothateoas.web.entity.User;

/**
 * <b>User Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface UserRepository extends CustomJpaRepository<User, Long> {

	/**
	 * Find user by username
	 * 
	 */
	public User findByUsername(String username);
}

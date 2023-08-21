
package tran.andrew.javabelt.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tran.andrew.javabelt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);

	// the find by is a keyword and the email is what it is looking for which
	// defined as string
}

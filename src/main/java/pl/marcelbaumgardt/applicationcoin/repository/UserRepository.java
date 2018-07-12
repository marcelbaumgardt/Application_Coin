package pl.marcelbaumgardt.applicationcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcelbaumgardt.applicationcoin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

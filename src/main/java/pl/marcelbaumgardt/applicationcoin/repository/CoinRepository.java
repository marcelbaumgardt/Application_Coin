package pl.marcelbaumgardt.applicationcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcelbaumgardt.applicationcoin.model.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin,Long> {
}

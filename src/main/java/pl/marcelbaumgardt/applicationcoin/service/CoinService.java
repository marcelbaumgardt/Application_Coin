package pl.marcelbaumgardt.applicationcoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marcelbaumgardt.applicationcoin.model.Coin;
import pl.marcelbaumgardt.applicationcoin.repository.CoinRepository;

@Service
public class CoinService {


    CoinRepository coinRepository;

    @Autowired
    public CoinService(CoinRepository coinRepository) {

        this.coinRepository = coinRepository;
    }



    public void addCoinRate(Coin coin) {
       coinRepository.save(coin);

    }
}

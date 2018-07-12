package pl.marcelbaumgardt.applicationcoin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.marcelbaumgardt.applicationcoin.model.Coin;
import pl.marcelbaumgardt.applicationcoin.service.CoinService;

@RestController
public class CoinController  {


    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders httpHeaders = new HttpHeaders();


    CoinService coinService;

    @Autowired
    public CoinController(CoinService coinService) {


        this.coinService = coinService;
    }



    public void getCoinRate(String baseCoin,String quoteCoin){

        httpHeaders.add("X-CoinAPI-Key","ECCD02B3-E440-457F-89E7-C5B87BF58A83");
        HttpEntity<String> entity=new HttpEntity<>("parameters",httpHeaders);
        String URL = "https://rest.coinapi.io/v1/exchangerate/"+baseCoin+"/"+quoteCoin;
        ResponseEntity<Coin> exchange = restTemplate.exchange(URL, HttpMethod.GET, entity, Coin.class);
        Coin body = exchange.getBody();
        coinService.addCoinRate(body);

    }
}

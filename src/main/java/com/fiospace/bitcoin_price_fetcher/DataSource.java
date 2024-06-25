package com.fiospace.bitcoin_price_fetcher;

public interface DataSource {
    String getPrice() throws Exception;
}

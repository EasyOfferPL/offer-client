package com.easyoffer.offer_client.client;

import com.easyoffer.offer_client.to.OfferTO;
import feign.RequestLine;

import java.util.List;

public interface OfferClient {

    String OFFER_PATH = "/v1.0/offers";

    @RequestLine("GET " + OFFER_PATH)
    List<OfferTO> getOffers();

}

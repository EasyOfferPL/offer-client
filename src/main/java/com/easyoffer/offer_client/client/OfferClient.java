package com.easyoffer.offer_client.client;

import com.easyoffer.offer_client.to.OfferTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1.0/offers")
public interface OfferClient {

    @GetMapping("/{id}")
    OfferTO getOfferById(@PathVariable("id") Long id);

}
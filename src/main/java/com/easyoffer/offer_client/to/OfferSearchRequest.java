package com.easyoffer.offer_client.to;

import lombok.Data;

import java.util.List;

@Data
public class OfferSearchRequest {
    private List<Long> ids;
}

package com.easyoffer.offer_client.to;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class OfferTO implements Serializable {

    private Long version;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Long id;
    private OfferTypeTO type;
    private OfferContextTO offerContext;
    private boolean actual;

}

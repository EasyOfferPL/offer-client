package com.easyoffer.offer_client.to;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WorkSalaryTO {
    private BigDecimal min;
    private BigDecimal max;
    private String currency;
}

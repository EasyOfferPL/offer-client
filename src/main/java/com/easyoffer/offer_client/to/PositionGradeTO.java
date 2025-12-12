package com.easyoffer.offer_client.to;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PositionGradeTO {
    JUNIOR("Junior"),
    MIDDLE("Middle"),
    SENIOR("Senior");

    private final String name;
}

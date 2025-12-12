package com.easyoffer.offer_client.to;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
public class OfferContextTO implements Serializable {

    private LocalDate publishDate;
    private String title;
    private String url;
    private String description;
    private String companyName;
    private String companyAddress;
    private WorkConditionsTO workConditions;
    private Set<TechSkillTO> techSkills;

}

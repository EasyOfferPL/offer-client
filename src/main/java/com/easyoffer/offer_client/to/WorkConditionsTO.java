package com.easyoffer.offer_client.to;

import lombok.Data;

import java.util.Set;

@Data
public class WorkConditionsTO {

    private String workSchedule;
    private Set<String> contractTypes;
    private PositionGradeTO grade;
    private String workMode;
    private WorkSalaryTO salary;

}

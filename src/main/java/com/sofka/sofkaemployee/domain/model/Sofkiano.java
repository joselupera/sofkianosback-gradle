package com.sofka.sofkaemployee.domain.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "sofkiano")
public class Sofkiano {
    @Id
    private String id;
    private String idProject;
    private String name;
    private String lastName;
    private Double baseSalary;
    private Double flexibleSalary;
    private Double ctc;
    private String status;
    private String area;
    private Double hourlyRate;
    private Double monthRate;
    private Double assignmentMonth;
    private Double monthEbilling;
    private Double rrMonth;
    private Double rentabilidadBruta;
    private Double gm;
    private String billable;
    private Double capacity;
    private Date dateReport;
}

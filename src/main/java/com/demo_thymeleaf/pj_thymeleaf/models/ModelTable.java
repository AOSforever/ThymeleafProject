package com.demo_thymeleaf.pj_thymeleaf.models;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "TABLE_EXAMPLE" )
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ModelTable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "TB_ID" )
    private Long tableID;

    @Temporal(TemporalType.DATE)
    @Column( name = "TB_DATE" )
    private LocalDate tableDate;

    public enum EnumTypeAtr {
        Credito,
        Debito
    }

    @Column( name = "TB_ENUM" )
    @Enumerated( EnumType.STRING )
    private EnumTypeAtr tableEnum;

    @Column( name = "TB_STRING" )
    private String tableString;

    @Column( name = "TB_DOUBLE" )
    private double tableDouble;

    @Column( name = "TB_CHAR" )
    private String tableChar;
}

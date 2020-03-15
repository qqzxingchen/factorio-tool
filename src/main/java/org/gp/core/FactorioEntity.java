package org.gp.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 实体
 * */
@Data
@AllArgsConstructor
@ToString
public class FactorioEntity {
    private double count;
    private String entity;
}

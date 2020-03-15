package org.gp.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 配方
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactorioFormula {
    private FactorioEntity targetEntity;
    private int costSeconds;
    private List<FactorioEntity> sourceEntity;
}

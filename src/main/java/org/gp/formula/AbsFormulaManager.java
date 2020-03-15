package org.gp.formula;

import org.gp.core.CostManager;
import org.gp.core.FactorioEntity;
import org.gp.core.FactorioFormula;
import org.gp.core.Toolkit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class AbsFormulaManager {

    public abstract List<FactorioFormula> getFormula();

    public Map<String,Double> calcCost(Map<String,Double> target ){
        return CostManager.calcCost( target, getFormula(), null );
    }
    public Map<String,Double> calcCost(Map<String,Double> target,List<String> ignoredFormula ){
        return CostManager.calcCost( target, getFormula(), ignoredFormula );
    }

    public static FactorioEntity G(double count, String entity ){
        return Toolkit.genEntity(count, entity);
    }
    public static FactorioFormula G(FactorioEntity targetEntity, double costSeconds, FactorioEntity ... sourceEntityArr ){
        List<FactorioEntity> sourceList = Arrays.asList( sourceEntityArr );
        return Toolkit.genFormula(targetEntity,costSeconds,sourceEntityArr);
    }

}

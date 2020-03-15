package org.gp.core;

import java.util.Arrays;
import java.util.List;

public class Toolkit {

    public static FactorioEntity genEntity( double cost,String entity ){
        return new FactorioEntity( cost,entity );
    }

    public static FactorioFormula genFormula( FactorioEntity targetEntity,double costSeconds,FactorioEntity ... sourceEntityArr ){
        List<FactorioEntity> sourceList = Arrays.asList( sourceEntityArr );
        return new FactorioFormula( targetEntity,costSeconds,sourceList );
    }

}

package org.gp.core;

import java.util.Arrays;
import java.util.List;

public class Toolkit {

    public static FactorioEntity genEntity( int costSeconds,String entity ){
        return new FactorioEntity( costSeconds,entity );
    }

    public static FactorioFormula genFormula( FactorioEntity targetEntity,int costSeconds,FactorioEntity ... sourceEntityArr ){
        List<FactorioEntity> sourceList = Arrays.asList( sourceEntityArr );
        return new FactorioFormula( targetEntity,costSeconds,sourceList );
    }

}

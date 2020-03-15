package org.gp;

import org.gp.formula.AbsFormulaManager;
import org.gp.formula.impl.FormulaV0_17;

import java.util.HashMap;
import java.util.Map;

public class FormulaService {

    public static void main(String[] args){
        AbsFormulaManager manager = new FormulaV0_17();
        Map<String, Double> costMap = manager.calcCost(new HashMap<String, Double>() {{
            put("生产研究", 1.0);
        }});
        for ( String key : costMap.keySet() ){
            System.out.println( String.format("%s: \t%s",key,costMap.get( key )) );
        }
    }

}

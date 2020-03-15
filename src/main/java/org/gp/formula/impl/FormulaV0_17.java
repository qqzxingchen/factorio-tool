package org.gp.formula.impl;

import org.gp.core.FactorioFormula;
import org.gp.formula.AbsFormulaManager;

import java.util.ArrayList;
import java.util.List;

public class FormulaV0_17 extends AbsFormulaManager {

    @Override
    public List<FactorioFormula> getFormula() {
        List<FactorioFormula> formulaList = new ArrayList<>();
        formulaList.addAll( genLevel1() );






        formulaList.add( G(
                G(1,""),
                5,
                G(1,""),
                G(1,"")
        ) );



        return formulaList;
    }


    private static List<FactorioFormula> genLevel1(){
        List<FactorioFormula> formulaList = new ArrayList<>();

        // 研究
        formulaList.add( G(
                G(1,"生产研究"),
                60,
                G(1,"红瓶"),
                G(1,"绿瓶"),
                G(1,"蓝瓶"),
                G(1,"紫瓶"),
                G(1,"黄瓶"),
                G(1,"白瓶")
        ) );
        formulaList.add( G(
                G(1,"武器研究"),
                60,
                G(1,"红瓶"),
                G(1,"绿瓶"),
                G(1,"蓝瓶"),
                G(1,"灰瓶"),
                G(1,"黄瓶"),
                G(1,"白瓶")
        ) );

        // 瓶子
        formulaList.add( G(
                G(1,"红瓶"),
                5,
                G(1,"铜"),
                G(1,"铁齿轮")
        ) );
        formulaList.add( G(
                G(1,"绿瓶"),
                6,
                G(1,"基础传送带"),
                G(1,"电力机械臂")
        ) );
        formulaList.add( G(
                G(2,"灰瓶"),
                10,
                G(1,"穿甲弹匣"),
                G(1,"标准手雷"),
                G(2,"墙壁")
        ) );
        formulaList.add( G(
                G(2,"蓝瓶"),
                24,
                G(1,"硫磺"),
                G(3,"红板"),
                G(2,"内燃机")
        ) );
        formulaList.add( G(
                G(3,"紫瓶"),
                21,
                G(30,"铁轨"),
                G(1,"电炉"),
                G(1,"产能插件1")
        ) );
        formulaList.add( G(
                G(3,"黄瓶"),
                21,
                G(2,"篮板"),
                G(1,"机器人构架"),
                G(3,"轻质框架")
        ) );
        formulaList.add( G(
                G(1000,"白瓶"),
                60,
                G(1000,"轻质框架"),
                G(1000,"火箭燃料"),
                G(1000,"火箭控制器"),
                G(1,"卫星")
        ) );
        return formulaList;
    }


}

package edu.epn.web.b2022.g3.audit.caso.estudio;

import java.io.Serializable;

public class DualCounter implements Serializable{
    static DualCounter dualCounter = new DualCounter();
    
    public int aCounter;
    public int bCounter;

    public DualCounter() {
        this.aCounter = 0;
        this.bCounter = 0;
    }
    
    public void putA(){
        aCounter += 1;
    }
    
    public int getA(){
        return aCounter;
    }
    
    public void putB(){
        bCounter += 1;
    }
    
    public int getB(){
        return bCounter;
    }
}

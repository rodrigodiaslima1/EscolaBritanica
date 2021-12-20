package br.com.rodrigodiaslima1.Components;

/**
 * <h1>=== Engine Class ===</h1>
 *
 * @author rodrigodiaslima1
 * @version 1.1
 *
 * The following system is a brief representation
 * about how a 2 Piston engine works
 *
 */

public class Engine {

    private boolean keyState = false;
    private boolean vehicleRunning = false;
    private boolean piston = false;
    private boolean valve1 = false;
    private boolean valve2 = false;
    private String valveDirection;
    private boolean spRockets = false;
    private boolean camShaft = false;
    private boolean sparkPlug = false;
    private boolean crankShaft = false;
    private boolean alternator = false;
    private boolean distributor = false;

    //Methods
    //Get(s)
    public boolean getVehicleState() { return this.vehicleRunning; }
    public boolean getKeyState() { return this.keyState; }
    public boolean getPiston() { return this.piston; }
    public boolean getValve1(){
        return this.valve1;
    }
    public boolean getValve2() { return this.valve2; }

    /**
     * @deprecated
     * @return
     */
    public String getValveDirection() { return this.valveDirection; }

    public boolean getSpRockets() { return this.spRockets; }
    public boolean getCamShaft() { return this.camShaft; }
    public boolean getSparkPlug() { return this.sparkPlug; }
    public boolean getCrankShaft() { return this.crankShaft; }
    public boolean getAlternator() { return this.alternator; }
    public boolean getDistributor() { return this.distributor; }
    //Set(s)
    public void setVehicleOn(boolean state) { this.vehicleRunning = state; }
    public void setKeyState(boolean state) { this.keyState = state; }
    public void setPiston(boolean state) { this.piston = state; }
    public void setValve1(boolean direction){
        this.valve1 = direction;
    }
    public void setValve2(boolean direction){
        this.valve2 = direction;
    }

    /**
     * @deprecated
     * @param direction
     */
    public void setValveDirection(String direction) { this.valveDirection = direction; }

    public void setSpRockets(boolean state) { this.spRockets = state; }
    public void setCamShaft(boolean state) { this.camShaft = state; }
    public void setSparkPlug(boolean turnState) { this.sparkPlug = turnState; }
    public void setCrankShaft(boolean turnState) { this.crankShaft = turnState; }
    public void setAlternator(boolean state) { this.alternator = state; }
    public void setDistributor(boolean turnState) { this.distributor = turnState; }

    //Methods
    public boolean turnKeyOn(){
        setKeyState(true);
        return getKeyState();
    }

    /**
     * SpRocket connect the two available camshaft in the system
     *
     * @param keyState
     * @return boolean expecting SpRockets are on (true)
     */
    public boolean startSpRockets(boolean keyState){
        if(keyState){
            setSpRockets(true);
        }
        return getSpRockets();
    }

    /**
     *
     * @param SpRockets
     * @return boolean expecting CamShaft are on (true)
     */
    public boolean startsCamshaft(boolean SpRockets){
        if(spRockets){
            setCamShaft(true);
        }
        return this.getCamShaft();
    }

    /**
     *
     * @param camShaft
     * @return boolean expecting Alternator are on (true)
     */
    public boolean startsAlternator(boolean camShaft){
        if(camShaft){
            setAlternator(true);
        }
        return this.getAlternator();
    }

    /**
     *
     * @param camShaft
     * @return boolean expecting Valve1 are on (true)
     */
    public boolean valve1Starts(boolean camShaft){
        if(camShaft){
            setValve1(true);
        }
        return this.getValve1();
    }

    /**
     *
     * @param camShaft
     * @return boolean expecting Valve2 are on (true)
     */
    public boolean valve2Starts(boolean camShaft){
        if(camShaft){
            setValve2(true);
        }
        return this.getValve2();
    }

    /**
     *
     * @param keyState
     * @return boolean expecting Distributor are on (true)
     */
    public boolean distributorStarts(boolean keyState){
        if(keyState){
            setDistributor(true);
        }
        return this.getDistributor();
    }

    /**
     *
     * @param distributor
     * @return boolean expecting SparkPlug are on (true)
     */
    public boolean sparkPlugStarts(boolean distributor){
        if(distributor){
            setSparkPlug(true);
        }
        return this.getSparkPlug();
    }

    /**
     *
     * @param valve1
     * @param valve2
     * @param sparkPlug
     * @return boolean expecting Pistons are on (true)
     */
    public boolean pistonStarts(boolean valve1, boolean valve2, boolean sparkPlug){
        if(valve1 && valve2 && sparkPlug){
            setPiston(true);
        }
        return this.getPiston();
    }

    /**
     *
     * @param piston
     * @return boolean expecting CranckShaft is on (true)
     */
    public boolean crankShaftStarts(boolean piston){
        if(piston){
            setCrankShaft(true);
        }
        return this.getCrankShaft();
    }

    /**
     *
     * @param crankShaft
     * @return String indicating if vehicle is running
     */
    public String vehicleStatus(boolean crankShaft){
        if(crankShaft){
            setVehicleOn(true);
        }
        return String.format("Vehicle Running: %b ", this.getVehicleState());
    }

}

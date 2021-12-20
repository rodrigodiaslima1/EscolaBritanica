package br.com.rodrigodiaslima1.Tests;

import br.com.rodrigodiaslima1.Components.Engine;

/**
 *
 * Run your tests safely from this Class
 * I have also created some "broke" parts in a way we could
 * test if these parts would affect the system.
 * @author rodrigodiaslima1
 *
 */

public class Test {

    public static void main(String[] args){

        Engine engine = new Engine();

        // Broke pieces:
        boolean brokeValve = false;
        boolean brokeCamShaft = false;
        boolean brokeDistributor = false;

        // 1- Turn Key:
        boolean key = engine.turnKeyOn();
        System.out.println("Key On: " + key);

        // 2- SpRockets Starts:
        boolean spRockets = engine.startSpRockets(key);
        System.out.println("SpRockets: " + spRockets);

        // 3.1- CamShaft Starts:
        boolean camShaft = engine.startsCamshaft(spRockets);
        System.out.println("CamShaft: " + camShaft);

        // 3.2- Alternator Starts:
        boolean alternator = engine.startsAlternator(camShaft);
        System.out.println("Alternator: " + alternator);

        // 4- Valves Start:
        boolean valve1 = engine.valve1Starts(camShaft);
        boolean valve2 = engine.valve2Starts(camShaft);
        System.out.println("Valve1: " + valve1);
        System.out.println("Valve2: " + valve2);

        // 5- Distributor Starts:
        boolean distributor = engine.distributorStarts(key);
        System.out.println("Distributor: " + distributor);

        // 6- SparkPlug Starts:
        boolean brokeSparkPlug = false;
        boolean sparkPlug = engine.sparkPlugStarts(distributor);
        System.out.println("SparkPlug: " + sparkPlug);

        // 7- Pistons Start:
        boolean piston = engine.pistonStarts(valve1, valve2, sparkPlug);
        System.out.println("Piston: " + piston);

        // 8- CrankShaft Moves:
        boolean crankShaft = engine.crankShaftStarts(piston);
        System.out.println("CrankShaft: " + crankShaft);

        System.out.println("=====================");

        // 9- Vehicle runs:
        System.out.println();
        System.out.println(engine.vehicleStatus(crankShaft));


    }

}

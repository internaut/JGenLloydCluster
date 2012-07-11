package genlloydclustertest;

import java.util.ArrayList;
import net.mkonrad.cluster.GenLloyd;

/**
 * GenLloyd Library - Implementation of Generalized Lloyd (also known as
 * Linde-Buzo-Gray or LBG) algorithm.
 *
 * This class is just for testing. Delete it when using it as a library.
 *
 * @author Markus Konrad <post@mkonrad.net>
 */
public class GenLloydClusterTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<double[]> points = new ArrayList<double[]>();

        //points.add(arrayOf(-1.5, -1.5));
        points.add(arrayOf(-1.5, 2.0, 5.0));
        points.add(arrayOf(-2.0, -2.0, 0.0));
        points.add(arrayOf(1.0, 1.0, 2.0));
        points.add(arrayOf(1.5, 1.5, 1.2));
        points.add(arrayOf(1.0, 2.0, 5.6));
        points.add(arrayOf(1.0, -2.0, -2.0));
        points.add(arrayOf(1.0, -3.0, -2.0));
        points.add(arrayOf(1.0, -2.5, -4.5));

        GenLloyd gl = new GenLloyd(points.toArray(new double[points.size()][2]));
        
        gl.calcClusters(4);
        
        double[][] results = gl.getClusterPoints();
        for (double[] point : results) {
            System.out.println("Cluster " + point[0] + ", " + point[1] + ", " + point[2]);
        }
    }

    private static double[] arrayOf(double x, double y, double z) {
        double[] a = new double[3];
        a[0] = x;
        a[1] = y;
        a[2] = z;

        return a;
    }
}

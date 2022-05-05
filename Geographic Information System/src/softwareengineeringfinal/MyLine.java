/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringfinal;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author halil
 */
public class MyLine {

    
    Point x = new Point();
    Point y = new Point();
    
    ArrayList<MyPoint> points = new ArrayList<MyPoint>();
    
    public void Convert(ArrayList<MyPoint> points){
        for (int i = 0; i < points.size(); i++) {
            System.out.println("point converted");
        }
        System.out.println("line Converted data");
    }
}

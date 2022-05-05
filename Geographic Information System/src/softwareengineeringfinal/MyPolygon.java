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
public class MyPolygon {
    Point x = new Point();
    Point y = new Point();
    
    ArrayList<MyLine> lines = new ArrayList<MyLine>();
        public void Convert(ArrayList<MyLine> lines){
        for (int i = 0; i < lines.size(); i++) {
            System.out.println("line converted");
        }
        System.out.println("polygon Converted data");
    }
}

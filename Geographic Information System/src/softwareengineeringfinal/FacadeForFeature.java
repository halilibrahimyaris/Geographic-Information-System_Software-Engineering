/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringfinal;

/**
 *
 * @author halil
 */
public class FacadeForFeature {
    private MyPoint point = new MyPoint();
    private MyLine line = new MyLine();
    private MyPolygon polygon = new MyPolygon();


    public void convertPoint(){
        point.Convert(point.points);
    }
       
    public void convertLine(){
        line.Convert(line.points);
    }
       public void convertPolygon(){
        polygon.Convert(polygon.lines);
    }
     
}

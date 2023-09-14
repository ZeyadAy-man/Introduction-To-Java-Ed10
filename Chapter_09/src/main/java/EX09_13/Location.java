/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX09_13;

/**
 *
 * @author Zeyad Ayman
 */
public class Location {
    public int row, column;
    public double maxValue;
    Location(int row, int column){
        this.row = row;
        this.column = column;
    }
    Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    public static Location locateLargest(double[][] a){
        double max = a[0][0];
        int row = 0;
        int column = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location location = new Location(row, column, max);
        return location;
    }
}

package Seminar_1;

public class Shape {
    private double wight;
    private double hight;

    public Shape(double wight, double hight){
        this.hight = hight;
        this.wight = wight;
    }

    void ShowShape() {
    // ClearScreen();     
        System.out.println("Wight = " + wight);
        System.out.println("Hight = " + hight);
    }

    void setWight(double wight){
        this.wight = wight;
    }

    void setHight(double hight){
        this.hight = hight;
    }

    double getWight(){
        return wight;
    }

    double getHight(){
        return hight;
    }

    // public static void ClearScreen() {
    //    System.out.print("\033[H\033[2J");
    //    System.out.flush();
    // }
}
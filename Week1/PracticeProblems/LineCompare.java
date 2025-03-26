class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Line{
    Point p1;
    Point p2;
    double length;
    public Line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
        this.length=findLength();
    }
    public double findLength(){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)-Math.pow(p1.y-p2.y,2));
    }
    public double getLength(){
        return this.length;
    }
}
public class LineCompare {
    public static void main(String[] args) {
        Point p1=new Point(3,5);
        Point p2=new Point(6,5);
        Line l1=new Line(p1,p2);
        double lengthOfL1=l1.getLength();
        System.out.println("l1 length:"+lengthOfL1);
        Point p3=new Point(1,5);
        Point p4=new Point(6,7);
        Line l2=new Line(p3,p4);
        double lengthOfL2=l2.getLength();
        System.out.println("l2 length:"+lengthOfL2);
        if(lengthOfL1==lengthOfL2){
            System.out.println("Both equal");
        }
        else if(lengthOfL1>lengthOfL2){
            System.out.println("l1 is greater");
        }
        else{
            System.out.println("l2 is greater");
        }
    }
}

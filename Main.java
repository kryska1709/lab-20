class Terr{
    private static Terr result =new Terr();
    private static int x;
    private static int y;
    Terr(){
        this.x=3;
        this.y=2;
    }
    public static double getResult(){
        double res = (2*x) + (3/y);
        return res;
    }
    public static void setX(int x){
        Terr.x = x;
    }
    public static void setY(int y){
        Terr.y = y;
    }
    public static Terr getTerr(){
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Terr ret = Terr.getTerr();
        Terr.setX(7);
        Terr.setY(3);
        System.out.println(Terr.getResult());
    }
}
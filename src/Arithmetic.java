public class Arithmetic {

    private int x;
    private int y;

    public Arithmetic (int x, int y){
        this.x = x;
        this.y = y;
    }
    public int sum(){
        return x + y;
    }
    public int difference() {
        return x - y;
    }
    public int product() {
        return x * y;
    }
    public int averageValue() {
        return (x + y)/2;
    }
    public int maxValue(){
        if (x > y){
        }
        return (x);
    }
    public int minValue(){
        if (x < y){
        }
        return (y);
    }
}

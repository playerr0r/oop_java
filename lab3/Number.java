
public class Number implements output{
    private int num;
    
    public int getNumber() { return num; }

    public void setNumber(int n) { this.num = n; }

    @Override
    public void print() { System.out.println(" " + num); }
}

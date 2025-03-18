public class Main {
    static int ack(int x, int y)
    {
        if (x == 0)
        {
            return y + 1;
        }
        else if((x > 0) && (y == 0))
        {
            return ack(x - 1, 1);
        }
        else if((x > 0) && (y > 0))
        {
            return ack(x - 1, ack(x, y - 1));
        }else
            return y + 1;
    }
    public static void main(String[] args) {
        System.out.println(ack(1, 2));
    }
}
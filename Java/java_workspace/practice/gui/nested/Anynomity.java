
public class Anynomity {
    public static void main(String[] args) {
        Food food = new Food();
        food.p.pop();
        // food.p.sizzle();     // p is popcorn not any popcorn so can not access it
    }
}

class Popcorn
{
    public void pop()
    {
        System.out.println("Popcorn");
    }
}

class Food
{
    Popcorn p = new Popcorn() {
        public void pop()
        {
            System.out.println("Anynomious pop");
            sizzle();
        }
        public void sizzle()
        {
            System.out.println("any sizzle");
        }
    };
}
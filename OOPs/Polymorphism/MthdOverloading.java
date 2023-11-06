public class MthdOverloading {

    public static void diwaliBonus(String name, int bonus) {
        System.out.println("Happy Diwali " + name + ", you got bonus of Rs. " + bonus);
    }

    public static void diwaliBonus(String name, String bonus) {
        System.out.println("Happy Diwali " + name + ", you got bonus of " + bonus);
    }

    public static void diwaliBonus(String name, float bonus, String msg) {
        System.out.println("Happy Diwali " + name + ", you got bonus of $" + bonus + " and " + msg);
    }

    public static void diwaliBonus(String name, String msg, float bonus) {
        System.out.println("Happy Diwali " + name + ", you got bonus of Rs. " + bonus + " and " + msg);
    }

    public static void main(String[] args) {
        diwaliBonus("Naimish", 500000);
        diwaliBonus("Tusharth", "WeddingCard");
        diwaliBonus("Ritu", 10000.9f, "Promotion to US HeadQuarters");
        diwaliBonus("Naimish", "GANTHIYA", 100.9f);
    }
}

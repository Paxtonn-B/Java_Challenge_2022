public class Text {
    public static void main(String[] args) {
    Die num = new Die();
    System.out.println("Created " + num.getNumSides() + " sided die");
    System.out.println("Last roll was " + num.getLastRoll());        
    System.out.println("It landed on " + num.getRoll());
    System.out.println("Last roll was " + num.getLastRoll());
    System.out.println(num.getManyDie());
    System.out.println("Added together it's " + num.getRollsAdd());
    }
}

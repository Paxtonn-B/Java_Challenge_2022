public class Roller{

    public static int roll(){
        int poo = (int) (1 + (Math.random()) * 6);
        return poo;
    }

    public static void main(String[] args) {
        int rolls = 0;
        while (rolls < 20){
            System.out.println(roll());
            rolls++;
        }
    }
}

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        Dragon dragonOne = new Dragon(3, 5);
        Zombie zombieOne = new Zombie(5, 7);

        dragonOne.aboutMe();
        int aaa = dragonOne.getmDamage();
        System.out.println(aaa);

        //TODO: Loop through the array of Monsters, printing out something for each Monster

    }
}

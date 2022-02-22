package VersionControl;

public class VersionCont {

    public static void main(String[] args){
        VersionCont test = new VersionCont();
        test.progRun();
        System.out.println("Dog");
    }

    public void progRun(){

        int y = 8;
        System.out.println(y);
        System.out.println(y+2);
        System.out.println(y+4);
        System.out.println("Cat");
        System.out.println("Nitro");
        System.out.println("Turbo");
        System.out.println(moreFun());

    }

    public int moreFun(){
        return 3;
    }

}

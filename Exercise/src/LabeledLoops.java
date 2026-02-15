public class LabeledLoops {

    public static void main(String[] args) {

        System.out.println("-------------------Unlabeled LOOP---------------------");
        for (int i=1;i<=3;i++){
            for (int j= 1;j<=3;j++){
                System.out.println("Outer loop: "+ i + "Inner Loop: "+ j);
                if(i==2 && j== 2){
                    break;
                }
            }
        }

        System.out.println("-------------------labeled LOOP---------------------");
        businessLoop: for (int i=1;i<=3;i++){
            innerLoop: for (int j= 1;j<=3;j++){
                System.out.println("Outer loop: "+ i + "Inner Loop: "+ j);
                if(i==2 && j== 2){
                    break businessLoop;
                }
            }
        }
        System.out.println("before businessLoop");



        /*
        String[] animals ={ "Cat","Dog", "Cow","Lion","Rabbit"};
        int index =0;
        String animal="null";
        System.out.println("inicio");
        animalsLoop:
        while(index< animals.length){
            animal = animals[index];
            if(animal == "Lion"){
                System.out.println(animal);
                break animalsLoop;
            }
            index++;
        }
        System.out.println("Fin");

        */
    }
}

public class Basic {

    public static void main(String[] args) {

        //-------------------DECLARATION----------------------------------------------
        //Es cuando le dices al compilador el tipo y el nombre de la variable.
        //NO se crea el objeto todavía.
        //NO hay memoria asignada para el objeto (solo para la referencia si es variable local).
        int number;
        String name;
        int[] ages;
        //Aquí solo estás diciendo:
        //"Existirá una variable llamada X de tipo Y"

        //------------------------INSTANTIATION---------------------------------------------
        //Es cuando creas el objeto en memoria usando new.
        //Aquí:    //
        //Se reserva memoria en el heap        //
        //Se crea el objeto
        name = new String("Jairo");
        ages = new int[4];

        //------------------------INITIALIZATION---------------------------------------------
        //Es cuando asignas un valor inicial a la variable.
        //👉 Es cuando asignas un valor inicial a la variable.
        //
        //Puede ocurrir:
        //
        //🔹 En el momento de declarar
        int number2 = 10;
        //
        //🔹 Después
        number = 20;
        //
        //🔹 En arrays
        int[] ages2 = {20,25,30};

        int[] ages3;                 // Declaración
        ages = new int[3];          // Instanciación
        ages[0] = 20;               // Inicialización

        /*int s;
        System.out.println(s);*/
    }
}

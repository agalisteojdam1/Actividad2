package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String[] args)
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean fin_de_juego=false;

        int Rondasjugadas = 0;    // Número de rondas jugadas
        int EXITOS_jugador1=p1.getExitos();
        int EXITOS_jugador2=p2.getExitos();
        int EmPaTeS = 0;

        String opcion_JUGADOR1;
        String opcion_JUGADOR2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ EmPaTeS + "\n");
            opcion_JUGADOR1=p1.opcion_al_azar();
            opcion_JUGADOR2 = p2.opcion_al_azar();

            
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                EXITOS_jugador2++;
                
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {

                System.out.println("Jugador 1 GANA");
                EXITOS_jugador1++;
            }
            else if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {

                System.out.println("Jugador 1 GANA");
                EXITOS_jugador1++;
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
                EXITOS_jugador2++;
                System.out.println("Jugador 2 GANA");
            }
            else if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {

                System.out.println("Jugador 1 GANA");
                EXITOS_jugador1++;
            }
            else if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {

                System.out.println("Jugador 2 GANA");
                EXITOS_jugador2++;
            }
            if(opcion_JUGADOR1.equals(opcion_JUGADOR2))
            {
            	EmPaTeS++;
                System.out.println("\n\t\t\t Empate \n");
            }

            Rondasjugadas++;

            System.out.println("Jugador 1: " + opcion_JUGADOR1+"\t Jugador 1 - Partidas ganadas: " + EXITOS_jugador1);
            System.out.println("Jugador 2: " + opcion_JUGADOR2+"\t Jugador 2 - Partidas ganadas: " + EXITOS_jugador2);

            if((EXITOS_jugador1>=3)||(EXITOS_jugador2>=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(!fin_de_juego);
    }
}
/**
 *
 */
class Jugador{
    int exitos;      // número de partidas ganadas

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        int c = (int)(Math.random()*3);
        switch (c) {
            case 0 -> opcion = ("piedra");
            case 1 -> opcion = ("papel");
            case 2 -> opcion = ("tijeras");
        }
        return opcion;
    }

    public int getExitos()
    {
        return(exitos);
    }
    

}

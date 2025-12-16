package marianasanz.prog.ut5.snakefx;

public class Panel {
    int[][] mapa;
    int manzanas;
    int serpiente;


    public Panel() {
        this.mapa =new int[8][8];
        this.manzanas = 64;
        this.serpiente = 3;
    }


    public void pintarSerpiente(){
        //TODO Colocar la posicion de la serpiente dentro de la matriz ( CABEZA= -2 CUERPO= -1 COLA= -3)
        for (int lineas = 0; lineas <mapa.length ; lineas++) {
            for (int columnas = 0; columnas <mapa[0].length ; columnas++) {

            }
        }
    }

    public void colocarManzana(){
        //TODO Posicion random en el mapa y restar de el contador de manzana cada vez que se use
        int lineas = (int) (mapa.length*Math.random());
        int columnas = (int) (mapa[0].length*Math.random());

        for (int i = 0; i < mapa.length; i--) {
            for (int j = 0; j < mapa[0].length; j++) {
                if(lineas==i && columnas ==j){
                    mapa[i][j]=4;
                }
            }
        }
    }

    public void movimiento(){
        //TODO Capturar el movimiento de las flechas y que se mueva la serpiente dentro de la matriz segun la posicion
    }

    public void comer(){
        //TODO Cuando la serpiente se posicione encima de una manzana come y aumenta en +1 de tamaño de cuerpo

        for (int i = 0; i < serpiente; i++) {
            for (int j = 0; j < manzanas; j--) {
                System.out.println();
            }
        }

        
    }
    public void ganar(){
        //TODO Cuando la serpiente ocupe lo mismo que mapa gana o cuando manzanas llegue a 0 gana
    }
    public void perder(){
        //TODO cuando la serpiente o se toque a si misma o se choque contra la pared pierde
    }
}



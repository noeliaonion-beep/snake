package marianasanz.prog.ut5.snakefx;

import java.util.Scanner;

public class Panel {

  private int[][] mapa;
  private int manzanas;
  private int longitud;
  private int posCabeza;




    public Panel() {
        this.mapa =new int[9][9];
        this.manzanas = 64;
        this.longitud=-3;
    }


    public void pintarSerpiente(){
        int contador=0;
        //TODO Colocar la posicion de la serpiente dentro de la matriz ( CABEZA= -2 CUERPO= -1 COLA= -3)
        for (int lineas = 0; lineas <mapa.length ; lineas++) {
            for (int columnas = 0; columnas <mapa[0].length ; columnas++) {
                if (lineas==mapa.length/2 && columnas==0){
                    mapa[lineas][columnas]=longitud;
                    longitud++;
                    mapa[lineas][columnas+1]=longitud;
                    longitud++;
                    mapa[lineas][columnas+2]=longitud;
                    posCabeza= mapa[lineas][columnas]=longitud;
                }
            }
        }
    }

    public void colocarManzana(){
        //TODO Posicion random en el mapa y restar de el contador de manzana cada vez que se use
    }

    public void movimiento() {
        //TODO Capturar el movimiento de las flechas y que se mueva la serpiente dentro de la matriz segun la posicion
        Scanner teclao = new Scanner(System.in);
        String tecla = teclao.nextLine();
        int colcabeza = 0;
        int filacabeza = 0;
        int valorCabeza=-1;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if (mapa[i][j] == -1) {
                    colcabeza = j;
                    filacabeza = i;
                }
            }
        }
        mapa[i-1][j] = -1;
        for (int i = -1; i < 1 ; i++) {
            for (int j = -1; j < 1 ; j++) {
                if((i==0 || j==0) && (i==0)) {

                }
            }
        }

                if (tecla.equalsIgnoreCase("w")) {
                    //mapa[colcabeza - 1][filacabeza] = valorCabeza;
                    for (int k = 0; k <mapa.length ; k++) {
                        for (int l = 0; l <mapa[0].length ; l++) {
                            if (mapa[k][j]==valorCabeza){
                                mapa[k][j] -= 1;
                            } else if (mapa[k][j]==valorCabeza-1) {
                                mapa[k][j] -= 1;
                            }else if (mapa[k][j]==valorCabeza-2) {
                                mapa[k][j] -= 1;
                            }else if (mapa[k][j]==longitud){
                                mapa[k][j] = 0;
                            }
                        }

                    }
                }

            }
        }
    }



    public void comer(){
        //TODO Cuando la serpiente se posicione encima de una manzana come y aumenta en +1 de tamaño de cuerpo
    }
    public void ganar(){
        //TODO Cuando la serpiente ocupe lo mismo que mapa gana o cuando manzanas llegue a 0 gana
    }
    public void perder(){
        //TODO cuando la serpiente o se toque a si misma o se choque contra la pared pierde
    }
    public void mostrarMatriz(){
        for (int i = 0; i <mapa.length ; i++) {
            System.out.println();
            for (int j = 0; j <mapa[0].length ; j++) {
                System.out.printf("%3d",mapa[i][j]);
            }
        }
    }

    static void main() {
        Panel panel=new Panel();
        panel.pintarSerpiente();
        panel.mostrarMatriz();
        panel.movimiento();

    }
}



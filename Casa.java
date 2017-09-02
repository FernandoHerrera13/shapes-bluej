


/**Esta clase se va a encargar de crear casas a partir de figuras geometricas*/
class Casa
{
    /** Se declaran las variables de instancia*/
    //variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    /**En el constructor crearemos los nuevos objetos que formaran parte de la casa*/
    //constructor
    Casa()
    {
        ventana=new Circle();
        techo=new Triangle();
        pared=new Square();
        puerta=new Square();
    }
    
    /**El metodo dibujate tiene la accion de dibujar en cierta ubicacion de la pantalla
     los objetos que conformaran la casa */
    //metodos
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
    /**El metodo acomodate se encarga de modificar: Tamaño, color y pocision de los objetos para 
    poder acomodarlos de forma que se vizualice la casa*/
    void acomodate()
    {
        pared.changeColor("green");
        pared.changeSize(120);
        pared.moveVertical(100);
        pared.moveHorizontal(25);
        
        techo.changeColor("black");
        techo.changeSize(45,180);
        techo.moveVertical(100);
        techo.moveHorizontal(102);
        
        puerta.changeColor("blue");
        puerta.changeSize(35);
        puerta.moveVertical(185);
        puerta.moveHorizontal(72);
        
        ventana.changeColor("red");
        ventana.changeSize(20);
        ventana.moveVertical(75);
        ventana.moveHorizontal(112);
    }
}
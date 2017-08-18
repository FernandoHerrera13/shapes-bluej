class Casa
{
    //variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    //constructor
    Casa()
    {
        ventana=new Circle();
        techo=new Triangle();
        pared=new Square();
        puerta=new Square();
    }
    
    //metodos
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
    }
    
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
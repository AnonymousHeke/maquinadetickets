public class EstacionTren
{
    private MaquinaDeTickets maquina1;
    private MaquinaDeTickets maquina2;
    private int dineroTotal;

    public EstacionTren()
    {
        maquina1 = new MaquinaDeTickets(300);
        maquina2 = new MaquinaDeTickets(200);
        dineroTotal = 0;
       }
  
    public void mostrarDineroTotal()
    {
        dineroTotal = maquina1.darTotal();
        dineroTotal = dineroTotal + maquina2.darTotal();
                System.out.println(dineroTotal);
    }
    
    public void ImprimirTicket()
    {
        maquina1.insertarDinero(500);
        maquina2.insertarDinero(400);
        maquina1.imprimirTicket();
        maquina2.imprimirTicket();
    }
}
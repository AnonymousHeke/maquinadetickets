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
}
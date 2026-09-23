import java.util.*;

public class Metodos{

    public Queue<Obj>LlenarCola(Queue<Obj>cola, Metodos m, Scanner sc) {
        boolean continuar=true;
        while(continuar) {
            Obj o = new Obj();
            o.setTurno(m.ValidarTurno(cola));
            o.setName(m.MenuComida(sc));
            System.out.println("Ingrese descripción de pedido");
            o.setCant(sc.nextInt());
            System.out.println("Ingrese el precio");
            o.setPrice(sc.nextDouble());
            o.setState(0);
            System.out.println("¿Desea agregar más turnos?");
            int opt = sc.nextInt();
            if(opt==2){
                System.out.println("Vuelva pronto");
                continuar=false;
            }
            cola.offer(o);
        }
        return cola;
    }
     
    public int ValidarTurno(Queue<Obj>cola){
        int turno=0;
        if(cola.isEmpty()){
            turno=1;
        }else{
            turno=cola.size();
        }
        return turno;
    }
    public int MenuComida(Scanner sc)
    {
        System.out.println("1) Sancocho de bagre");
        System.out.println("2) Sancocho trifásico");
        System.out.println("3) Ajiaco");
        System.out.println("4) Sancocho de costilla");
        System.out.println("5) Sancocho de pescado");
        System.out.println("6) Mondongo de la abuela");
        return sc.nextInt();
    }

}
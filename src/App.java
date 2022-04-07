public class App {
    public static void main(String[] args) throws Exception {
        Lista lista_ordenada = new Lista();
        lista_ordenada.add_ordenado(1);
        lista_ordenada.add_ordenado(10);
        lista_ordenada.add_ordenado(11);
        lista_ordenada.add_ordenado(7);
        lista_ordenada.add_ordenado(8);
        lista_ordenada.add_ordenado(5);
        lista_ordenada.add_ordenado(4);
        System.out.print("LISTA ORDENADA 1: ");
        lista_ordenada.print();

        Lista lista_ordenada2 = new Lista();
        lista_ordenada2.add_ordenado(100);
        lista_ordenada2.add_ordenado(3787);
        lista_ordenada2.add_ordenado(5657);
        lista_ordenada2.add_ordenado(8577);
        lista_ordenada2.add_ordenado(6567);
        lista_ordenada2.add_ordenado(9454);
        lista_ordenada2.add_ordenado(10564);

        System.out.print("LISTA ORDENADA 2: ");
        lista_ordenada2.print();
        System.out.println("cos(x,y): " + lista_ordenada.similaridade(lista_ordenada2));

        System.out.print("LISTA ORDENADA 1 (primeiro elemento removido): ");
        lista_ordenada.remove_primeiro();
        lista_ordenada.print();
        System.out.print("LISTA ORDENADA 1 (ultimo elemento removido): ");
        lista_ordenada.remove_ultimo();
        lista_ordenada.print();
        System.out.print("LISTA ORDENADA 1 (elemento depois do index x removido): ");
        lista_ordenada.remove_depois(3); // pode colocar index ou o No como argumento, ele faz o get automatico
        lista_ordenada.print();
    }
}

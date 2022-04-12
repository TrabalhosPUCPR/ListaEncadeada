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
        System.out.print("\nLISTA ORDENADA 1: ");
        lista_ordenada.print();

        Lista lista_ordenada2 = new Lista();
        lista_ordenada2.add_ordenado(1);
        lista_ordenada2.add_ordenado(6);
        lista_ordenada2.add_ordenado(5);
        lista_ordenada2.add_ordenado(15);
        lista_ordenada2.add_ordenado(12);
        lista_ordenada2.add_ordenado(18);
        lista_ordenada2.add_ordenado(4);
        System.out.print("LISTA ORDENADA 2: ");
        lista_ordenada2.print();

        System.out.println("SIMILARIDADE ENTRE LISTA 1 E 2 (cos(x,y)): " + lista_ordenada.similaridade(lista_ordenada2));

        System.out.print("INTERSECAO DAS LISTAS 1 E 2 ORDENADA: ");
        lista_ordenada.intersecao(lista_ordenada2).print();
        
        System.out.print("LISTA ORDENADA 1 (primeiro elemento removido): ");
        lista_ordenada.remove_primeiro();
        lista_ordenada.print();
        System.out.print("LISTA ORDENADA 1 (ultimo elemento removido): ");
        lista_ordenada.remove_ultimo();
        lista_ordenada.print();
        System.out.print("LISTA ORDENADA 1 (elemento depois do index x removido): ");
        lista_ordenada.remove_depois(2); // pode colocar index ou o No como argumento, ele faz o get automatico
        lista_ordenada.print();
        System.out.print("\n");
    }
}

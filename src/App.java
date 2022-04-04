public class App {
    public static void main(String[] args) throws Exception {
        Lista lista_ordenada = new Lista();
        lista_ordenada.add(7);
        lista_ordenada.add(5);
        lista_ordenada.add(6);
        lista_ordenada.add(2);
        lista_ordenada.add(3);
        lista_ordenada.add(1);
        lista_ordenada.add(4);
        System.out.print("LISTA ORDENADA: ");
        lista_ordenada.print();
    }
}

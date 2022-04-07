public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista(){
        primeiro = null;
        ultimo = null;
    }

    public No get(int i){
        No p = this.primeiro;
        for(int y = 0; p != this.ultimo; y++){
            if(y == i){
                return p;
            }
            p = p.proximo;
        }
        System.out.println("Index invalido");
        return null;
    }

    public void print(){
        No p = this.primeiro;
        System.out.print("[");
        while(p != null){
            System.out.print(p.dado);
            p = p.proximo;
            if(p != null){System.out.print(", ");}
        }
        System.out.println("]");
    }

    public boolean vazio(){
        return this.primeiro == null;
    }

    public double similaridade(Lista lista){
        No p = this.primeiro;
        No p2 = lista.primeiro;
        double prod_vetorial = 0;
        double quad_todos1 = 0;
        double quad_todos2 = 0;
        while(p != null){
            prod_vetorial += p.dado * p2.dado;
            quad_todos1 += p.dado*p.dado;
            quad_todos2 += p2.dado*p2.dado;
            p = p.proximo;
            p2 = p2.proximo;
        }
        return (prod_vetorial/Math.sqrt(quad_todos1 * quad_todos2));
    }

    public void remove_primeiro(){
        if(!vazio()){
            this.primeiro = this.primeiro.proximo;
        }
    }
    public void remove_ultimo(){
        No p = this.primeiro;
        if(!vazio()){
            while(p != this.ultimo){
                if(p.proximo == this.ultimo){
                    this.ultimo = p;
                    this.ultimo.proximo = null;
                }else{
                    p = p.proximo;
                }
            }
        }
    }

    public void remove_depois(int index){remove_depois(this.get(index));}
    public void remove_depois(No no){
        No p = this.primeiro;
        while(p != null){
            if(p == no){
                p.proximo = p.proximo.proximo;
                return;
            }else{
                p = p.proximo;
            }
        }
        System.out.println("Valor inserido nao encontrado");
    }

    public void add_primeiro(int dado){
        No p = new No(dado);
        p.proximo = this.primeiro;
        this.primeiro = p;
    }
    public void add_ultimo(int dado){
        No p = new No(dado);
        this.ultimo.proximo = p;
        this.ultimo = this.ultimo.proximo;
    }
    public void add_depois(No no, int dado){
        No p = this.primeiro;

        while(p != no){
            if(p == no){
                No no2 = new No(dado);
                no2.proximo = p.proximo;
                p.proximo = no2;
                return;
            }
        }
        System.out.println("No nao encontrado na lista");
    }
    public void add_ordenado(int dado){
        No p = this.primeiro;
        if(p != null){
            if(p.dado > dado){ // caso for menor que o primeiro, coloca por primeiro (ou se tiver vazio)
                this.add_primeiro(dado);
            }else if(this.ultimo.dado < dado){ // caso for maior que o ultimo, coloca como o ultimo
                this.ultimo.proximo = new No(dado);
                this.ultimo = this.ultimo.proximo;
                
            }else{
                while(p.dado < dado){ // verifica todas, e coloca onde o proximo for maior
                    if(p.proximo.dado > dado){
                        No a = new No(dado);
                        a.proximo = p.proximo;
                        p.proximo = a;
                    }else{
                        p = p.proximo;
                    }
                }
            }
        }else{
            this.primeiro = new No(dado);
            this.ultimo = primeiro;
        }
    }
}

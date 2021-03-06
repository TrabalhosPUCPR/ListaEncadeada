public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public Integer getUltimoElemento(){
        return this.ultimo.dado;
    }
    public No get(int i){
        No p = this.primeiro;
        int cont = 0;
        while(p != null){
            if(cont == i){
                return p;
            }
            cont++;
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

    public Lista intersecao(Lista lista){
        No p = this.primeiro;
        Lista elementos = new Lista();
        while(p != null){
            if(lista.contains(p.dado) && !elementos.contains(p.dado)){
                elementos.add_ordenado(p.dado);
            }
            p = p.proximo;
        }
        return elementos;
    }

    private boolean contains(int n){
        No p = this.primeiro;
        while(p != null){
            if(p.dado == n){
                return true;
            }
            p = p.proximo;
        }
        return false;
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

    public Integer remove_primeiro(){
        if(!vazio()){
            Integer salva_dado = this.primeiro.dado;
            this.primeiro = this.primeiro.proximo;
            return salva_dado;
        }
        return null;
    }
    public Integer remove_ultimo(){
        No p = this.primeiro;
        if(!vazio()){
            while(p != this.ultimo){ // tenq fazer isso, como nao e uma lista duplamente encadeada
                if(p.proximo == this.ultimo){
                    Integer salva_dado = this.ultimo.dado;
                    this.ultimo = p;
                    this.ultimo.proximo = null;
                    return salva_dado;
                }else{
                    p = p.proximo;
                }
            }
        }
        return null; // caso nao tiver um ultimo
    }

    public Integer remove_depois(int index){return remove_depois(this.get(index));}
    public Integer remove_depois(No no){
        No p = this.primeiro;
        try{
            while(p != null){
                if(p == no){
                    Integer salva_dado = p.proximo.dado;
                    p.proximo = p.proximo.proximo;
                    return salva_dado;
                }else{
                    p = p.proximo;
                }
            }
        }catch(Exception e){ // so vai dar erro se estiver tentando retirar o valor depois do ultimo, que e nulo
            System.out.println("Impossivel remover um valor depois do ultimo");
            return null;
        }
        System.out.println("Index ou no inserido nao encontrado");
        return null;
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
        while(p != null){
            if(p == no){
                No no2 = new No(dado);
                no2.proximo = p.proximo;
                p.proximo = no2;
                return;
            }
            p = p.proximo;
        }
        System.out.println("No nao encontrado na lista");
    }
    public void add_ordenado(int dado){
        No p = this.primeiro;
        if(p != null){
            if(p.dado > dado){ // caso for menor que o primeiro, coloca por primeiro (ou se tiver vazio)
                this.add_primeiro(dado);
            }else if(this.ultimo.dado < dado){ // caso for maior que o ultimo, coloca como o ultimo
                this.add_ultimo(dado);
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

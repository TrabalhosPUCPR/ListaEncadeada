public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista(){
        primeiro = null;
        ultimo = null;
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

    public void add(int dado){add(dado, true);}
    public void add(int dado, boolean ordenado){
        No p = this.primeiro;
        if(p != null){
            if(ordenado){ // adiciona de forma ordenada
                if(p.dado > dado){ // caso for menor que o primeiro, coloca por primeiro (ou se tiver vazio)
                    this.primeiro = new No(dado);
                    this.primeiro.proximo = p;
                }else if(this.ultimo.dado < dado){ // caso for maior que o ultimo, coloca como o ultimo
                    p = this.ultimo;
                    this.ultimo.dado = dado;
                    this.ultimo.proximo = p;
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
                //ESSE SO ADICIONA NA ULTIMA POSICAO (NAO ORDENADO)
                this.ultimo.proximo = new No(dado);
                this.ultimo = this.ultimo.proximo;
            }
        }else{
            this.primeiro = new No(dado);
            this.ultimo = primeiro;
        }
    }
}

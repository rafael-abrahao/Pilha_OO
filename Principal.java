class Pilha {
    private static int TAM_MAX = 1000;
    private Object valores[];
    private int topo;

    public Pilha(){
        this.valores = new Object[TAM_MAX];
        this.topo = -1;
    }

    public Boolean empty(){
        return this.topo == -1;
    }

    public void push(Object valor){
        this.topo++;
        this.valores[this.topo] = valor;
    }
    
    public void push(Object valores[]){
        for(int i = 0; i < valores.length; i++){
            push(valores[i]);
        }
    }

    public void push(Pilha p){
        for(int i = 0; i <= p.topo; i++){
            push(p.valores[i]);
        }
    }

    public Object pop(){
        Object aux = this.valores[this.topo];
        this.valores[this.topo] = null;
        this.topo--;
        return aux;
    }

    public void pop(int qtd){
        if(qtd > this.topo + 1)
            qtd = this.topo + 1;
        for(int i = 0; i < qtd; i++)
            pop();
    }

    public Object top(){
        return this.valores[this.topo];
    }
}

public class Principal {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.push(new Integer[]{10, 20, 30});
        p.pop(2);
        System.out.println(p.top());
    }
}

package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 30, 'h');
        p[1] = new Pessoa("Maria", 25, 'm');
        
        l[0] = new Livro(p[0], "Dom casmurro", "Fernandes", 100);
        l[1] = new Livro(p[1], "Mumaumuam", "Cabral", 200);
        
        l[1].folhear(199);
        l[1].avancarPag();
        l[1].detalhes();
        
    }
    
}

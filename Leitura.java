import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura{
    File file;
    Scanner scan;
    String linha;
    String[] split;
    
    Lutador l1;
    Lutador l2;
    
    Acao acao1;
    Acao acao2;
    
    Luta luta;
    Round round;
    public Leitura(String liga){
        file = new File("src/" + liga);
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Colocar exceção aqui");
        }
        
        lerArquivo();
        
        scan.close();
    }
    
    public void novaLuta(){
        
        l1 = new Lutador(split[3], split[4], split[5], split[6]);
        l2 = new Lutador(split[13],split[14],split[15],split[16]);
            
        acao1 = new Acao(split[7], split[8], split[9], split[10], split[11], split[12]);
        acao2 = new Acao(split[17],split[18],split[19],split[20], split[21], split[22]);
            
        luta = new Luta(split[2],l1,l2);
        
        round = new Round(split[1], acao1, acao2);
        
        luta.addRound(round);
    }
    
    public void procedeLuta(){
        
        acao1 = new Acao(split[7], split[8], split[9], split[10], split[11], split[12]);
        acao2 = new Acao(split[17], split[18], split[19], split[20], split[21], split[22]);
        round = new Round(split[1], acao1, acao2);
        luta.addRound(round);
    }
    
    public void lerArquivo(){
        
        linha = scan.nextLine();
        split = linha.split(";"); 
        novaLuta();
        
        while(scan.hasNextLine()){
            linha = scan.nextLine();
            split = linha.split(";"); 
            if(Integer.parseInt(split[2]) == luta.id){
               procedeLuta();     
            }
            else{
                System.out.println(luta.resultado());
                novaLuta();
            }
        }
        System.out.println(luta.resultado());
    }
}

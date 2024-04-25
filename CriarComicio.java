
import java.util.ArrayList;
import java.util.List;

//import com.mycompany.show.Show.LerDados;//Aqui vou substituir para o package do arquivo

public class CriarComicio {
    /*public static void main(String args[]){
        registerComicio();
}*/
    public record Comicio(
        String nome,
        String data,
        String local,
        String Partido,
        String descricao,
        Boolean autorizacao
    ) {
        public static RegisterComicio Comiciocad(List<String> cadastoComicio){
            if(cadastocomicio.size() != 6){
                throw new IllegalArgumentException("A lista tem que ter 6 elementos ");
            }
            return new RegisterComicio(
            cadastoComicio.get(0), 
            cadastoComicio.get(1), 
            cadastoComicio.get(2), 
            cadastoComicio.get(3), 
            cadastoComicio.get(4),
            Boolean.parseBoolean(cadastoComicio.get(5)));
        }

    }

    public  class RegistroComicio{

        private static void registerComicio(){
            System.out.print("Digite o nome do comicio: ");
            var nomeComicio = LerDados.lerTexto();
    
            System.out.print("Digite a data do comicio: (ex: 00-00-0000)");
            var dataComcio = LerDados.lerIntMaiorQueZero("Ah, parça, colabora, vai! Digita aí um número, por favor: ");
    
            System.out.print("Digite o local do comicio: ");
            var localComicio = LerDados.lerTexto();

            System.out.print("Digite o partido: ");
            var partidoComicio = LerDados.lerTexto();

            System.out.print("Digite unma breve descrição do comicio: ");
            var descricaoComicio = LerDados.lerTexto();

            System.out.println("Tem autorização? Sim[S] Não[N]");
            var autorizacaoComicio = lerDados.lerTexto(null);

            if(autorizacaoComicio.equals("s") == true){
                autorizacaoComicio = "true";
            }else{
                autorizacaoComicio = "false";
                System.out.println("Vá atrás de uma autirização");
            }
    
            var comicio = new Comicio(nomeComicio, dataComcio, localComicio, partidoComicio,descricaoComicio,autorizacaoComicio );
            ArquivoComicio.salvar(veiculo);
            System.out.println("Comicio cadastrado!");
        }

    }
    /* 
    public static String[] registerComicio(){
        
        String[] totalInformation = {"","","","",""};
        String[] informationRegister = {"o Nome","a Data","o Local","o Partido","a Descricão"};
        boolean autorizacao = false;
        String opcao = "";
        String showInformation = "";
            for(int c = 0 ; c < 5; c++)
            {
                System.out.println("Escreva " + informationRegister[c] + " do evento:");
                totalInformation[c] = LerDados.readString("Tente novamente: ");
                showInformation = totalInformation[c]+ " " + showInformation;
        }   System.out.println("Você tem autorização para realizar esse comicio?  [S]sim/[n]Não");
            opcao = LerDados.readString("Tente novamente: ");
            if(opcao.toUpperCase().equals("S")){
                System.out.println("Otimo, Bom Trabalho");
                 autorizacao = true;
            }else{
                System.out.println("Procure um orgão publicom para conseuir a Autorização");
                autorizacao = false;
            }
            System.out.println("Informaçcoes: " + showInformation + " ");
            if (!autorizacao){
                return new String[0];
            }  
            
            return totalInformation;
}*/
}
import java.util.List;

public class CriarShow {
    
    public record RegisterShow(

         String nome,
         String data,
         String local,
         String horario,
         int limiteIngressos,
         String descricao,
         Boolean ingressosDisponiveis){
        

        public static RegisterShow Showcad(List<String> cadastoShow){
            if(cadastoShow.size() !=7){
                throw new IllegalArgumentException("A lista tem que ter 7 elementos ");
            }
            return new RegisterShow(cadastoShow.get(0), 
            cadastoShow.get(1), 
            cadastoShow.get(2), 
            cadastoShow.get(3), 
            Integer.parseInt(cadastoShow.get(4)), 
            cadastoShow.get(5),
            Boolean.parseBoolean(cadastoShow.get(6)));
        }
    } 

        public static void CadShow(){
            System.out.println("__________Cadasto de Show_________\nNome do Show: ");
            var nome = lerDados.lerTexto(null);
            System.out.println("Data do Show: ");
            var data = lerDados.lerTexto(null);     
            System.out.println("Local do Show: ");
            var local = lerDados.lerTexto(null);
            System.out.println("Horario do Show: ");
            var horario = lerDados.lerTexto(null);
            System.out.println("Limites de ingressos do Show: ");
            var limiteIngressos = lerDados.lerInt(null);
            System.out.println("Descrição do Show: ");
            var descricao = lerDados.lerTexto(null); 
            System.out.println("Os ingressos estão disponiveis? Sim[S] Não[N]");
            var ingressosDisponiveis = lerDados.lerTexto(null);

            if(ingressosDisponiveis.equals("s") == true){
               ingressosDisponiveis = "true";
            }else{
                ingressosDisponiveis = "false";
            }

            boolean ingressosDisponiveisBool = ingressosDisponiveis.equalsIgnoreCase("s");

            var show = new RegisterShow(nome, data, local, horario, limiteIngressos, descricao, ingressosDisponiveisBool);
        }
}

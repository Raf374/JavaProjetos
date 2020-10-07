package JavaOO;

public class Teste {
    public static void main(String []args){
        
        PessoaFisica pf;
        pf=new PessoaFisica(); 
        
        pf.setNome("Adjamir");
        pf.setDataNascimeento("26/07/1983");
        pf.setCpf("111.222.333-44");
        pf.setEmail("adjamir@gmail.com");
        pf.setTelefone("40028922");
        pf.setClienteData("21/21/2011");
        
        System.out.println("Pessoa Física:");
        
        System.out.println(
            "Nome: "+pf.getNome()+"\n"+
            "Idade: "+pf.getDataNascimeento()+"\n"+
            "CPF: "+pf.getCpf()+"\n"+
            "Email: "+pf.getEmail()+"\n"+
            "Telefone: "+pf.getTelefone()+"\n"+
            "Data de cadastro: "+pf.getClienteData()+"\n"            
        );
        
        Cliente cl;
        cl=new Cliente();
        
        cl.setClientedata("21/12/2001");
        
        System.out.println(
            "Cliente: \n"+
            "Data de Cadastro: "+cl.getClientedata()
            );
        
        Funcionario fn;
        fn=new Funcionario();
        
        fn.setCarteiraTrabalho("123482314");
        fn.setPis("21233");
        fn.setRegistro("2230");
        
        System.out.println(
            "Funcionario:\n"+
            "nº Carteria de trabalho: "+fn.getCarteiraTrabalho()+"\n"+
            "nº Pis: "+fn.getPis()+"\n"+
            "nº Registro: "+fn.getRegistro()+"\n"
        );
        
    }
}

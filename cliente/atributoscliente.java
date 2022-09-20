public class atributoscliente{ 
    public static void main(String[] args) throws Exception{
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Ricardo";
        cliente1.salario = 1.521;
        cliente1.idade = 20;

        System.out.println("O cliente "+cliente1.nome+" tem um salário de "+cliente1.salario+" e uma idade de "+cliente1.idade);

    }
}
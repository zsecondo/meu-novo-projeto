public class atributoscurso{ 
    public static void main(String[] args) throws Exception{
        Curso curso1 = new Curso();
        curso1.nomedocurso = "Analise e desenvolvimento de sistemas";
        curso1.tempodeaula = 1000.50;
        curso1.quantidadeaulas = 6;

        System.out.println("O curso de " + curso1.nomedocurso+" tem um total de horas de "+ curso1.tempodeaula+" distribuida  em uma quantida de "+curso1.quantidadeaulas+" aulas");

    }
}
package prova;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroTimes = 5;
        int numeroJogadoresPorTime = 11;
        
        int jogadoresMenoresDe18 = 0;
        double somaIdades = 0.0;
        double somaAlturas = 0.0;
        int totalJogadores = numeroTimes * numeroJogadoresPorTime;
        int jogadoresMaisDe80Kg = 0;
        
        for (int time = 1; time <= numeroTimes; time++) {
            System.out.println("Time " + time + ":");
            double somaIdadesTime = 0.0;
            for (int jogador = 1; jogador <= numeroJogadoresPorTime; jogador++) {
                System.out.println("Jogador " + jogador + ":");
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                System.out.print("Peso (em kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Altura (em metros): ");
                double altura = scanner.nextDouble();
                
                if (idade < 18) {
                    jogadoresMenoresDe18++;
                }
                
                somaIdades += idade;
                somaIdadesTime += idade;
                somaAlturas += altura;
                
                if (peso > 80) {
                    jogadoresMaisDe80Kg++;
                }
            }
            double mediaIdadesTime = somaIdadesTime / numeroJogadoresPorTime;
            System.out.println("Média de idade do Time " + time + ": " + mediaIdadesTime);
        }
        
        double mediaIdades = somaIdades / totalJogadores;
        double mediaAlturas = somaAlturas / totalJogadores;
        double porcentagemMaisDe80Kg = (double) jogadoresMaisDe80Kg / totalJogadores * 100;
        
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenoresDe18);
        System.out.println("Média das idades de todos os jogadores: " + mediaIdades);
        System.out.println("Média das alturas de todos os jogadores: " + mediaAlturas + " metros");
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porcentagemMaisDe80Kg + "%");
        
        scanner.close();
    }
}

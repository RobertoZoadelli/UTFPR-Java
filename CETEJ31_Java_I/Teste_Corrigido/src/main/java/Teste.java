
/**
 *
 * @author roberto.zoadeli
 */
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = new Veiculo();

            System.out.println("________________________________________"); 
            
            System.out.print("Digite a Placa: ");
            veiculos[i].setPlaca(scanner.nextLine());

            System.out.print("Digite a Marca: ");
            veiculos[i].setMarca(scanner.nextLine());

            System.out.print("Digite o Modelo: ");
            veiculos[i].setModelo(scanner.nextLine());

            System.out.print("Digite a Cor: ");
            veiculos[i].setCor(scanner.nextLine());

            System.out.print("Digite a Velocidade Máxima: ");
            veiculos[i].setVelocMax(scanner.nextFloat());

            System.out.print("Digite a quantidade de Rodas: ");
            veiculos[i].setQtdRodas(scanner.nextInt());

            System.out.print("Digite a quantidade de Pistões do Motor: ");
            veiculos[i].getMotor().setQtdPist(scanner.nextInt());

            System.out.print("Digite a potência do Motor: ");
            veiculos[i].getMotor().setPotencia(scanner.nextInt());
            

            scanner.nextLine();


        }

        for (int i = 0; i < veiculos.length; i++) {
            Veiculo v = veiculos[i];
            
            System.out.println("\nVeículo " + (i + 1) + ":");
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Velocidade Máxima: " + v.getVelocMax() + " km/h");
            System.out.println("Quantidade de Rodas: " + v.getQtdRodas());
            System.out.println("Pistões do Motor: " + v.getMotor().getQtdPist());
            System.out.println("Potência do Motor: " + v.getMotor().getPotencia() + " CV");
            System.out.println("________________________________________");

        }

        scanner.close();

    }
    
}

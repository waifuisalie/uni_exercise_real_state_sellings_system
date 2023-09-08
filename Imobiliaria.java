package ImobiApartPessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Imobiliaria {
    private ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.run();
    }
    
    public void incluir_apartamento(Apartamento a) {
        apartamentos.add(a);
    }

    private Apartamento encontrar_apt(int cod) {
        for (Apartamento apt : apartamentos) {
            if (apt.get_cod() == cod) {
                return apt;
            }
        }
        return null; // se não encontrar apartamento
    }
    
    public void run() {
        // presenting the menu
        int choice;
        do {
            System.out.println("1. Incluir Apartamento");
            System.out.println("2. Editar dados de Apartamento");
            System.out.println("3. Mostrar Apartamentos");
            System.out.println("4. Sair");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Informe o código: ");
                    int cod = scanner.nextInt();

                    System.out.print("Informe a Área Primitiva: ");
                    double area_prim = scanner.nextDouble();
                    
                    System.out.print("Informe a Área Comum: ");
                    double area_comum = scanner.nextDouble();
                    
                    System.out.print("Informe o preço: ");
                    float preco = scanner.nextFloat();
                    
                    Apartamento apt = new Apartamento(cod, area_prim, area_comum, preco);

                    System.out.print("Informe o nome do proprietário: ");
                    String nome_prop = scanner.next();
                    
                    System.out.print("Informe o telefone do proprietário: ");
                    String tel = scanner.next();
                    
                    apt.set_proprietario(nome_prop, tel);
                    incluir_apartamento(apt);
                    
                    break;
                case 2: 
                    System.out.println("Informe o código do apartamento: ");
                    int cod_edit = scanner.nextInt();
                    
                    Apartamento apt_modificar = encontrar_apt(cod_edit);

                    if (apt_modificar != null) {
                        System.out.println("Informe a nova Área Primitiva (or press enter to skip): ");
                        String nova_area_primitiva_str = scanner.nextLine(); // capturing the input as a string
                        if (!nova_area_primitiva_str.isEmpty()) { // checks if its not empty
                            double nova_area_primitiva_double = Double.parseDouble(nova_area_primitiva_str); // converts str to double
                            apt_modificar.set_area_primitiva(nova_area_primitiva_double);
                            System.out.println("Área Primitiva modificada com sucesso");
                        }

                        System.out.println("Informe a nova Área Comum (or press enter to skip): ");
                        String nova_area_comum_str = scanner.nextLine();
                        if (!nova_area_primitiva_str.isEmpty()) {
                            double nova_area_comum_double = Double.parseDouble(nova_area_comum_str);
                            apt_modificar.set_area_comum(nova_area_comum_double);
                            System.out.println("Área Comum modificada com sucesso");
                        }

                        System.out.println("Informe o novo Preço (or press enter to skip): ");
                        String novo_preco_str = scanner.nextLine();
                        if (!novo_preco_str.isEmpty()) {
                            float novo_preco_float = Float.parseFloat(novo_preco_str);
                            apt_modificar.set_preco(novo_preco_float);
                            System.out.println("Preço modificado com sucesso");
                        }

                        System.out.println("Informe o novo Nome do Proprietário: ");
                        String novo_nome = scanner.nextLine();
                        System.out.println("Informe o novo Telefone do Proprietário: ");
                        String novo_telefone = scanner.nextLine();

                        if (!novo_nome.isEmpty() && !novo_telefone.isEmpty()) {
                            apt_modificar.set_proprietario(novo_nome, novo_telefone);
                            System.out.println("Dados do Proprietário modificados com sucesoso");
                        }
                    } else {
                        System.out.println("Apartamento não encontrado.");
                    }
                    break;
                
                case 3:
                    for (Apartamento p : apartamentos) {
                    p.show_proprietario();
                    p.show_apartamento_carac();
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}

package ImobiApartPessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Imobiliaria {
    private ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();
    public static void main(String args[]) {
        Imobiliaria imobiliaria = new Imobiliaria();
        imobiliaria.run();
    }
    
    public void incluir_apartamento(Apartamento a) {
        apartamentos.add(a);
    }
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Coloque os detalhes dos apartamentos:");
        
        while (true) {
            System.out.print("Informe o código do apartamento (pressione 0 para parar)");
            int cod = scanner.nextInt();

            if (cod == 0) break;

            System.out.print("Informe a Área Primitiva: ");
            double area_prim = scanner.nextDouble();

            System.out.print("Informe a Área Comum: ");
            double area_comum = scanner.nextDouble();

            System.out.print("Informe o preço: ");
            float preco = scanner.nextFloat();

            System.out.print("Informe o nome do proprietário: ");
            String nome_prop = scanner.next();

            System.out.print("Informe o telefone do proprietário: ");
            int tel = scanner.nextInt();
            
            Apartamento apt = new Apartamento(cod, area_prim, area_comum, preco);

            apt.set_proprietario(nome_prop, tel);
            incluir_apartamento(apt);
        }

        for (Apartamento p : apartamentos) {
            p.show_proprietario();
            p.show_apartamento_carac();
        }
        
        scanner.close();
    }
}

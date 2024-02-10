import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        boolean rodarMenu = true;
        while (rodarMenu){
            menu.imprimirOpcoesMenuPrincipal();
            Integer opcao = 0;
            while (opcao == 0){
                System.out.print("Informe a opção: ");
                opcao = receberInteiro(scanner);
                if (menu.validarOpcao(opcao)){
                    break;
                }else{
                    System.out.println("Opção invalida");
                }
            }
            switch (opcao){
                case 1:
                    menu.ligarReprodutor();
                    System.out.println("Reprodutor Ligado;");
                    break;
                case 2:
                    menu.desligarReprodutor();
                    System.out.println("Reprodutor Desligado;");
                    break;
                case 3:
                    menu.imprimirDiscos();
                    break;
                case 4:
                    menu.imprimirReprodutor();
                    break;
                case 5:
                    menu.imprimirDiscos();
                    System.out.println("selecionar disco");
                case 15:
                    rodarMenu = false;
                    break;
                default:
                    System.out.println("opção não valida");
                    break;
            }

        }
        scanner.close();
    }

    public static Integer receberInteiro(Scanner scan){
        Integer returno = 0;
        try{
            returno = scan.nextInt();
            scan.nextLine();
        }catch (Exception e){
            scan.nextLine();
        }
        return returno;
    }
}
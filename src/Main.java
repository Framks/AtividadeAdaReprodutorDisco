import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true){
            menu.imprimirOpcoesMenuPrincipal();
            Integer opcao = 0;
            while (opcao == 0){
                opcao = receberInteiro(scanner);
                if (menu.validarOpcao(opcao)){
                    break;
                }else{
                    System.out.println("Opção invalida");
                }
            }
            switch (opcao){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }
        scanner.close();
    }

    public static Integer receberInteiro(Scanner scan){
        Integer returno = 0;
        try{
            returno = scan.nextInt();
        }catch (Exception e){
            String lixo = scan.nextLine();
            System.out.println("error : "+e.getMessage());
        }
        return returno;
    }
}
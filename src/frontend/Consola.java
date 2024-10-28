package frontend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Consola {
    private final Scanner scanner = new Scanner(System.in);

    public void escrever(String mensagem) {
        System.out.println(mensagem);
    }
    public void escrever(StringBuilder mensagem) {
        System.out.println(mensagem);
    }


    public void escreverErro(String mensagem) {
        System.err.println(mensagem);
    }

    public String lerString(String mensagem) {
        escrever(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem) {
        Integer numero = null;
        String texto;

        do {
            escrever(mensagem);
            texto = scanner.nextLine();

            try {
                numero = Integer.valueOf(texto);
            } catch (NumberFormatException e) {
                escreverErro(texto + " Não é um numero inteiro válido.");
            }

        } while (numero == null);

        return numero;
    }

    public int lerInteiroOpcoes(String[] opcoes) {
        Integer numero = null;
        String texto = "";

        do {
            escrever("Selecione uma das seguintes opções:");
            for (int i = 0; i < opcoes.length; i++) {
                escrever((i + 1) + " - " + opcoes[i]);
            }

            try {
                texto = scanner.nextLine();
                numero = Integer.valueOf(texto);
            } catch (NumberFormatException e) {
                escreverErro(texto + " Não é uma opção válida!");
            }

            if (numero == null || numero <= 0 || numero > opcoes.length) {
                numero = null;
                escreverErro(texto + "Não é uma opcão válida!");
            }

        } while (numero == null);

        return numero;
    }

    public double lerDecimal(String mensagem) {
        Double numero = null;
        String texto;

        do {
            escrever(mensagem);
            texto = scanner.nextLine();

            try {
                numero = Double.valueOf(texto);
            } catch (NumberFormatException e) {
                escreverErro(texto + " Não é um numero decimal valido.");
            }
        } while (numero == null);

        return numero;
    }

    public LocalDate lerData(String mensagem) {
        LocalDate data = null;
        String texto;

        do {
            escrever(mensagem + " (dd/mm/aaaa)");
            texto = scanner.nextLine();

            try {
                data = LocalDate.parse(texto,DateTimeFormatter.ofPattern("d/M/yyyy"));
            } catch (DateTimeParseException e) {
                escreverErro(texto + " Não é uma data no formato dd/mm/aaaa.");
            }

        } while (data == null);

        return data;
    }

    public LocalDateTime lerDataHora(String mensagem) {
        LocalDateTime data = null;
        String texto;

        do {
            escrever(mensagem + " (dd/mm/aaaa hh:mm)");
            texto = scanner.nextLine();

            try {
                data = LocalDateTime.parse(texto,
                        DateTimeFormatter.ofPattern("d/M/yyyy HH:mm"));
            } catch (DateTimeParseException e) {
                escreverErro(texto + "Não é uma data no formato dd/mm/aaaa hh:mm");
            }

        } while (data == null);

        return data;
    }
}

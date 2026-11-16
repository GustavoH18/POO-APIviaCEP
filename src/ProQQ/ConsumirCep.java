/**
 * Projeto: POO - API ViaCEP
 * Aluno: GUSTAVO HENRIQUE OLIVEIRA COSTA
 * RA: 0025427
 */

package ProQQ;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirCep {

    public static void main(String[] args) {
        String cep = args.length > 0 ? args[0] : "01001000";

        if (!cep.matches("\\d{8}")) {
            System.out.println("CEP inválido. Informe exatamente 8 números.");
            return;
        }

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            System.out.println("Status da resposta: " + response.statusCode());

            if (response.statusCode() == 200) {
                System.out.println("Dados do CEP: 72410-701");
                System.out.println(response.body());

                if (response.body().contains("\"erro\": true")) {
                    System.out.println("Atenção: o CEP informado não foi encontrado.");
                }
            } else {
                System.out.println("Não foi possível consultar o CEP. Código HTTP: "
                        + response.statusCode());
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("A consulta foi interrompida: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao consultar o CEP: " + e.getMessage());
        }
    }
}

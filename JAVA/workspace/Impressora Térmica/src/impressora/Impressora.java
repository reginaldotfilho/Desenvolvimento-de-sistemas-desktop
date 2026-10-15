/**
 * Impressora Térmica (servidor de impressão completo com memória, processador, placa de rede etc)
 * Serviço http (servidor WEB  porta 80)
 * Serviço RAW ESC/POS (porta 9100) "Linguagem de impressora"
 */

package impressora;

//Importar biblioteca Socket (usada para estabelecer uma conexão com a rede)
import java.net.Socket;

//Importação de recursos para trabalhar com data e hora
import java.time.LocalDateTime;

//Importação da biblioteca que formata data e hora
import java.time.format.DateTimeFormatter;

//Importar biblioteca OutputStream usada para enviar  e receber dados)
import java.io.OutputStream;

public class Impressora {

	public static void main(String[] args) {
		//Tratamento de exceções
		try {
			//criação de objetos
			//modificar o ip conforme rede
			java.net.Socket impressora = new Socket("10.26.45.47", 9100);
			java.io.OutputStream saida = impressora.getOutputStream();
			
			//Formatação =================
			
			//Imprimir data e hora
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			//Criar variável para armazenar a data e hora formatada
			String dataHora = "Data: "+ agora.format(formato) + "\n\n";
			//Impressão data e hora (conteúdo da variável)
			saida.write(dataHora.getBytes("CP850"));
			
			//Negrito(BOLD) 
			saida.write(new byte[] {0x1b, 0x45, 0x01});
			
			//Centralizado
			saida.write(new byte[] {0x1B, 0x61, 0x01});
			
			//Aumentar a fonte
			//Atenção! O último byte representa o tamanho
			//0x00 (normal) 0x11 (2x) 0x22 (3x) 0x33(4x)...
			saida.write(new byte[] {0x1D, 0x21, 0x22});

			//CP850 = UTF-8 \n quebra de linha
			saida.write("PDV\n\n".getBytes("CP850"));
			
			//Texto normal )desativar negrito)
			saida.write(new byte[] {0x1b, 0x45, 0x00});
			
			//Alinhamento a esquerda
			saida.write(new byte[] {0x1b, 0x61, 0x00});
			
			//Voltar ao tamanho normal
			saida.write(new byte[] {0x1D, 0x21, 0x00});
			
			//Alinhamento a direita
			//saida.write(new byte[] {0x1b, 0x61, 0x02});
			
			saida.write("Reginaldo T Filho\n".getBytes("CP850"));
			
			//Avanço de papael (linhas)
			//Atenção o último byte 0x05 representa número de linhas
			// oxo2 (2 linhas) oxo5 (5 linhas) 0x06 (6 linhas)...
			saida.write(new byte[] {0x1B, 0x64, 0x05});
			
			//corte de papel
			saida.write(new byte[] {0x1D, 0x56, 0x00});
			
			//Fim formatação ===========================
			
			//Imprimir
			saida.flush();
			
			//encerrar a conexão 
			impressora.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

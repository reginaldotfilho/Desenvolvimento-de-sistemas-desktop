package impressora;

import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.OutputStream;

public class AvaliacaoImpressora {

	public static void main(String[] args) {
		
		try {
			
			java.net.Socket impressora1 = new Socket("10.26.45.52", 9100);
			java.io.OutputStream saida1 = impressora1.getOutputStream();
			
			
			//Inicio===========================
			
			
			//===========TITULO=================
			//Negrito(BOLD) 
			saida1.write(new byte[] {0x1b, 0x45, 0x01});
			//Centralizado
			saida1.write(new byte[] {0x1B, 0x61, 0x01});
			//Aumentar a fonte
			saida1.write(new byte[] {0x1D, 0x21, 0x22});
			//CP850 = UTF-8 \n quebra de linha
			saida1.write("RTech\n\n".getBytes("CP850"));
			//Texto normal )desativar negrito)
			saida1.write(new byte[] {0x1b, 0x45, 0x00});
			//===================================//
			
			//=========Nome da razão Social===========
			//Centralizado
			saida1.write(new byte[] {0x1B, 0x61, 0x01});
			//Tamanho fonte
			saida1.write(new byte[] {0x1D, 0x21, 0x00});
			saida1.write("RTECH TECNOLOGIA LTDA.\n".getBytes("CP850"));
			
			//=========ENDEREÇO,CEP,TELEFONE=========//
			saida1.write("Av. Antonio de Souza Queiroz, 279 \n".getBytes("CP850"));
			saida1.write("Zona Leste - 08280-340 - Cidade Lider \n".getBytes("CP850"));
			saida1.write("(11) 9-6329-9453 \n\n".getBytes("CP850"));
			//Alinhamento a esquerda
			saida1.write(new byte[] {0x1b, 0x61, 0x00});
			saida1.write("CNPJ: 11.111.111./0001-11        IE: 11.222.333\n\n".getBytes("CP850"));
			saida1.write("CLIENTE: CONSUMIDOR FINAL\n\n".getBytes("CP850"));
			
			
			//=========== Imprimir data e hora ==============//
			
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			//Criar variável para armazenar a data e hora formatada
			String dataHora = "Data: "+ agora.format(formato) + "  Comprovante de venda\n";
			//Impressão data e hora (conteúdo da variável)
			saida1.write(dataHora.getBytes("CP850"));
			//Alinhamento a direita
			saida1.write(new byte[] {0x1b, 0x61, 0x02});
			//Tamanho da fonte
			saida1.write(new byte[] {0x1D, 0x21, 0x11});
			saida1.write("N° 000001 \n".getBytes("CP850"));
			//Tamanho da fonte
			saida1.write(new byte[] {0x1D, 0x21, 0x00});
			saida1.write("________________________________________________\n".getBytes("CP850"));
			
			//Alinhamento a esquerda
			saida1.write(new byte[] {0x1b, 0x61, 0x00});
			saida1.write("CODIGO              DESCRICAO        GARANTIA\n".getBytes("CP850"));
			saida1.write("                    QTDxUNIT         R$ VALOR \n".getBytes("CP850"));
			saida1.write("________________________________________________\n".getBytes("CP850"));
			
			saida1.write("05001 HD 500GB SEAGATE MOMENUS 7200.4       3M \n".getBytes("CP850"));
			saida1.write("                           1 x 250,00\n\n".getBytes("CP850"));
			saida1.write("06001 MEMORIA 4GB DDR# 133MHZ - MARKVISION  3M \n".getBytes("CP850"));
			saida1.write("                           1 x 70,00\n".getBytes("CP850"));
			saida1.write("________________________________________________\n".getBytes("CP850"));
			
			//Negrito(BOLD) 
			saida1.write(new byte[] {0x1b, 0x45, 0x01});
			saida1.write("TOTAL DA NOTA R$                        320,00\n\n".getBytes("CP850"));
			saida1.write("VALOR RECEBIDO R$                       400,00\n\n".getBytes("CP850"));
			saida1.write("TROCO R$                                 80,00\n\n".getBytes("CP850"));
			saida1.write("FORMA DE PGTO.: PIX  \n\n".getBytes("CP850"));
			
			saida1.write("DATA PGTO         R$VALOR             TIPO PGTO\n\n".getBytes("CP850"));
			//Texto normal )desativar negrito)
			saida1.write(new byte[] {0x1b, 0x45, 0x00});

			LocalDateTime dataAgora = LocalDateTime.now();
			DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String data1 = dataAgora.format(formato1) + "        320,00               PIX\n";
			saida1.write(data1.getBytes("CP850"));
			saida1.write("________________________________________________\n".getBytes("CP850"));
			saida1.write("VENDEDOR(A): REGINALDO \n".getBytes("CP850"));
			saida1.write("________________________________________________\n\n".getBytes("CP850"));
			
			saida1.write("Numeoros de Serie: \n".getBytes("CP850"));
			saida1.write("6Y080L0030102, 508XHVDBDB1808\n\n\n\n".getBytes("CP850"));
			
			
			//Centralizado
			saida1.write(new byte[] {0x1B, 0x61, 0x01});
			saida1.write("Recebi a(s) mercadorias(s) acima descrita(s),\n".getBytes("CP850"));
			saida1.write("concordando plenamente com os prazos e condições\n".getBytes("CP850"));
			saida1.write("de garantia.\n\n\n".getBytes("CP850"));
			
			saida1.write("___________________________________________\n\n".getBytes("CP850"));
			saida1.write("ASSINATURA DO CLIENTE\n\n".getBytes("CP850"));
			//Negrito(BOLD) 
			saida1.write(new byte[] {0x1b, 0x45, 0x01});
			saida1.write("________________________________________________\n\n".getBytes("CP850"));
			saida1.write("* OBRIGADO E VOLTE SEMPRE *\n\n".getBytes("CP850"));
			
			
			//=========================================//
			//Avanço de papael (linhas)
			saida1.write(new byte[] {0x1B, 0x64, 0x05});
			//corte de papel
			saida1.write(new byte[] {0x1D, 0x56, 0x00});
			//Fim=================
			
			saida1.flush();
			impressora1.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}

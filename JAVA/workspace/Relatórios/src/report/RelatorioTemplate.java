package report;
 
//Biblioteca que lida com o sistema operacional (Inteface gráfica)
import java.awt.Desktop;
 
//biblioteca interna para entrada e saída
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
//Biblioteca Externa (openPDF)
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
 
public class RelatorioTemplate {
 
	public static void main(String[] args) {
		//Obrigatorio uso do Try catch
		
		try {
			//Criar um objeto document (Documento PDF)
			//PageSize.A4.rotate() - pagina deitada (landscape)
			Document document = new Document(PageSize.A4);
			
			//Caminho e nome do arquivo
			String caminho = "relatório.pdf";
			
			//Criar o arquivo PDF
			PdfWriter.getInstance(document, new FileOutputStream(caminho));
			
			document.open(); // Inicio da fomatação (conteúdo do PDF)
			
			//Titulo personalizado
			Font fontTitulo = new Font(Font.HELVETICA, 16, Font.BOLD);
			Paragraph titulo = new Paragraph("RELATÒRIO", fontTitulo);
			titulo.setAlignment(Element.ALIGN_CENTER);
			document.add(titulo);
			
			//Imprimir data e hora
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			
			//a linha abaixo cria uma variável que armazena a data e hora
			String dataHora = agora.format(formato);
			
			//Parágrafo Centralizado e personalizado
			Paragraph dataEmissao = new Paragraph("Data de emissão: " + dataHora);
			
			//acessando os métodos na classe modelo Paragraph
			dataEmissao.setAlignment(Element.ALIGN_CENTER);
			document.add(dataEmissao);
			
			//Parágrago simples
			document.add(new Paragraph("Conteúdo"));
			
			//espaço
			document.add(new Paragraph("  "));
			
			//tabela-------------------------------
			//Criar um objeto tabela com 3 colunas
			PdfPTable tabela = new PdfPTable(3);
			tabela.setWidths(new float [] { 1.0f, 5.0f, 3.0f});
			//Ocupar a largura inteira da folha
			tabela.setWidthPercentage(100);
			
			//Formatação da tabela
			Font fontCabecalho = new Font(Font.HELVETICA, 11, Font.BOLD, java.awt.Color.WHITE);
			//cor RGB
			java.awt.Color corCabecalho = new java.awt.Color(0, 124, 240);
			
			//cabeçalho da tabela
			String[] colunas = { "ID", "Nome", "Fone" };
			for (int i = 0; i < colunas.length; i++) {
				PdfPCell celulaCabecalho = new PdfPCell(new Paragraph (colunas[i], fontCabecalho));
				celulaCabecalho.setBackgroundColor(corCabecalho);
				celulaCabecalho.setPadding(5f); //Espaçamento interno
				//celulaCabecalho.setHorizontalAlignment(Element.ALIGN_CENTER); //centralização da celula do cabeçalho
				tabela.addCell(celulaCabecalho);
			}
			//corpo da tabela (futaramente vai trazer do banco de dados)
			tabela.addCell("1");
			tabela.addCell("Bill Gates");
			tabela.addCell("(11) 96329-9453");
			
			tabela.addCell("2");
			tabela.addCell("Linus Torvalds");
			tabela.addCell("(11) 99999-9999");
			
			
			document.add(tabela);
			
			//Fim tabela-----------------------------
			
			document.close(); // Fim da formatação (conteúdo do PDF)
			
			//Abrir o PDF automaticamente no leitor padrão do cliente
			File arquivo = new File(caminho);
			Desktop.getDesktop().open(arquivo);
		} catch (Exception e) {
			System.out.println(e);
		}
 
	}
 
}
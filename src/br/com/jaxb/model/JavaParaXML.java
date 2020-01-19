package br.com.jaxb.model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaParaXML {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Endereco endereco = new Endereco("Rua Moraes", 40, "Centro", "RJ", "2000-0000");
		Contato contato = new Contato("Marco Maciel", "M", 34, endereco);
		
		JAXBContext context = JAXBContext.newInstance("br.com.jaxb.model");
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(contato, System.out);
		
		File file = new File("src/contato.xml");
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(contato, new FileOutputStream(file));
		
	}
}

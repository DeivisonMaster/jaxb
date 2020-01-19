package br.com.jaxb.model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlParaJava {
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance("br.com.jaxb.model");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object1 = unmarshaller.unmarshal(new File("src/contato2.xml"));
		
		Contato contato = (Contato) object1;
		System.out.println(contato.getNome() + " " + contato.getSexo());
		
		
		// Carro
		Object object2 = unmarshaller.unmarshal(new File("src/carro.xml"));
		Carro carro = (Carro) object2;
		System.out.println(carro.getNome());
		
	}
}















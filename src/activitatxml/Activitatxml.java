/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitatxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author mark
 */
public class Activitatxml {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException { 
        File file = new File("familia.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(ArbreGenealogic.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        ArbreGenealogic familiaReial = (ArbreGenealogic) jaxbUnmarshaller.unmarshal(file);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

        jaxbMarshaller.marshal( familiaReial, new File( "copia.xml" ) );
        jaxbMarshaller.marshal( familiaReial, System.out );
   
            
                
    }
    
    
    
}

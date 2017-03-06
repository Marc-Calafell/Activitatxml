/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitatxml;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute; 
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author mark
 */


@XmlRootElement 
public class ArbreGenealogic {
    
    private String nom;
    private String conjuge;
    private List<ArbreGenealogic> arbreGenealogic;
    
    @XmlAttribute
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    @XmlElement
    public String getConjuge() { return conjuge; }
    public void setConjuge(String conjuge) { this.conjuge = conjuge; }

    @XmlElement
    public List<ArbreGenealogic> getArbreGenealogic() { return arbreGenealogic;}
    public void setArbreGenealogic(List<ArbreGenealogic> arbreGenealogic) {this.arbreGenealogic = arbreGenealogic;}
    
    public ArbreGenealogic() {}
    
    
    
}

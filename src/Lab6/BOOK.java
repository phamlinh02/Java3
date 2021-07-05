/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.math.BigDecimal;

/**
 *
 * @author Thuy Linh
 */
public class BOOK {
    private String Title ;
    private int ID ;
    private BigDecimal Price ;

    public BOOK() {
    }

    public BOOK(String Title, int ID, BigDecimal Price) {
        this.Title = Title;
        this.ID = ID;
        this.Price = Price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal Price) {
        this.Price = Price;
    }
    
    
    
}

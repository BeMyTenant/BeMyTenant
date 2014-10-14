/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.*;

/**
 *
 * @author catherinehuh
 */
public class Bill {

    private int id;
    private String billName;
    private String billAmount;
    private String dueDate;
    private List<String> notes = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public boolean validate() {
        if (billName == null || billName.equals("")) {
            return false;
        }
        if (billAmount == null || billAmount.equals("")) {
            return false;
        }
        if (dueDate == null || dueDate.equals("")) {
            return false;
        }
        return true;

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this != obj) {
            return false;
        }
        if (!(obj instanceof Bill)) {
            return false;
        }
        Bill bill = (Bill) obj;
        if (!this.billName.equals(bill.billName)) {
            return false;
        }
        return false;
    }

}

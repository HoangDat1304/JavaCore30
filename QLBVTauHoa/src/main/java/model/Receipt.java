package model;

import javax.persistence.*;

@Table(name = "HOA_DON")
@Entity
public class Receipt {
    @Id
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @Id
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "ticket_id", referencedColumnName = "id")
    private Ticket ticket;

    @Column(name="quantity" , nullable = false)
    private int quantity;

    public Receipt() {
    }

    public Receipt(Customer customer, Ticket ticket, int quantity) {
        this.customer = customer;
        this.ticket = ticket;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customer=" + customer +
                ", ticket=" + ticket +
                ", quantity=" + quantity +
                '}';
    }
}

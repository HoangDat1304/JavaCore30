package model;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

@Table(name ="VE_TAU")
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "ticket_type", nullable = false)
    private String ticket_type;
    @Column(name = "price", nullable = false)
    private int price;
    @OneToMany(fetch = FetchType.EAGER ,mappedBy = "ticket", cascade = CascadeType.ALL)
    private List<Receipt> receipt;

    public Ticket() {
    }

    public Ticket(int id, String ticket_type, int price, List<Receipt> receipt) {
        this.id = id;
        this.ticket_type = ticket_type;
        this.price = price;
        this.receipt = receipt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Receipt> getReceipt() {
        return receipt;
    }

    public void setReceipt(List<Receipt> receipt) {
        this.receipt = receipt;
    }

    public void nhapTicket() {
        System.out.println("Nhập thông tin vé ");
        System.out.print("Nhập loại vé  ");
        this.ticket_type = new Scanner(System.in).nextLine();
        System.out.print("Nhập giá  ");
        this.price = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticket_type='" + ticket_type + '\'' +
                ", price=" + price +
                '}';
    }
}

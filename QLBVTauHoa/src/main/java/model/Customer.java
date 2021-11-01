package model;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

@Table(name = "NGUOI_MUA_VE")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = " name ", nullable = false)
    private String name;
    @Column(name = "phone ", nullable = false)
    private int phone;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "customer_type", nullable = false)
    private String customer_type;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Receipt> receipt;

    public static final String MUA_LE = "Mua lẻ";
    public static final String MUA_TAP_THE = "Mua tập thể";
    public static final String MUA_QUA_MANG = "Mua qua mạng";

    public Customer() {
    }

    public Customer(int id, String name, int phone, String address, String customer_type, List<Receipt> receipt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.customer_type = customer_type;
        this.receipt = receipt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public List<Receipt> getReceipt() {
        return receipt;
    }

    public void setReceipt(List<Receipt> receipt) {
        this.receipt = receipt;
    }

    public void nhapCustomer() {
        System.out.println("Nhập tên người mua: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ : ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại : ");
        this.phone = new Scanner(System.in).nextInt();
        System.out.println("Nhập loại người mua: ");
        System.out.println("1: Mua lẻ");
        System.out.println("2: Mua qua mạng");
        System.out.println("3: Mua tập thể");
        System.out.print("mời bạn nhập loại người mua : ");
        boolean check = true;
        int chon;
        do {
            try {
                chon = new Scanner(System.in).nextInt();
                check = true;
            } catch (Exception e) {
                System.out.print("Không được nhập ký tự khác ngoài số ");
                check = false;
                continue;
            }
            if (chon <= 0 || chon > 3) {
                System.out.print("Nhập số trong khoảng từ 1 -> 3! Vui lòng thử lại: ");
                check = false;
                continue;
            }
            switch (chon) {
                case 1:
                    this.customer_type = MUA_LE;
                    break;
                case 2:
                    this.customer_type = MUA_QUA_MANG;
                    break;
                case 3:
                    this.customer_type = MUA_TAP_THE;
                    break;
                default:
                    System.out.print("Loại kh vừa chọn không hợp lệ, vui lòng chọn lại: ");
                    check = false;
                    break;
            }
        } while (!check);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", customer_type='" + customer_type + '\'' +
                '}';
    }
}

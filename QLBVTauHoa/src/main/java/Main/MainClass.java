package Main;

import dao.CustomerDao;
import dao.ReceiptDao;
import dao.TicketDao;
import model.Customer;
import model.Receipt;
import model.Ticket;

import java.util.*;

public class MainClass {
    private static List<Customer> listCustomer = new ArrayList<Customer>();
    private static List<Ticket>  listTicket = new ArrayList<Ticket>();
    private static List<Receipt> listReceipt = new ArrayList<Receipt>();
    private static CustomerDao customerDao = new CustomerDao();
    private static TicketDao ticketDao = new TicketDao();
    private static ReceiptDao receiptDao = new ReceiptDao();

    public static void main(String[] args) {
        menu();
    }
    public static int menu(){
        do {
            System.out.println(" QUẢN LÝ BÁN VÉ TÀU HỎA");
            System.out.println("1: Nhập danh sách người mua vé");
            System.out.println("2: In ra danh sách người mua đã có ");
            System.out.println("3: Nhập danh sách loại vé");
            System.out.println("4: In ra danh sách các loại vé đã có");
            System.out.println("5: Nhập danh sách hóa đơn mua vé cho mỗi người mua và in danh sách ra");
            System.out.println("6:Sắp xếp danh sách hóa đơn  theo họ tên người mua ");
            System.out.println("7: Sắp xếp danh sách hóa đơn theo số lượng vé mua ( asc) ");
            System.out.println("8: Lập bảng kê số tiền phải tra cho mỗi người mua   ");
            System.out.println("9: Thoát");
            System.out.println("---------------------------------");
            System.out.print("Xin mời bạn chọn chức năng: ");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
                switch (chon){
                    case 1:
                        nhapDS();
                        break;
                    case 2:
                        inDS();
                        break;
                    case 3:
                        nhapLoaiVe();
                        break;
                    case 4:
                        inLoaiVe();
                        break;
                    case 5:
                        nhapDSHĐ();
                        break;
                    case 6:
                        sapXepTheoTen();
                        break;
                    case 7:
                        sapXepTheoSL();
                        break;
                    case 8:
                        break;
                    case 9:
                        System.exit(0);
                }
        }while (true);
    }

    public static void nhapDS(){
        Customer a = new Customer();
       a.nhapCustomer();
       listCustomer.add(a);
       customerDao.addNew();
    }
    public static  void inDS(){
        for(Customer a : listCustomer){
            System.out.println(a);
        }
    }
    public  static void nhapLoaiVe(){
        Ticket b = new Ticket();
        b.nhapTicket();
        listTicket.add(b);
        ticketDao.addNew();
    }
    public static void inLoaiVe(){
        for(Ticket b : listTicket){
            System.out.println(b);
        }
    }

    public  static void sapXepTheoTen(){
        List<Receipt> list = receiptDao.getAllReceipt();
        Collections.sort(list, new Comparator<Receipt>() {
            public int compare(Receipt o1, Receipt o2) {
                return o1.getCustomer().getName().compareTo(o2.getCustomer().getName());
            }
        });
    }

    public static void sapXepTheoSL(){
        List<Receipt>list = receiptDao.getAllReceipt();
        Collections.sort(list, new Comparator<Receipt>() {
            public int compare(Receipt o1, Receipt o2) {
                return o2.getQuantity() - o1.getQuantity();
            }
        });
    }
    public static Customer searchCustomer(int id){
        for(Customer a : listCustomer){
            if(a.getId() == id){
               return  a;
            }
        }
        return null;
    }
    public static Ticket searchTicket(int id){
        for(Ticket b : listTicket){
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public static void nhapDSHĐ(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("mời bạn nhập mã người mua");
            int maNM;
            boolean check = false;
            Customer customer;
            do {
                maNM = sc.nextInt();
                customer = searchCustomer(maNM);
                if (customer == null || maNM <= 4 ) {
                    System.out.println(" mời bạn nhâp lại mã người mua");
                    check = true;
                } else {
                    check = false;
                }
            } while (check);
            //////////
            System.out.println(" mời bạn nhập mã loại vé ");
            int maVe;
            Ticket ticket;
            do {
                maVe = sc.nextInt();
                ticket = searchTicket(maVe);
                if (ticket == null ) {
                    System.out.println("mời bạn nhập lại mã của loại vé ");
                    check = true;
                } else {
                    check = false;
                }
            } while (check);
            ////
            System.out.println("mời bạn nhập số lượng vé mua");
            int quantity = 0;
            do {
                try {
                    quantity = sc.nextInt();
                    check = true;
                } catch (Exception e) {
                    System.out.println("Không được có ký tự khác ngoài số ");
                    check = false;
                }
                if (quantity > 0 || quantity < 20) {
                    System.out.print("Số lượt mua phải lớn hơn 0 và nhỏ hơn 20");
                    check = false;
                }
            } while (!check);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}




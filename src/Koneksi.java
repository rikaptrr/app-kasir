import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Koneksi {
    private String url="jdbc:mysql://localhost/App_Kasir_Rika";
    private String Username="root";
    private String Password="";
    private Connection con;
    public void connect(){
        try {
            con=DriverManager.getConnection(url,Username,Password);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi databse gagal");
        }
    
}
    public Connection getcon(){
        return con;
    }
}

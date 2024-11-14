/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
    
     public static Connection konek() {
        Connection c = null;
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("akun");
            dataSource.setPortNumber(3306);
            dataSource.setAllowMultiQueries(true);
            dataSource.setServerTimezone("Asia/Jakarta");
            c = dataSource.getConnection();
        } catch (SQLException e) {
            System.err.println(e);
        }
        return c;
    }

    // Method main untuk testing koneksi
    public static void main(String[] args) {
        Connection connection = koneksi.konek(); // Memanggil method konek()
        
        if (connection != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal!");
        }
    }
    
}

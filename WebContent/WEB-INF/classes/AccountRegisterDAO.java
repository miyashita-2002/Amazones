package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.AccountBeans;

public class AccountRegisterDAO {
    // ÉfÅ[É^ÉxÅ[ÉXê⁄ë±Ç…égópÇ∑ÇÈèÓïÒ
    final String jdbcId = "info";
    final String jdbcPass = "pro";
    final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";

    public  AccountRegisterDAO(AccountBeans ab) {

        try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

            String sql = "INSERT INTO account (loginId, pass, name, roleId) VALUES (?, ?, ?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, ab.getLoginId());
            ps.setString(2, ab.getPass());
            ps.setString(3, ab.getName());
            ps.setInt(4, ab.getRole());

            int r = ps.executeUpdate();

            if(r != 0) {
                System.out.println("êVãKìoò^ê¨å˜ÅI");
            } else {
                System.out.println("êVãKìoò^é∏îs( …ÑD`)º∏º∏Åc");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
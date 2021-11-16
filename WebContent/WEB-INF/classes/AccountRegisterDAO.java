//package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.AccountBeans;

public class AccountRegisterDAO {
    // �f�[�^�x�[�X�ڑ��Ɏg�p������
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
                System.out.println("�V�K�o�^�����I");
            } else {
                System.out.println("�V�K�o�^���s( ɄD`)�����c");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
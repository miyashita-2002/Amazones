//package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.AccountBeans;

public class AccountDAO {
	// �f�[�^�x�[�X�ڑ��Ɏg�p������
    final String jdbcId = "info";
    final String jdbcPass = "pro";
    final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";

    // ���O�C���A�J�E���g��T��
    public AccountBeans findAccount(AccountBeans ab) {

        // �߂�l�̗p��
        AccountBeans returnAb = new AccountBeans();

        // �f�[�^�x�[�X�֐ڑ�
        try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

            String sql = "SELECT loginId, pass, name, roleId FROM account WHERE loginId = ? AND pass = ?";
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, ab.getLoginId());
            ps.setString(2, ab.getPass());

            ResultSet rs = ps.executeQuery();


            if (rs.next()) {
                // ���������A�J�E���g����߂�l�ɃZ�b�g
                returnAb.setLoginId(rs.getString("loginId"));
                returnAb.setPass(rs.getString("pass"));
                returnAb.setName(rs.getString("name"));
                returnAb.setRole(rs.getInt("roleId"));
            } else {
                // �A�J�E���g���Ȃ����null��Ԃ�
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return returnAb;
    }
}


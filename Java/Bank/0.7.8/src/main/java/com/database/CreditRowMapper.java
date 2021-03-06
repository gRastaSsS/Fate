package com.database;

import com.database.Cells.Credit;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreditRowMapper implements RowMapper<Credit> {
    //clientID, cashTotal, cashPaid, cashWithPercent, percent, deadline
    Credit credit;
    @Override
    public Credit mapRow(ResultSet resultSet, int i) throws SQLException {
        credit = new Credit();
        credit.setID(resultSet.getInt("id"));
        credit.setClientID(resultSet.getInt("clientID"));
        credit.setCashTotal(resultSet.getDouble("cashTotal"));
        credit.setCashPaid(resultSet.getDouble("cashPaid"));
        credit.setCashWithPercent(resultSet.getDouble("cashWithPercent"));
        credit.setPercent(resultSet.getDouble("percent"));
        credit.setDeadline(resultSet.getDate("deadline").toLocalDate());
        return credit;
    }
}

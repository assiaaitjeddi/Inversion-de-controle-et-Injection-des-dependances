package dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("dao")  //déclarer cette classe comme bean(version XML)
public class DaoImpl implements IDao{
    @Override
    public String getDate() {
        Date date = new Date();
        return "La nouvelle date est : "+date.toString();
    }
}

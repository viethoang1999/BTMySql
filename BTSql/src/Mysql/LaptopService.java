package Mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class LaptopService {
    private Connection con;

    public LaptopService() {
    }

    public LaptopService(Connection connection) {
        this.con = connection;
    }

    public List<LaptopEntity> SearchPrice(Long fromprices, Long toprice) {
        List<LaptopEntity> laptopEntities = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            String query = "";
            if (fromprices == null && toprice != null) {
                query = "select*from laptop where price<=" + toprice;
            } else if (fromprices != null && toprice == null) {
                query = "select*from laptop where price>=" + fromprices;
            } else if (fromprices != null && toprice != null) {
                query = "select*from laptop where price between " + fromprices + "and" + toprice;
            }
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                LaptopEntity laptopEntity = new LaptopEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getFloat(13),
                        rs.getInt(14),
                        rs.getTimestamp(15),
                        rs.getTimestamp(16)
                );
                laptopEntities.add(laptopEntity);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopEntities;
    }

    public List<LaptopEntity> Searchmakerandssd(String maker, String ssd) {

        try {
            List<LaptopEntity> laptopEntities = new ArrayList<>();
            String query = "SELECT * FROM laptop where maker='" + maker + "' and ssd='" + ssd + "'";
            Statement statement=con.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while (rs.next()){
                LaptopEntity laptopEntity = new LaptopEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getFloat(13),
                        rs.getInt(14),
                        rs.getTimestamp(15),
                        rs.getTimestamp(16)

                );
                laptopEntities.add(laptopEntity);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

       return null;
    }

    private List<LaptopEntity> queryDatabase(String query) {
        List<LaptopEntity> laptopEn = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                LaptopEntity laptopEntity = new LaptopEntity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getFloat(13),
                        rs.getInt(14),
                        rs.getTimestamp(15),
                        rs.getTimestamp(16)
                );
                laptopEn.add(laptopEntity);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopEn;
    }


}


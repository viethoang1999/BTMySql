package MysqlLapTop;

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
        String query = "";
        if (fromprices == null && toprice != null) {
            query = "select*from laptop where price<=" + toprice;
        } else if (fromprices != null && toprice == null) {
            query = "select*from laptop where price>=" + fromprices;
        } else if (fromprices != null && toprice != null) {
            query = "select*from laptop where price between " + fromprices + "and" + toprice;
        }

        List<LaptopEntity> laptopEntities = queryDatabase(query);
        return laptopEntities;
    }

    public List<LaptopEntity> Searchmakerandssd(String maker, String ssd) {

        String query = "SELECT * FROM laptop where maker='" + maker + "' and ssd='" + ssd + "'";
        List<LaptopEntity> laptopEntities = queryDatabase(query);

        return laptopEntities;
    }

    public List<LaptopEntity> SearchLapTop( Float fromPrice, Float toPrice, String maker, String screensize, String cpu, String ram, String Type
            , String card, String order) {
        String query = "select * from laptop where true";
        if (fromPrice != null) {
           query=query+"and price>="+fromPrice;
        }
        if (toPrice!=null){
            query=query+"and price<="+toPrice;
        }
        if (maker != null) {
            query=query+"and maker='"+maker+"'";
        }
        if (screensize!=null){
            query=query+"and screensize='"+screensize+"'";
        }
        if (cpu!= null){
            query=query+"and cpu like '%"+cpu+"%'";
        }
        if (ram!=null){
            query=query+"and ram='"+ram+"'";
        }
        if (Type!=null){
            query=query+"and type='"+Type+"'";
        }
        if (card!=null){
            query=query+"and card='"+card+"'";
        }
        if (order!=null){
            if (order.equals("DESC")){
                query=query+"ORDER BY price DESC";
            }else {
                query=query+"ORDER BY price ASC";
            }
        }

        List<LaptopEntity> laptopEntities = queryDatabase(query);
        return laptopEntities;
    }
    public List<LaptopEntity> SearchSold(int sold){
        String query="SELECT * FROM laptop order by sold desc"+sold;
        List<LaptopEntity> laptopEntities=queryDatabase(query);
        return  laptopEntities;
    }

    private List<LaptopEntity> queryDatabase(String query) {
        List<LaptopEntity> laptopEntities = new ArrayList<>();
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
                laptopEntities.add(laptopEntity);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptopEntities;
    }


}


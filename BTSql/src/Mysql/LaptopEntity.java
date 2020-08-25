package Mysql;

import java.sql.Timestamp;

public class LaptopEntity {
    private int id, sold,price;
    private String name, url, maker, type, ram, cpu, ssd, hdd, card, screen_resolution;
    private Float  screen_size;
    private Timestamp created_timestamp, last_update_timestamp;

    public LaptopEntity() {

    }

    public LaptopEntity(int id, String name, String url, String maker, String type,
                        String ram, String cpu, String ssd, String hdd, int price,
                        String card,String screen_resolution,Float screen_size,
                        int sold,Timestamp created_timestamp,Timestamp last_update_timestamp){
        this.id=id;
        this.name=name;
        this.url=url;
        this.maker=maker;
        this.type=type;
        this.ram=ram;
        this.cpu=cpu;
        this.ssd=ssd;
        this.hdd=hdd;
        this.card=card;
        this.price=price;
        this.screen_resolution=screen_resolution;
        this.screen_size=screen_size;
        this.sold=sold;
        this.created_timestamp=created_timestamp;
        this.last_update_timestamp=last_update_timestamp;

    }
       public int getid(){
        return id;
       }
       public void setId(int id){
        this.id=id;
       }
       public String getName(){
        return name;
       }
       public void setName(String name){
        this.name=name;
       }
       public String getUrl(){
        return url;
       }
       public void setUrl(String url){
        this.url=url;
       }
       public  String getMaker(){
        return maker;
       }
       public void setMaker(String maker){
        this.maker=maker;
       }
       public String getType(){
        return type;
       }
       public void setType(String type){
        this.type=type;
       }
       public String getRam(){
        return ram;
       }
       public void setRam(String ram){
        this.ram=ram;
       }
       public String getCpu(){
        return cpu;
       }
       public void setCpu(String cpu){
        this.cpu=cpu;
       }
       public String getSsd(){
        return ssd;
       }
       public void setSsd(String ssd){
        this.ssd=ssd;
       }
       public String getHdd(){
        return hdd;
       }
       public void setHdd(String hdd){
        this.hdd=hdd;
       }
       public String getCard(){
        return card;
       }
       public void setCard(String card){
        this.card=card;
       }
       public int getprice(){
        return price;
       }
       public void setPrice(int price){
        this.price=price;
       }
       public String getScreen_resolution(){
        return screen_resolution;
       }
       public void setScreen_resolution(String screen_resolution){
        this.screen_resolution=screen_resolution;
       }
       public Float getScreen_size(){
        return  screen_size;
       }
       public void setScreen_size(Float screen_size){
        this.screen_size=screen_size;
       }
       public int getSold(){
        return sold;
       }
       public void setSold(int sold){
        this.sold=sold;
       }
       public Timestamp getCreated_timestamp(){
        return created_timestamp;
       }
       public void setCreated_timestamp(Timestamp created_timestamp){
        this.created_timestamp=created_timestamp;
       }
       public Timestamp getLast_update_timestamp(){
        return last_update_timestamp;
       }
       public void setLast_update_timestamp(Timestamp last_update_timestamp){
        this.last_update_timestamp=last_update_timestamp;
       }

    @Override
    public String toString() {
        return "LaptopEntity{" +
                "id=" + id +
                ", sold=" + sold +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", maker='" + maker + '\'' +
                ", type='" + type + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ssd='" + ssd + '\'' +
                ", hdd='" + hdd + '\'' +
                ", card='" + card + '\'' +
                ", screen_resolution='" + screen_resolution + '\'' +
                ", price=" + price +
                ", screen_size=" + screen_size +
                ", created_timestamp=" + created_timestamp +
                ", last_update_timestamp=" + last_update_timestamp +
                '}';
    }
}


package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String nick;
   private String country;
   private String maps;
   private String rounds;
   private String kd;
   private String rating;
   private String total_kills;
   private String headshot;
   private String impact;
     

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public String getMaps() {
        return maps;
    }


    public void setMaps(String maps) {
        this.maps = maps;
    }


    public String getRounds() {
        return rounds;
    }

    public void setRounds(String rounds) {
        this.rounds = rounds;
    }


    public String getKd() {
        return kd;
    }


    public void setKd(String kd) {
        this.kd = kd;
    }
    
    public String getRating() {
        return rating;
    }


    public void setRating(String rating) {
        this.rating = rating;
    }
 
    public String getTotalkills() {
        return total_kills;
    }

    public void setTotalkills(String total_kills) {
        this.total_kills = total_kills;
    }
    
    public String getHeadshot(){
        return headshot;
    }
    
    public void setHeadshot(String headshot){
        this.headshot = headshot;
    }

     public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }
    
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getCountry().
              compareTo(outroDado.getCountry());
    }
    

     @Override
    public String toString(){
        return getNick()+ " : " + getCountry() ;
    }// fim toString
    
}

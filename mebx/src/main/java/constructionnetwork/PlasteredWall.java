/**Do not edit: generated from uml.*/
package constructionnetwork;
import constructionnetwork.BrickWall;
import constructionnetwork.House;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity(name="PlasteredWall")
@Table(name="plastered_wall")
@Entity(name="PlasteredWall")
@Table(name="plastered_wall")
public class PlasteredWall{
  @Id
  @GeneratedValue
  String id;
  @Id
  @GeneratedValue
  String id;
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="house_id",referencedColumnName="id")}
  )
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="house_id",referencedColumnName="id")}
  )
  private House house = null;
  @OneToOne(mappedBy="plasteredWall",cascade=CascadeType.ALL)
  @OneToOne(mappedBy="plasteredWall",cascade=CascadeType.ALL)
  private BrickWall theWall = null;
  public PlasteredWall(){
  }
  public PlasteredWall(House owner){
  this.setHouse(owner);
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public String getId(){
    return this.id;
  }
  public void setId(String value){
    this.id=value;
  }
  public House getHouse(){
    House result = this.house;
    return result;
  }
  public BrickWall getTheWall(){
    BrickWall result = this.theWall;
    return result;
  }
  public void setHouse(House newHouse){
    if(!(newHouse == null)){
      newHouse.getWalls().add(this);
    } else {
      if(!(this.house == null)){
        this.house.getWalls().remove(this);
      }
    }
    this.house=newHouse;
  }
  public void setTheWall(BrickWall newTheWall){
    BrickWall oldValue = this.theWall;
    if(( newTheWall == null || !(newTheWall.equals(oldValue)) )){
      this.theWall=newTheWall;
      if(!(oldValue == null)){
        oldValue.setPlasteredWall(null);
      }
      if(!(newTheWall == null)){
        if(!(this.equals(newTheWall.getPlasteredWall()))){
          newTheWall.setPlasteredWall(this);
        }
      }
    }
  }
}

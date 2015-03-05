/**Do not edit: generated from uml.*/
package constructionnetwork;
import constructionnetwork.PlasteredWall;
import mebx_constructionmeasures.StraightnessOfWall;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
@Entity(name="BrickWall")
@Table(name="brick_wall")
@Entity(name="BrickWall")
@Table(name="brick_wall")
public class BrickWall{
  @Id
  @GeneratedValue
  String id;
  @Id
  @GeneratedValue
  String id;
  private Double NumberOfWalls = null;
  @Enumerated()
  @Enumerated()
  private StraightnessOfWall StraightnessOfWall = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="plastered_wall_id",referencedColumnName="id")}
  )
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="plastered_wall_id",referencedColumnName="id")}
  )
  private PlasteredWall plasteredWall = null;
  public BrickWall(){
  }
  public BrickWall(PlasteredWall owner){
  this.setPlasteredWall(owner);
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
  public Double getNumberOfWalls(){
    Double result = this.NumberOfWalls;
    return result;
  }
  public PlasteredWall getPlasteredWall(){
    PlasteredWall result = this.plasteredWall;
    return result;
  }
  public StraightnessOfWall getStraightnessOfWall(){
    StraightnessOfWall result = this.StraightnessOfWall;
    return result;
  }
  public void setNumberOfWalls(Double newNumberOfWalls){
    this.NumberOfWalls=newNumberOfWalls;
  }
  public void setPlasteredWall(PlasteredWall newPlasteredWall){
    PlasteredWall oldValue = this.plasteredWall;
    if(( newPlasteredWall == null || !(newPlasteredWall.equals(oldValue)) )){
      this.plasteredWall=newPlasteredWall;
      if(!(oldValue == null)){
        oldValue.setTheWall(null);
      }
      if(!(newPlasteredWall == null)){
        if(!(this.equals(newPlasteredWall.getTheWall()))){
          newPlasteredWall.setTheWall(this);
        }
      }
    }
  }
  public void setStraightnessOfWall(StraightnessOfWall newStraightnessOfWall){
    this.StraightnessOfWall=newStraightnessOfWall;
  }
}

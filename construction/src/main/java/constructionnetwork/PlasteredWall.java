/**Do not edit: generated from uml.*/
package constructionnetwork;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
  public PlasteredWall(){
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
}

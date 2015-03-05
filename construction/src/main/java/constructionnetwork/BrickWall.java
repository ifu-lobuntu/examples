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
  public BrickWall(){
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

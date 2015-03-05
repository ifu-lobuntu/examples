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
@Entity(name="PlasterMixx")
@Table(name="plaster_mixx")
@Entity(name="PlasterMixx")
@Table(name="plaster_mixx")
public class PlasterMixx{
  @Id
  @GeneratedValue
  String id;
  @Id
  @GeneratedValue
  String id;
  public PlasterMixx(){
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

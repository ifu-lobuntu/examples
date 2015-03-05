/**Do not edit: generated from uml.*/
package constructionnetwork;
import java.util.Set;
import java.util.HashSet;
import constructionnetwork.PlasteredWall;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity(name="House")
@Table(name="house")
@Entity(name="House")
@Table(name="house")
public class House{
  @Id
  @GeneratedValue
  String id;
  @Id
  @GeneratedValue
  String id;
  @OneToMany(mappedBy="house",cascade=CascadeType.ALL)
  @OneToMany(mappedBy="house",cascade=CascadeType.ALL)
  private Set<PlasteredWall> walls = new HashSet<PlasteredWall>();
  public House(){
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
  public Set<PlasteredWall> getWalls(){
    Set<PlasteredWall> result = this.walls;
    return result;
  }
  public void setWalls(Set<PlasteredWall> newWalls){
    this.walls=newWalls;
  }
}

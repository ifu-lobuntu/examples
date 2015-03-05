/**Do not edit: generated from uml.*/
package construction_constructionmeasures;
public enum BuildJobSize{
  SMALL(null, false, null, false),
  AVERAGE(null, false, null, true),
  BIG(null, true, null, true);
  private BuildJobSize(Double maximumEndpoint, Boolean maximumOpen, Double minimumEndpoint, Boolean minimumOpen){
    this.setMaximumEndpoint(maximumEndpoint);
    this.setMaximumOpen(maximumOpen);
    this.setMinimumEndpoint(minimumEndpoint);
    this.setMinimumOpen(minimumOpen);
  }
  private Double maximumEndpoint = null;
  private Boolean maximumOpen = false;
  private Double minimumEndpoint = null;
  private Boolean minimumOpen = false;
  public Double getMaximumEndpoint(){
    Double result = this.maximumEndpoint;
    return result;
  }
  public Boolean getMaximumOpen(){
    Boolean result = this.maximumOpen;
    return result;
  }
  public Double getMinimumEndpoint(){
    Double result = this.minimumEndpoint;
    return result;
  }
  public Boolean getMinimumOpen(){
    Boolean result = this.minimumOpen;
    return result;
  }
  private void setMaximumEndpoint(Double newMaximumEndpoint){
    this.maximumEndpoint=newMaximumEndpoint;
  }
  private void setMaximumOpen(Boolean newMaximumOpen){
    this.maximumOpen=newMaximumOpen;
  }
  private void setMinimumEndpoint(Double newMinimumEndpoint){
    this.minimumEndpoint=newMinimumEndpoint;
  }
  private void setMinimumOpen(Boolean newMinimumOpen){
    this.minimumOpen=newMinimumOpen;
  }
}

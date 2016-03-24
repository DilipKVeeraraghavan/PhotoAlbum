
package photoalbum;

public class Photo {
    private String title;
    private String annotation;
    private String location;
    
    public String getAnnotation(){
        return annotation;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getLocation(){
        return location;
    }
    
    
    public void setLocation(String x){
        location =x;
    }
    
    public void setTitle(String x){
        title =x;
    }
    
    public void setAnnotation(String x){
        annotation =x;
    }
}


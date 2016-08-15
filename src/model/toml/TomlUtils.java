package model.toml;

import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;

import java.util.Map;

public abstract class TomlUtils {

    public static final String TOML_IDENTIFIER = "+++";

    public static Map<String, Object> readToml(String toml) {
        return new Toml().read(toml).toMap();
    }

    public static String toToml(Map<String, Object> tomlMap) {
        TomlWriter tomlWriter = new TomlWriter();
        return tomlWriter.write(tomlMap);
    }

/*
  private String toml;

  public TomlUtils(String toml){
    this.toml = toml;
  }
  
  
  public void rw(){
    tomlMap = new Toml().read(toml).toMap();
    //TomlWriter tomlWriter = new TomlWriter();
    
    for(Map.Entry<String, Object> entry : tomlMap.entrySet()) {
        System.out.println( "key : " + entry.getKey() + " Class : " + 
        entry.getValue().getClass().getName()
        );
    }
  }

  public void readToml(String toml){
    this.toml = toml;
    readToml();
  }

  public boolean readToml(){
    tomlMap = new Toml().read(toml).toMap();
    //cleanToml();
    return true;
  }
  
  public Map<String, Object> cleanToml(){
    
    for(Map.Entry<String, Object> entry : tomlMap.entrySet()) {
        String key = entry.getKey();
        Object val = entry.getValue();
        
        if(val instanceof Map){
            val = 
        }
        
        String val = convertToPlainString(key, entry.getValue());
        tomlMapStr.put(key,val);
      }
  
  }*/

  /*
  private boolean buildTomlMapStr(){
    tomlMapStr = new HashMap<String, String>();

    if(tomlMap != null){
      for(Map.Entry<String, Object> entry : tomlMap.entrySet()) {
        String key = entry.getKey();
        String val = convertToPlainString(key, entry.getValue());
        tomlMapStr.put(key,val);
      }
      return true;
    }
    else return false;
  }

  private static String convertToPlainString(String key,Object ob){

    try{
      if(ob instanceof String){
        return (String)ob;
      }
      else if(ob instanceof List){

        List<?> list = (List<?>)ob;
        StringBuilder builder = new StringBuilder();

        for (Object obStr : list){
          if(obStr instanceof String){
            String str = (String) obStr;
            builder.append(str + ", ");
          }
          else{
            throw new Exception(
            "Array with non String content for key"
            + key + "\n Datatype :"
            + obStr.getClass().getName() );
          }
        }

        String plainVals = builder.toString();
        plainVals = plainVals.substring( 0, plainVals.length()-2 );

        return plainVals;
      }
      else {
        throw new Exception( "Toml contains invalid contents for key "
        + key + "\n Datatype :" + ob.getClass().getName() );
      }
    } catch(Exception e){
      System.out.println(e.getMessage());
    }
    return null;
  }


  public Map<String, String> getTomlMapStr(){
    return this.tomlMapStr;
  }

  public String getTomlPlainString(){

    StringBuilder builder = new StringBuilder();
    for(Map.Entry<String, String> entry : tomlMapStr.entrySet()){
      builder.append( entry.getKey() + " : " + entry.getValue() + "\n");
    }

    return ( builder.toString() );
  }*/
}
import java.util.*;

class ValidateIP{
  public boolean isValid(String s){
    int n = s.length();
    String[] parts = s.split("\\.");
    if(n<4){
      return false;
    }
    for(String x : parts){
      if(x.length()==0){
        return false;
      }
      if(s.length>1 && s.charAt(0)==0){
        return false;
      }
      try{
        int num = Integer.parseInt(x);
        if(num<0 || num>255){
          return false;
        }
      }catch(NumberFormatException e){
        return false;
      }
    }
    return true;
  }
}



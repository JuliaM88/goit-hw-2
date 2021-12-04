public class NameEncoderDecoder{
 public String encode(String name){
   String newName = name.replace("e" , "1")
                         .replace("u" , "2")
                         .replace("i" , "3")
                         .replace("o" , "4")
                         .replace("a" , "5");
   String newName1 = "NOTFORYOU" + newName + "YESNOTFORYOU";
   return  newName1 ;
   
 }
  
  public String decode(String newName1){
       
 
    String firstVersion1 = newName1.replace("1", "e").replace("2", "u").replace("3", "i").replace("4", "o").replace("5", "a");
    
   
    return firstVersion1.replace("YESNOTFORYOU", "").replace("NOTFORYOU", "");
  }
  
}

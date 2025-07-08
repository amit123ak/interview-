 import java.util.*;
class Main {
    public static void main(String[] args) {
      String s1="add";
      String s2="akk";
      HashMap<Character,Character>map=new HashMap<>();
      // my  job is to calcualte Iso morphic STring 
      List<Character> list =new ArrayList<>();
       if(s1.length()!=s2.length())
       {
         System.out.println("Not iSo Morphoic STring ");

         return;
       }
       
       for(int i=0;i<s1.length();i++)
       {
           if(map.containsKey(s1.charAt(i)))
           {
               if(map.get(s1.charAt(i))!=s2.charAt(i))
               {
                   System.out.println("Is not IsoMorphic");
                   return;
               }
           }else {
           if(list.contains(s2.charAt(i)))
            {
              System.out.println("Is not IsoMorphic");
             return;
            }
          
          map.put(s1.charAt(i),s2.charAt(i));
          list.add(s2.charAt(i));
    }
       }
    System.out.println("iso morphic");
       
}
}

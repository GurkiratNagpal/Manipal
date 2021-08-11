package Maven_project_Demo.SonarQube;

import java.util.*;
public class ItemDb {
private static final ArrayList ITEMLIST=new ArrayList();
private static final ItemDb ITEMDATABASE =new ItemDb();
public static ArrayList getItemDb()
{
 return ITEMLIST;
}
   private ItemDb()
   {
	   
   }
   public static ItemDb getDefaultInstance()
   {
	   return ITEMDATABASE;
   }
}

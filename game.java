import java.util.*;
class game{
   public static void main(String[]args){
    Scanner sc =new Scanner(System.in); 
    System.out.println("no.of chance u want o play??");
    int n=sc.nextInt();
    
    int no1=0;
    int no2=0;
   
    for(int i=1;i<=n;i++){
    System.out.println("user1");
    String choose1=sc.next();
    System.out.println("user2");
    String choose2=sc.next();
    System.out.println(no1);
    if(choose1.equals("strong")&&choose2.equals("paper")){
      no2 = no2+1;
    }
    else if(choose1.equals("strong")&&choose2.equals("scissors")){
        no1= no1+1;
        System.out.println(no1);
      }
    else if(choose1.equals("paper")&&choose2.equals("scissors")){
        no2 = no2+1;
      }
    else if(choose1.equals("paper")&&choose2.equals("strong")){
        no1= no1+1;
      }
    else if(choose1.equals("scissors")&&choose2.equals("strong")){
        no2 = no2+1;
      }
    else if(choose1.equals("scissors")&&choose2.equals("paper")){
        no1= no1+1;
      }
   }
   
   if(no1>no2){
    System.out.println("user1 won");
   }
   if(no2>no1){ 
   System.out.println("user2 won");
   }
  else{
    System.out.println("game draw");
   }
}
}
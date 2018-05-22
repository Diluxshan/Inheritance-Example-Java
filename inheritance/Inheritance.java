

package inheritance;

public class Inheritance {

    
    public static void main(String[] args) {
        
        student s=new student();
      // System.out.println(s.name);
       System.out.println(s.nam);
       System.out.println(s.na);
        //s.nam();
       // s.na;
        
        
    }
    
}


class principal{
    
    void print(){
    String name ="principal"; 
   System.out.println(name);
}
}

class teacher extends principal{
    String nam="teacher";
    int x=10;
}

class student extends teacher{
     String na="student";
     int x=10;
}

class dog {
void print(){

}
}
interface sturoll
 {
  void rollno();
 }
interface stuname extends sturoll
 {
  void name();
 }
interface stubranch extends sturoll
 {
   void branch();
 }
class STUDENT implements stuname
{
   public void rollno()
     {
       System.out.println("16UG08070");
     }
public void name()
 {
   System.out.println("HITESH KOTTE");
 }
public void branch()
 {
   System.out.println("CSE");
 }
public static void main(String[] args)
 { 
  STUDENT S =new STUDENT();
  System.out.println("Roll-no:");
  S.rollno();
  System.out.println("Name:");
  S.name();
  System.out.println("Branch:");
  S.branch();
 }
}  
 

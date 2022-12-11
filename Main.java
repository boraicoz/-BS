public class Main {
     public static void main(String[] args) {
      Teacher t1=new Teacher("Walter White","11122233","KIM");
      Teacher t2=new Teacher("Einstein","222333444","FIZ");
      Teacher t3=new Teacher("Pisagor","333444555","GEO");

      Course fizik=new Course("101","Fizik","FIZ",30);
      Course kimya=new Course("102","Kimya","KIM",40);
      Course geometri=new Course("103","Geometri","GEO",50);

      fizik.addTeacher(t2);
      kimya.addTeacher(t1);
      geometri.addTeacher(t3);

      Student s1=new Student("Bora","212802031",4,fizik,kimya,geometri);
      s1.addExamNote(80,90,70);
      s1.addVerbalNote(40,30,80);
      s1.checkPass();
      s1.isPass();
      }

}

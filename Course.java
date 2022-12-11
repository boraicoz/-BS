public class Course {
    String code,name,prefix;
    double examNote,verbalNote;
    Teacher teacher;
    double percentage;
    Course(String code,String name,String prefix,int percentage)
    {
     this.percentage=percentage*0.01;
     this.code=code;
     this.name=name;
     this.prefix=prefix;
     this.examNote=0;
     this.verbalNote=0;

    }
    void addTeacher(Teacher teacher){
     if(teacher.branch.equals(prefix)) {
         this.teacher = teacher;
         printTeacher();
         System.out.println("Ogretmen eklendi." +
                 "\n--------------------------------");
     }else
         System.out.println("Branslar farkli!");
    }
   void printTeacher(){
       System.out.println(" İsmi:"+this.teacher.name+"\n Numarasi:"+this.teacher.mpno+"\n Branş:"+this.teacher.branch);
    }


}

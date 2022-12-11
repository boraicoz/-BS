public class Student {
    String name,stuNo;
    int classes;
    double avarage;
    boolean isPass;
    Course c1,c2,c3;
    Student(String name,String stuNo,int classes,Course c1,Course c2,Course c3)
    {
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.isPass=false;
    }
    void addExamNote(int examNote,int examNote2,int examNote3){
        this.c1.examNote=examNote;
     this.c2.examNote=examNote2;
     this.c3.examNote=examNote3;
    }
    void addVerbalNote(int verbalNote,int verbalNote2,int verbalNote3){
     this.c1.verbalNote=verbalNote;
     this.c2.verbalNote=verbalNote2;
     this.c3.verbalNote=verbalNote3;
    }
   public void isPass(){
         this.isPass=checkPass();
             printNote();
             System.out.println("Ortalama:"+this.avarage);
             if(this.isPass)
                 System.out.println("Ortalamayi Gectiniz:");
             else
                 System.out.println("Sinifta Kaldiniz:");


   }
    void calcAverage(){
        this.avarage=((this.c1.examNote*(1-this.c1.percentage)+this.c1.verbalNote*this.c1.percentage)+(this.c2.examNote*(1-this.c2.percentage)+this.c2.verbalNote*this.c2.percentage)+(this.c3.examNote*(1-this.c3.percentage)+this.c3.verbalNote*this.c3.percentage))/3;
    }

    public boolean checkPass(){
        calcAverage();
        return this.avarage>55;
    }
   void printNote(){
       System.out.println("-------------------------------------------");
       System.out.print("Ogrenci:"+this.name+"\n"
                        +"Sinifi:"+this.classes+"\n"
                        +"Numarasi:"+this.stuNo+"\n"
                        +this.c1.name+"Notu:"+(this.c1.examNote*(1-this.c1.percentage)+this.c1.verbalNote*this.c1.percentage)+"\n"
                        +this.c2.name+"Notu:"+(this.c2.examNote*(1-this.c2.percentage)+this.c2.verbalNote*this.c2.percentage)+"\n"
                        +this.c3.name+"Notu:"+(this.c3.examNote*(1-this.c3.percentage)+this.c3.verbalNote*this.c3.percentage)+"\n");



   }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author aashgar
 */
public class Course {
    private Title aTitle;
    private Content aContent;
    private Degree aDegree;
    private Teacher aTeacher;
    private static Course aCourse;
    private Course(){}
    public static Course getCourse(){
        if(aCourse == null)
            aCourse = new Course();
        return aCourse;
    }
    public void setDegree(Degree aDegree){
        this.aDegree = aDegree;
    }
    public void view(String aTitle, String aContent,String aTeacher){
        this.aTitle = this.aDegree.getTitle();
        this.aContent= this.aDegree.getContent();
        this.aTeacher= this.aDegree.getTeacher();
        System.out.println("==================");
        System.out.println("Processing course info: ");
        this.aTitle.view(aTitle);
        this.aContent.view(aContent);
        this.aTeacher.view(aTeacher);

    }
    
}

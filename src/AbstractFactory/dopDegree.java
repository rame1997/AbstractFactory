/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author zero1
 */
public class dopDegree  implements Degree{

    @Override
    public Title getTitle() {
        return new dopTitle();
    }

    @Override
    public Content getContent() {
        return new dopContent();
    }

    @Override
    public Teacher getTeacher() {
 return new dopTeacher();    }
    
}

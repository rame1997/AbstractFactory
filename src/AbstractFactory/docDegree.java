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
public class docDegree  implements Degree{

    @Override
    public Title getTitle() {
        return new docTitle();
    }

    @Override
    public Content getContent() {
        return new docContent();
    }

    @Override
    public Teacher getTeacher() {
 return new docTeacher();
    }
    
}
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
public class bscTeacher implements Teacher{

    @Override
    public void view(String teacher) {
          System.out.println(" Teacher course : ".toUpperCase()
                + teacher.toUpperCase());
    }
    
}


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
public class dopContent implements Content{

    @Override
    public void view(String content) {
        System.out.println("doploma degree course with Content: ".toUpperCase()
                + content.toUpperCase());
    }
}

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
public class docTitle implements Title{

    @Override
    public void view(String title) {
        System.out.println("doctor degree course with "
                + "Title: "+ title);
    }
    
}

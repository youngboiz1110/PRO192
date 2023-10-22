/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author My Computer
 */
public class Colony extends Organization{
    protected String place ;

    public Colony() {
        super();
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    @Override 
    public void communicateByTool(){
        System.out.println("The organization's size is "+size);
    }
    public void grow(){
        System.out.println("An annual cycle of growth that begins in spring");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "The colony size is  " + size+",the colony's place us " + place ;
    }
    
}

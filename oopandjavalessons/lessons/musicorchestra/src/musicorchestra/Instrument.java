/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicorchestra;

/**
 *
 * @author Adeptus Mechanicus
 */
abstract class Instrument {
 private int i;
 public abstract void Play(Note n);
public String what (){ return "Instrument";}
 public abstract void Adjust();
  
}

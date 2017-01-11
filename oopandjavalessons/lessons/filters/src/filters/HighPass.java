/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

/**
 *
 * @author Adeptus Mechanicus
 */
public class HighPass extends filter {
    double cutoff;
    public HighPass (double cutoff)
    {this.cutoff=cutoff;}
   public Waveform Process(Waveform input) { return input;}  
 }

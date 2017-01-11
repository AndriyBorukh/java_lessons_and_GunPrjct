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
public class bandPass extends filter {
    double lowcutoff, highcutoff;
    public bandPass (double lowcut, double highcut)
    {this.lowcutoff=lowcut;
    this.highcutoff=highcut;
    }
    public Waveform Process(Waveform input) { return input;}  
 }

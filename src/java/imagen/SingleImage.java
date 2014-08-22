package imagen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c1026268
 */
public class SingleImage {
    private static SingleImage instanciaImagen=new SingleImage();    
    InputStream fin;
    int bytesRead=0;
    static byte[] bytes = new byte[7000];
    private SingleImage(){}
    public static SingleImage getinstanciaImagen(){return instanciaImagen;}
    public void mostrarImagen(ServletOutputStream o, String r) throws FileNotFoundException, IOException{        
        fin=new FileInputStream(r);
        while((bytesRead=fin.read())!=-1){
                o.write(bytes, 0, bytesRead);
            }
        fin.close();            
        o.close();
    }
        
}

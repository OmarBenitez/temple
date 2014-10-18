
package controllers;

import java.io.File;
import models.Archivo;
import play.modules.morphia.Blob;
import play.mvc.Controller;




/**
 *
 * @author omar
 */
public class CargarArchivo extends Controller{

    public static void index(){
        render();
    }
    
    public static void getHorarioByFile(File file){
        Archivo foo = new Archivo(new Blob(file), file.getName());
        foo.save();
        
        /* Todo el proceso de la carga de los datos va aqui */
        
        renderJSON("");
    }
    
}

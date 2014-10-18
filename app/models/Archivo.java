
package models;

import com.google.code.morphia.annotations.Entity;
import java.util.Date;
import play.modules.morphia.Blob;
import play.modules.morphia.Model;

/**
 *
 * @author omar
 */
@Entity
public class Archivo extends Model{
    
    public Date fecha;
    public Blob archivo;
    public String nombre;
    
    public Archivo(Blob archivo, String nombre) {
        this.fecha = new Date();
        this.archivo = archivo;
        this.nombre = nombre;
    }
    
}

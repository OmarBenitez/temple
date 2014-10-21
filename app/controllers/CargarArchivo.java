package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import models.Archivo;
import org.json.JSONException;
import org.json.JSONObject;
import play.modules.morphia.Blob;
import play.mvc.Controller;

/**
 *
 * @author omar
 */
public class CargarArchivo extends Controller {

    public static void index() {
        render();
    }

    public static void getHorarioByFile(File file) throws FileNotFoundException, IOException, BiffException, JSONException, InterruptedException {
        Archivo foo = new Archivo(new Blob(file), file.getName());
        foo.save();

        //Thread.sleep(3000);
        
        /* TODO el proceso de la carga de los datos va aqui */
        FileInputStream inp = new FileInputStream(file);

        Workbook workbook = Workbook.getWorkbook(inp);
        Sheet sheet = workbook.getSheet(0);
        JSONObject json = new JSONObject();

        for (int i = 0; i < sheet.getColumns(); i++) {

            List<String> col = new ArrayList<String>();

            for (int j = 1; j < sheet.getRows(); j++) {

                col.add(sheet.getCell(i, j).getContents());

            }

            json.put(sheet.getCell(i, 0).getContents(), col);

        }

        renderJSON(json);

    }

}

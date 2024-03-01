/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_linsyposso;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author 29164
 */
public class AdminProduct {
    private ArrayList <Producto> listproduct = new ArrayList();
    private File archivo = null;

    public AdminProduct(String path) {
        archivo = new File (path);
    }

    public ArrayList<Producto> getListproduct() {
        return listproduct;
    }

    public void setListproduct(ArrayList<Producto> listproduct) {
        this.listproduct = listproduct;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listproduct=" + listproduct;
    }
    
    public void setProducto(Producto p){
        this.listproduct.add(p);
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_linsyposso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class AdminProduct {

    private ArrayList<Producto> listproduct = new ArrayList();
    private File archivo = null;

    public AdminProduct(String path) {
        archivo = new File(path);
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

    public void setProducto(Producto p) {
        this.listproduct.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : listproduct) {
                bw.write(t.getId() + ",");
                bw.write(t.getNombre() + ",");
                bw.write(t.getCategory() + ",");
                bw.write(t.getPrice() + ",");
                bw.write(t.getAisle() + ",");
                bw.write(t.getBin() + ",");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner leer = null;
        listproduct = new ArrayList();
        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    listproduct.add(new Producto(leer.nextInt(), leer.next(),
                            leer.nextInt(), leer.nextDouble(),
                            leer.nextInt(), leer.nextInt()));
                }
            } catch (Exception ex) {
            }
            leer.close();
        }
    }

}

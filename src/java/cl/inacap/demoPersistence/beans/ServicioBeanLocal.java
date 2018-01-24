/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.demoPersistence.beans;

import cl.inacap.demoPersistence.entities.Categoria;
import cl.inacap.demoPersistence.entities.Perfil;
import cl.inacap.demoPersistence.entities.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alumnossur
 */
@Local
public interface ServicioBeanLocal {

    List<Perfil> getPerfiles();

    List<Producto> getProductos();

    List<Categoria> getcategorias();

    void save(Object obj);

    Producto buscarProducto(int id);

    Perfil buscarPerfil(int id);

    Categoria buscarCategoria(int id);

}

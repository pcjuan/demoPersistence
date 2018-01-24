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
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnossur
 */
@Stateless
public class ServicioBean implements ServicioBeanLocal {

    @PersistenceContext(unitName = "persistence")
    private EntityManager em;

    @Override
    public List<Perfil> getPerfiles() {
        return this.em.createQuery("select p from Perfil p").getResultList();
    }

    @Override
    public List<Producto> getProductos() {
        return this.em.createQuery("select p from Producto p").getResultList();
    }

    @Override
    public List<Categoria> getcategorias() {
        return this.em.createQuery("select c from Categoria c").getResultList();
    }

    @Override
    public void save(Object obj) {
        this.em.persist(obj);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Producto buscarProducto(int id) {
        return this.em.find(Producto.class, id);
    }

    @Override
    public Perfil buscarPerfil(int id) {
        return this.em.find(Perfil.class, id);
    }

    @Override
    public Categoria buscarCategoria(int id) {
        return this.em.find(Categoria.class, id);
    }
}

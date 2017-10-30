/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.guia06.PostPaso;

/**
 *
 * @author Castro
 */
@Stateless
public class PostPasoFacade extends AbstractFacade<PostPaso> implements PostPasoFacadeLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostPasoFacade() {
        super(PostPaso.class);
    }
    
}
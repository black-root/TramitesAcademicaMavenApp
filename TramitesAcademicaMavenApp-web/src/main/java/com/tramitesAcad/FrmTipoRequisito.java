/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tramitesAcad;

import com.tramitesAcad.datos.TipoRequisito;
import com.tramitesAcad.negocios.TipoRequisitoFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author daniel
 */
@Named
@ViewScoped
public class FrmTipoRequisito implements Serializable{

    public FrmTipoRequisito() {
        
    } 
    
    @EJB
    private TipoRequisitoFacadeLocal TipoRequisito;
    
    
    
    
    public List<TipoRequisito> getFindAll() {
        return TipoRequisito.findAll();
    }
}

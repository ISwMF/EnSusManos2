/*@author AngélicaCuesta & FabianMiranda*/
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.ReporteR;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional

public class ReporteRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<ReporteR> getAllCiudadanos() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(ReporteR.class);
        return criteria.list();
    }
    
    public long crearCiudadano(ReporteR reporte){
        getSessionFactory().getCurrentSession().save(reporte);
        return reporte.getReporteId();
    }

    public long crearReporteR(ReporteR reporte) {
        getSessionFactory().getCurrentSession().save(reporte);
        return reporte.getReporteId();
    }

    
        
}

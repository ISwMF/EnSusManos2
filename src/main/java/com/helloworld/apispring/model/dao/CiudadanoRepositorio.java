package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Ciudadano;
import com.helloworld.apispring.model.entity.ReporteR;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional

public class CiudadanoRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Ciudadano> getAllCiudadanos() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Ciudadano.class);
        return criteria.list();
    }

    public Ciudadano getCiudadanoByID(int id) {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Ciudadano.class);
        criteria.add(Restrictions.eq("id", id));
        return (Ciudadano) criteria.uniqueResult();
    }

    public List<Ciudadano> getCiudadanoOrdenado() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Ciudadano.class);
        criteria.addOrder(Order.desc("puntos_ciudadano"));
        return criteria.list();
    }

    public long crearCiudadano(Ciudadano ciudadano) {
        getSessionFactory().getCurrentSession().save(ciudadano);
        return ciudadano.getId();
    }
    
    public Ciudadano obtenerCiudadanoPorID(int id)   {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Ciudadano.class);
        criteria.add(Restrictions.eq("id", id) );
        return (Ciudadano) criteria.uniqueResult();
    }

    public long crearReporteR(ReporteR reporte) {
        getSessionFactory().getCurrentSession().save(reporte);
        return reporte.getReporteId();
    }
    
    
    
    

}

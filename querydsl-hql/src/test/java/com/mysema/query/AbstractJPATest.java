/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query;

import javax.persistence.EntityManager;

import com.mysema.query.hql.HQLQuery;
import com.mysema.query.hql.jpa.JPAQLQueryImpl;

/**
 * @author tiwe
 *
 */
public abstract class AbstractJPATest extends AbstractStandardTest{
    
    private EntityManager entityManager;
    
    protected HQLQuery query(){
        return new JPAQLQueryImpl(entityManager);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    protected void save(Object entity) {
        entityManager.persist(entity);
    }

}

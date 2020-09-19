package com.assignment.library.repository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository {
	@PersistenceContext
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void persist(Object entity) {
		getEntityManager().persist(entity);
	}

	@Transactional
	public void remove(Object entity) {
		getEntityManager().remove(entity);
	}

	@Transactional
	public <T> T merge(T entity) {
		return getEntityManager().merge(entity);
	}
}
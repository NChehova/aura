package com.aura.chhvclb.model;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import static org.junit.Assert.assertNotNull;

public class EclipseLinkModelCreateTest {

    private static final String PERSISTENCE_UNIT_NAME = "default";
    private EntityManagerFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.close();
    }

    @Test
    public void checkColor() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select color from Size color");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkBasket() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select basket from Basket basket");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkCategory() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select cat from Category cat");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkClient() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select client from Client client");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkOrder() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select order from Order order");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkOrderStatus() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select status from order_status status");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkPhoto() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select photo from Photo photo");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkPrice() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select price from Price price");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkProduct() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select product from Product product");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkRole() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select role from Role role");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkSize() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select s from Size s");

        assertNotNull(q.getResultList());

        em.close();
    }

    @Test
    public void checkUser() {

        // Now lets check the database and see if the created entries are there
        // Create a fresh, new EntityManager
        EntityManager em = factory.createEntityManager();

        // Perform a simple query for all the Message entities
        Query q = em.createQuery("select user from User user");

        assertNotNull(q.getResultList());

        em.close();
    }


//    @Test(expected = javax.persistence.NoResultException.class)
//    public void deleteColor() {
//        EntityManager em = factory.createEntityManager();
//        // Begin a new local transaction so that we can persist a new entity
//        em.getTransaction().begin();
//        Query q = em
//                .createQuery("SELECT p FROM GoodsColor p WHERE p.firstName = :firstName AND p.lastName = :lastName");
//        q.setParameter("firstName", "Jim_1");
//        q.setParameter("lastName", "Knopf_!");
//        GoodsColor color = (GoodsColor) q.getSingleResult();
//        em.remove(color);
//        em.getTransaction().commit();
//        color = (GoodsColor) q.getSingleResult();
//        // Begin a new local transaction so that we can persist a new entity
//
//        em.close();
//    }

}
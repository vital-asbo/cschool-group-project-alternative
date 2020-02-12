//package spring.hibernate;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//public class CarsDao {
//
//    @Autowired
//    private CarsRepository carsRepository;
//
//    public void saveCars(Cars cars) {
//        carsRepository.save(cars);
////        Transaction transaction = null;
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            transaction = session.beginTransaction();
////            session.save(cars);
////            transaction.commit();
////        } catch (Exception e) {
////            if (transaction != null) {
////                transaction.rollback();
////            }
////            e.printStackTrace();
////        }
//    }
//
//    public List<Cars> getCars() {
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            return session.createQuery("from Cars", Cars.class).list();
////        }
//        return carsRepository.findAll();
//    }
//
//    public void updateCars(Cars cars) {
////        Transaction transaction = null;
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            transaction = session.beginTransaction();
////            session.update(cars);
////            transaction.commit();
////        } catch (Exception e) {
////            if (transaction != null) {
////                transaction.rollback();
////            }
////            e.printStackTrace();
////        }
//
//        carsRepository.save(cars);
//    }
//
//    public void deleteCars(Cars cars) {
////        Transaction transaction = null;
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            transaction = session.beginTransaction();
////            session.delete(cars);
////            transaction.commit();
////        } catch (Exception e) {
////            if (transaction != null) {
////                transaction.rollback();
////            }
////            e.printStackTrace();
////        }
//        carsRepository.delete(cars);
//    }
//}

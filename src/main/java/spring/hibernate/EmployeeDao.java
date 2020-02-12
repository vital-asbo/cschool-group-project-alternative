//package spring.hibernate;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//public class EmployeeDao {
//
//    @Autowired
//    private EmployeesRepository employeesRepository;
//
//    public void saveEmployee(Employees employee) {
////        Transaction transaction = null;
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            transaction = session.beginTransaction();
////            session.save(employee);
////            transaction.commit();
////        } catch (Exception e) {
////            if (transaction != null) {
////                transaction.rollback();
////            }
////            e.printStackTrace();
////        }
//        employeesRepository.save(employee);
//    }
//
//    public List<Employees> getEmployees() {
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            return session.createQuery("from Employees", Employees.class).list();
////        }
//        return employeesRepository.findAll();
//    }
//
//    public void updateEmployees(Employees employee) {
////        Transaction transaction = null;
////        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
////            transaction = session.beginTransaction();
////            session.update(employee);
////            transaction.commit();
////        } catch (Exception e) {
////            if (transaction != null) {
////                transaction.rollback();
////            }
////            e.printStackTrace();
////        }
//    employeesRepository.save(employee);
//    }
//}

//package com.douzone.homework.repository;
//
//import com.douzone.homework.domain.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class JpaStudentRepository implements StudentRepository {
//
//    private final EntityManager em;
//    // JPA는 전부 EntityManager라는 것으로 돌아감 // 스프링 부트가 알아서 엔티티매니저를 생성해줌. 현재 데이터베이스랑 연결해서 만들어줌. 그래서 만든걸 injection만 하면 됨.
//    // 얘는 데이터소스를 내부적으로 들고 있어서 DB랑 연결하고 하는걸 내부적으로 다 처리를 한다
//
//    @Autowired
//    public JpaStudentRepository(EntityManager em) {
//        this.em = em;
//    }
//
//    @Override
//    public Student save(Student student) {
//        em.persist(student);
//        return student;
//    }
//
//    @Override
//    public Optional<Student> findById(Long id) {
//        Student student = em.find(Student.class, id);
//        return Optional.ofNullable(student);
//    }
//
//    @Override
//    public Optional<Student> findByName(String name) {
//        List<Student> result = em.createQuery("select s from Student s where s.name = :name", Student.class)
//                .setParameter("name", name)
//                .getResultList();
//        return result.stream().findAny();
//    }
//
//    @Override
//    public List<Student> findAll() {
//        return em.createQuery("select s from Student s", Student.class)
//                .getResultList();
//    }
//}
public class DAPImpl implements DAO{

  @Autowerid
  private SessionFactory sessionFactory;
  
  public void add(Student student){
      sessionFactory.getCurrentSession().save(student);
  }

 public void edit(Student student){
      sessionFactory.getCurrentSession().update(student);
 }
 
 public void delete(int id){
      sessionFactory.getCurrentSession().delete(getStudent(id));
 }
 
public Student getStudent(int id){
      return (Student) sessionFactory.getCurrentSession().get(Student.class, id);

}

public List getAllStudent(){
  return sessionFactory.getCurrentSession().createQuery("from Student").list();

}
}

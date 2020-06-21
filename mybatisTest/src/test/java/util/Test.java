package util;
import com.bun.bean.Doctor;
import com.bun.dao.ItDoctorDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import javax.print.Doc;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    private InputStream io;
    private SqlSession sql;
    private Doctor doctor;
    private ItDoctorDao idd;

    @Before
    public void init(){
        try {
            io = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建Sql session工厂
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = sfb.build(io);
        //使用工厂生产Sqlsession对象
        sql = factory.openSession();
        //使用SQL session创建dao接口的代理对象
         idd = sql.getMapper(ItDoctorDao.class);

    }
    @After
    public void destroy() throws IOException {
        sql.close();
        io.close();
    }
    @org.junit.Test
    public  void test (){
//        doctor = new Doctor();
        //使用代理对象执行方法
        //查询所有
       List<Doctor> list =  idd.findAll();
        for (Doctor dwew: list) {
            System.out.println(dwew.toString());
        }
       //插入数据
     /* Doctor d = new Doctor();
       d.setDoctor("asdasd");
       d.setCD("外科");
       d.setPay1(23.3);
       d.setWorkday("1-6");
       d.setPassword("1236655644");
       idd.addDoc(d);
        System.out.println(d.toString());*/
      //按条件插入数据
       /* doctor.setDoctor("pointkey");
        doctor.setCD("心血管科");
        doctor.setId_d("42");
      idd.updateDoc("pointkey","心血管科","45");*/
/*
    idd.deleteDoc("44");
       sql.commit();*/
//        sql.commit();

    }
    @org.junit.Test
    public void findByCon(){
        doctor = new Doctor();
        doctor.setDoctor("pointkey");
        doctor.setPay1(78);
        //doctor.setCD("心血管科");
        System.out.println("125365");
       List<Doctor> lis =  idd.findByCon(doctor);
        for (Doctor doctor:lis
             ) {
            System.out.println(doctor.toString());
        }

    }
}

package com.bun.dao;

import com.bun.bean.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItDoctorDao {
    //@Select("select * from doctor")
    List<Doctor> findAll();

    int addDoc(Doctor doctor);

    Integer updateDoc(@Param("value1")String doctor,@Param("value2") String CD,@Param("value3") String id_d);

    Integer deleteDoc(String id);
    List<Doctor>  findByCon(Doctor doctor);
    List<Doctor>  findByConIn(Doctor doctor);
}

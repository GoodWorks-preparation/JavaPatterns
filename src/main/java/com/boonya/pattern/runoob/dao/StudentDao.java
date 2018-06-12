package com.boonya.pattern.runoob.dao;

import java.util.List;

/**
 * @ClassName: StudentDao
 * @Description: TODO(功能描述:数据访问接口)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

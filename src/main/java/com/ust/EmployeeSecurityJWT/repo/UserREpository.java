/**
 * 
 */
package com.ust.EmployeeSecurityJWT.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.EmployeeSecurityJWT.entity.User;

/**
 * @author Administrator
 *
 */
public interface UserREpository extends JpaRepository<User,Integer>{

}

package com.company.service.iservice;

import java.util.List;

/**
 * 
 * @author Administrator
 *
 * @param <T>:Orders  Item   Product  Detail Login
 * @param <K>:findById(Integer k)   Kָ�����������������
 */
public interface IBaseService<T,K> {
	String save(T t);
	String update(T t);
	String delete(T t);
	List<T> findAll();
	T findById(K k);
	

}

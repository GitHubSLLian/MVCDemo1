package com.company.service.iservice.report;

import java.util.List;

import com.company.dao.pojo.report.OrderReport;
/**
 * 
 * @author Administrator
 *显示用户、产品、订单，订单详情的相关信息
 */

public interface IOrderReport {
	List<OrderReport> showInfo();
}

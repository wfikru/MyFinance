package com.service.myfinance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.myfinance.controller.PaymentInfo;


@Service
@Transactional
public class RestService {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void savePaymentInfo(PaymentInfo payment) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(payment);
	}
}

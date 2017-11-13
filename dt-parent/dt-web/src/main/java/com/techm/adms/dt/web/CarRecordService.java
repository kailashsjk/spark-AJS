package com.techm.adms.dt.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.techm.adms.dt.web.*;

@Path("/CarService")
@RequestScoped
public class CarRecordService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CarRecordService.class);
	
	
	
	
	@GET
	@Path("/getAll")
	@Produces({"application/json"})
	
	public List<CarRecord> getDtCarDetails(){
		System.out.println("IN SEERVICES");
		LOGGER.info("IN SEERVICES");
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList =  DBConnect.getDtCarRecordDetails();
		
		
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
	
	@GET
	@Path("/getAggDriverQuery")
	@Produces({"application/json"})
	public List<CarRecord> getAggQueryDetail(){
		System.out.println("IN SEERVICES");
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList =  DBConnect.getAggDriverQuery();
		
		
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
	@GET
	@Path("/getAggDriverModelCountQuery")
	@Produces({"application/json"})
	public List<CarRecord> getAggDriverQueryModelCount(){
		System.out.println("IN SEERVICES");
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList =  DBConnect.getAggDriverQueryModelCount();
		
		
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
	
	@GET
	@Path("/getAggDriverModelCityCountQuery")
	@Produces({"application/json"})
	public List<CarRecord> getAggDriverQueryModelCityCount(){
		System.out.println("IN SEERVICES");
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList =  DBConnect.getAggDriverQueryModelCityCount();
		
		
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
	@GET
	@Path("/getFuelEffDriverModelCountQuery")
	@Produces({"application/json"})
	public List<CarRecord> getFuelEffDriverQueryModelCount(){
		System.out.println("IN SEERVICES");
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList =  DBConnect.getFuelEffDriverQueryModelCount();
		
		
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
}















/*package com.techm.adms.dt.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.techm.adms.dt.common.exception.DTServiceException;
import com.techm.adms.dt.entity.CarRecord;

import com.techm.adms.dt.web.util.ServiceConstants;
import com.techm.adms.dt.web.util.ServiceMessage;
import com.techm.adms.dt.web.util.ServiceMessageHandler;
import com.techm.adms.dt.service.*;

@Path("/CarService")
@RequestScoped
public class CarRecordService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CarRecordService.class);
	
	@SuppressWarnings("cdi-ambiguous-dependency")
	@Inject 
	IDTCarRecordBean dTCarBean ;
	
	
	
	@GET
	@Path("/getAll")
	@Produces({"application/json"})
	public List<CarRecord> getDtCarDetails(){
		List<CarRecord> carDtlList = new ArrayList<CarRecord>();
		try{
			System.out.println("inside method-------------------");
			carDtlList = dTCarBean.getAllDTCarDetails();
		}catch(DTServiceException dtServiceException){
			LOGGER.error(dtServiceException.getMessage());
		}catch(Exception exception){
			LOGGER.error(exception.getMessage());
		}
		return carDtlList;
	}
	
	
	
}*/
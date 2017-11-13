package com.techm.adms.dt.web;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.ByteArrayInputStream;
import java.io.Console;		
import java.io.ObjectInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






public class DBConnect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DBConnect.class);
	
	
		public static List<CarRecord> getDtCarRecordDetails()throws Exception{
	
			 List<CarRecord> carDetail = new ArrayList<CarRecord>();	
			 
			 CarRecord data1=null;
			 
			 LOGGER.info("IN Db");
			
			 Class.forName("org.h2.Driver");
	          Connection conn = DriverManager.
	              getConnection("jdbc:h2:file:C:\\cardb", "sa", "");
	    		
		      try { 
		    	 
		          LOGGER.info("IN Db");
		    		System.out.println("Ïnside Db");
		          
		          Statement stat = conn.createStatement();
		          ResultSet rs = stat.executeQuery("select * from car where timestamp in('2015-03-30 23:09:26.9105815' , '2015-03-30 23:09:22.6613426') ");
		      
		          
		          while (rs.next()) {
		        	  System.out.println("Ïnside rsnext");
		        		System.out.println("model:"+rs.getString(1)+"City:"+rs.getString(2));
		        		data1=new CarRecord();
		        		
		        		data1.setVin(rs.getString("vin"));
			          	data1.setModel(rs.getString("model"));
			          	
			          	data1.setTimestamp(rs.getString("timestamp"));
			          data1.setOutsidetemperature(rs.getString("outsidetemperature"));
			      	  data1.setEnginetemperature(rs.getString("enginetemperature"));
			        	data1.setSpeed(rs.getString("speed"));
			        	data1.setFuel(rs.getString("fuel"));
			        	data1.setEngineoil(rs.getString("engineoil"));
			        	data1.setTirepressure(rs.getString("tirepressure"));
			        	data1.setOdometer(rs.getString("odometer"));
			            data1.setCity(rs.getString("city"));
			          	data1.setAccelerator_pedal_position(rs.getString("accelerator_pedal_position"));
			          	data1.setParking_brake_status(rs.getString("parking_brake_status"));
			          	data1.setHeadlamp_status(rs.getString("headlamp_status"));
			          	data1.setBrake_pedal_status(rs.getString("brake_pedal_status"));
			          	data1.setTransmission_gear_position(rs.getString("transmission_gear_position"));
			          	data1.setIgnition_status(rs.getString("ignition_status"));
			          	data1.setWindshield_wiper_status(rs.getString("windshield_wiper_status"));
			          	data1.setAbs(rs.getString("abs"));
			         
			          	
			          
			          	carDetail.add(data1);
			            
		        	 	        	 
		            }
		          
		        
		         
		      } catch (Exception e) { 
		         e.printStackTrace(); 
		      }finally{
		    	  conn.close();
		      }
		      
		      return carDetail;  
		      
		   } 

		
		public static List<CarRecord> getAggDriverQuery() throws Exception{
			
			 List<CarRecord> carDetail = new ArrayList<CarRecord>();
			 CarRecord data1=null;
			  Class.forName("org.h2.Driver");
	          Connection conn = DriverManager.
	              getConnection("jdbc:h2:file:C:\\cardb", "sa", "");
		      try { 
		    	
		          // add application code here
		    	  LOGGER.info("IN Db");
		    		System.out.println("Ïnside Db");
		          
		                
		          Statement stat = conn.createStatement();
		          ResultSet rs = stat.executeQuery(" SELECT model,city FROM Car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND brake_pedal_status = '1'  AND speed >= '50'");
		          //public static CarRecord getDtCarRecordDetails(){
		         
		       
		          while (rs.next()) {
		          	
		          	System.out.println("model:"+rs.getString("model")+"City:"+rs.getString("city"));
		          	data1=new CarRecord();
		          	
		          	data1.setModel(rs.getString("model"));
		          	data1.setCity(rs.getString("city"));

		          
		          	carDetail.add(data1);
		             
		             
		          }
		 
		      	
		         		         
		      } catch (Exception e) { 
		         e.printStackTrace(); 
		      }finally{
		    	  conn.close();
		      }
		  		      
		      return carDetail;
		   }

		public static List<CarRecord> getAggDriverQueryModelCount() throws Exception{
			
			 List<CarRecord> carDetail = new ArrayList<CarRecord>();
			 CarRecord data1=null;
			  Class.forName("org.h2.Driver");
	          Connection conn = DriverManager.
	              getConnection("jdbc:h2:file:C:\\cardb", "sa", "");
		      try { 
		    	
		          // add application code here
		    	  LOGGER.info("IN Db");
		    		System.out.println("Ïnside Db");
		          
		                
		          Statement stat = conn.createStatement();
		          ResultSet rs = stat.executeQuery(" SELECT model,count(*) as modelCount FROM car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND brake_pedal_status = '1'  AND speed >= '50' Group by model ");
		          //public static CarRecord getDtCarRecordDetails(){
		         
		       
		          while (rs.next()) {
		          	
		          	System.out.println("model:"+rs.getString("model")+"City:"+rs.getString("modelCount"));
		          	data1=new CarRecord();
		          	
		          	data1.setModel(rs.getString("model"));
		          	data1.setModelCount(rs.getString("modelCOunt"));

		          
		          	carDetail.add(data1);
		             
		             
		          }
		 
		      	
		         		         
		      } catch (Exception e) { 
		         e.printStackTrace(); 
		      }finally{
		    	  conn.close();
		      }
		  		      
		      return carDetail;
		   }
		
		

		public static List<CarRecord> getAggDriverQueryModelCityCount() throws Exception{
			
			 List<CarRecord> carDetail = new ArrayList<CarRecord>();
			 CarRecord data1=null;
			  Class.forName("org.h2.Driver");
	          Connection conn = DriverManager.
	              getConnection("jdbc:h2:file:C:\\cardb", "sa", "");
		      try { 
		    	
		          // add application code here
		    	  LOGGER.info("IN Db");
		    		System.out.println("Ïnside Db");
		          
		                
		          Statement stat = conn.createStatement();
		          ResultSet rs = stat.executeQuery(" SELECT * FROM (SELECT count(*) AS COUNT,MODEL,CITY FROM car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND brake_pedal_status = '1'  AND speed >= '50'  and city='Redmond'  group by  model,CITY UNION  SELECT count(*) AS COUNT,MODEL,CITY  FROM car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND brake_pedal_status = '1'  AND speed >= '50'  and city='Bellevue'  group by  model,CITY UNION SELECT count(*) AS COUNT,MODEL,CITY  FROM car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND brake_pedal_status = '1'  AND speed >= '50'  and city='Seattle' group by  model,CITY )   ORDER BY MODEL ,CITY  ");
		          //public static CarRecord getDtCarRecordDetails(){
		         
		       
		          while (rs.next()) {
		          	
		          	System.out.println("model:"+rs.getString("model")+"City:"+rs.getString("count"));
		          	data1=new CarRecord();
		          	
		          	data1.setModel(rs.getString("model"));
		          	data1.setCity(rs.getString("city"));
		          	data1.setModelCount(rs.getString("count"));

		          
		          	carDetail.add(data1);
		             
		             
		          }
		 
		      	
		         		         
		      } catch (Exception e) { 
		         e.printStackTrace(); 
		      }finally{
		    	  conn.close();
		      }
		  		      
		      return carDetail;
		   }


		
		public static List<CarRecord> getFuelEffDriverQueryModelCount() throws Exception{
			
			 List<CarRecord> carDetail = new ArrayList<CarRecord>();
			 CarRecord data1=null;
			  Class.forName("org.h2.Driver");
	          Connection conn = DriverManager.
	              getConnection("jdbc:h2:file:C:\\cardb", "sa", "");
		      try { 
		    	
		          // add application code here
		    	  LOGGER.info("IN Db");
		    		System.out.println("Ïnside Db");
		          
		                
		          Statement stat = conn.createStatement();
		          ResultSet rs = stat.executeQuery(" SELECT count(*) as modelCount,model FROM car WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight')  AND parking_brake_status = '0'  AND brake_pedal_status = '0'  AND speed <= '60'  AND accelerator_pedal_position >= '50' group by  model ");
		          //public static CarRecord getDtCarRecordDetails(){
		         
		       
		          while (rs.next()) {
		          	
		          	System.out.println("model:"+rs.getString("model")+"City:"+rs.getString("modelCount"));
		          	data1=new CarRecord();
		          	
		          	data1.setModel(rs.getString("model"));
		          
		          	data1.setModelCount(rs.getString("modelCount"));

		          
		          	carDetail.add(data1);
		             
		             
		          }
		 
		      	
		         		         
		      } catch (Exception e) { 
		         e.printStackTrace(); 
		      }finally{
		    	  conn.close();
		      }
		  		      
		      return carDetail;
		   }
        
		}
	
/*

SELECT count(*),model,city
FROM car
WHERE transmission_gear_position IN ('fourth', 'fifth', 'sixth', 'seventh', 'eight') 
AND parking_brake_status = '0' 
AND brake_pedal_status = '0' 
AND speed <= '60' 
AND accelerator_pedal_position >= '50'
group by  model,city
*/
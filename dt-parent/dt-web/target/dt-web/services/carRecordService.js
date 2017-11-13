app.service('carRecordService', function($http){
	
	
	
    this.getdata = function(callbackCarRecord){
    	
        {
        		
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getAll");
						responsePromise.success(function(data, status, headers, config) {
					    callbackCarRecord(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! because no webservice is attached yet");      					 
					    });
	   };
    }
    
    
    this.getdata1 = function(callbackCarRecord1){
    	
        {
        		
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getAggDriverQuery");
						responsePromise.success(function(data, status, headers, config) {
					    callbackCarRecord1(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! because no webservice is attached yet");      					 
					    });
	   };
    }
    
    
    this.getModelCount = function(callbackCarRecord2){
    	        {
        		
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getAggDriverModelCountQuery");
						responsePromise.success(function(data, status, headers, config) {
					    callbackCarRecord2(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! getCountModel ! because no webservice is attached yet");      					 
					    });
	   };
    }
    
    this.getModelCityCount = function(callbackCarRecord2){
    	
        {
        	/*alert("inside controller");
        		*/
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getAggDriverModelCityCountQuery");
						responsePromise.success(function(data, status, headers, config) {
					    callbackCarRecord2(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! getCountModel ! because no webservice is attached yet");      					 
					    });
	   };
    }
    
 this.getFuelEffModelCityCount = function(callbackCarRecord2){
    	
        {
        	/*alert("inside controller");
        		*/
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getFuelEffDriverModelCountQuery");
						responsePromise.success(function(data, status, headers, config) {
					    callbackCarRecord2(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! getCountModel ! because no webservice is attached yet");      					 
					    });
	   };
    }
})


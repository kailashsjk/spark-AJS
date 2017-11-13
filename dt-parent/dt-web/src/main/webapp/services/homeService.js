module.service('carRecordService', function($http){
	
	
	
    this.getdata = function(callbackCarRecord){
    	alert("inside service");
        {
        	alert("inside service1");			
        	            var responsePromise = $http.get("http://localhost:18080/dt-web/webresources/CarService/getAll");
						responsePromise.success(function(data, status, headers, config) {
					    alert("data");
						alert(data);
						callbackCarRecord(data);
				        });
					    responsePromise.error(function(data, status, headers, config) {
				        alert("AJAX failed! because no webservice is attached yet");      					 
					    });
	   };
    }
    
    
});
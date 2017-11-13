

  //'use strict';

  var app = angular.module('examples', ['chart.js']);
  
	
  app.controller('DataTablesCtrl', ['$scope','carRecordService', function ($scope,carRecordService){
    
	
	  
		
	  
	  
	  
		
	  $scope.getModelCityCountdonut = function() {
			
			
				carRecordService.getModelCityCount(function(data1) {
					
				$scope.carDetails = data1;// populates the view
	
				 
				$scope.labels = [
				                data1[0].model, data1[1].model, data1[2].model, data1[3].model, data1[4].model, data1[5].model,data1[6].model,data1[7].model,data1[8].model,data1[9].model,data1[10].model
				                
				                 ];
			
			    $scope.series = ["Redmond", "Bellevue","Seattle"];
			    $scope.options1 = {legend: {display: true}};
			    $scope.data2 = [
		                       [data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount],
					           [9230, 11538, 14783]
					          ];
			    var city1=parseInt(data1[0].modelCount)+parseInt(data1[3].modelCount)+parseInt(data1[6].modelCount)+parseInt(data1[9].modelCount)+parseInt(data1[12].modelCount)+parseInt(data1[15].modelCount)+parseInt(data1[18].modelCount)+parseInt(data1[21].modelCount)+parseInt(data1[24].modelCount)+parseInt(data1[27].modelCount)+parseInt(data1[30].modelCount);
				var city2=parseInt(data1[1].modelCount)+parseInt(data1[4].modelCount)+parseInt(data1[7].modelCount)+parseInt(data1[10].modelCount)+parseInt(data1[13].modelCount)+parseInt(data1[16].modelCount)+parseInt(data1[19].modelCount)+parseInt(data1[22].modelCount)+parseInt(data1[25].modelCount)+parseInt(data1[28].modelCount)+parseInt(data1[31].modelCount);
				var city3=parseInt(data1[2].modelCount)+parseInt(data1[5].modelCount)+parseInt(data1[8].modelCount)+parseInt(data1[11].modelCount)+parseInt(data1[14].modelCount)+parseInt(data1[17].modelCount)+parseInt(data1[20].modelCount)+parseInt(data1[23].modelCount)+parseInt(data1[26].modelCount)+parseInt(data1[29].modelCount)+parseInt(data1[32].modelCount);
			    var d = [data1[0].modelCount, data1[3].modelCount, data1[6].modelCount, data1[9].modelCount, data1[12].modelCount, data1[15].modelCount, data1[18].modelCount,data1[21].modelCount,data1[24].modelCount,data1[27].modelCount,data1[30].modelCount,
			             data1[1].modelCount, data1[4].modelCount, data1[7].modelCount, data1[10].modelCount, data1[13].modelCount, data1[16].modelCount, data1[19].modelCount,data1[22].modelCount,data1[25].modelCount,data1[28].modelCount,data1[31].modelCount,
			             data1[2].modelCount, data1[5].modelCount, data1[8].modelCount, data1[11].modelCount, data1[14].modelCount, data1[17].modelCount, data1[20].modelCount,data1[23].modelCount,data1[26].modelCount,data1[29].modelCount,data1[32].modelCount];
			    var e = [city1, city2, city3];
			    
			    var outerRing = [];
			    var sumInnerRing = 0;
			    for(var k =0;k<e.length;k++){
			        sumInnerRing = sumInnerRing + e[k];
			    }
			    
			    
			    for(var i=0;i<=e.length;i++){
			       if(i==0)
			    	{
			    	    for(var j=0;j<(d.length)/3;j++){
			               outerRing.push(d[j]);
			             }
			    	}
			    	else if(i==1)
			    	{
			    	
			            for(var j=11;(j>(d.length)/3) && J<22;j++){
			               outerRing.push(d[j]);
			             }
			    	}
			    	else{
			            for(var j=22;(j>(d.length)/3) && j<d.length;j++){
			                outerRing.push(d[j]);
			            }
			    	}
			  
			    }
		
			 /*   $scope.data = [
			      [d[0]*(e[0]/(e[0]+e[1])),d[1]*(e[0]/(e[0]+e[1])),d[2]*(e[0]/(e[0]+e[1])),d[0]*(e[1]/(e[0]+e[1])),d[1]*(e[1]/(e[0]+e[1])),d[2]*(e[1]/(e[0]+e[1]))],
			      [e[0], e[1]]
			    ];
			    */
			    $scope.data = [outerRing,e];
			    
			    
			    
			 /* $scope.data = [
			    	 [[data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount], [data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount],[data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount]],
			    	 [9230, 11538, 14783]
			    			];*/
			  
			    console.log($scope.data);
			    console.log($scope.data2);
			    	
			    
			   
			    $scope.datasetOverride = [{                              //
				      fill: true, 
				      backgroundColor: [ 
                       "#6495ED",
                       "#9370D8",
                       "#FF7F50",
                       "#DC143C",
                       "#D2691E",
                       "#7FFFD4",
                       "#006400",
                       "#9ACD32",
                       "#008080",
                       "#800080",
                       "#FFA500",
                       "#6495ED",
                       "#9370D8",
                       "#FF7F50",
                       "#DC143C",
                       "#D2691E",
                       "#7FFFD4",
                       "#006400",
                       "#9ACD32",
                       "#008080",
                       "#800080",
                       "#FFA500",
                       "#6495ED",
                       "#9370D8",
                       "#FF7F50",
                       "#DC143C",
                       "#D2691E",
                       "#7FFFD4",
                       "#006400",
                       "#9ACD32",
                       "#008080",
                       "#800080",
                       "#FFA500"
                      
				        
				      ] 
				    }, { 
				      fill: true, 
				      backgroundColor: [ 
				        "#00FFFF", 
				        "#601390", 
				        "#0F86AE" 
				      ] 
				    }];	   
					    
				
				})		
				
				
				
					    
	  }
	  $scope.getModelCount = function() {
			
			
			carRecordService.getModelCount(function(data1) {
				
			$scope.carDetails = data1;// populates the view

			 
			$scope.labels1 =[
			                 data1[0].model,data1[1].model, data1[2].model,data1[3].model,data1[4].model,data1[5].model,data1[6].model,data1[7].model,data1[8].model,data1[9].model,data1[10].model
                            
			                 ];
			
			$scope.series1 = ['Redmond', 'Bellevue', 'Seattle'];
		    $scope.options2 = {legend: {display: true}};
		    $scope.data2 = [
	                       [data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount],
				           [9230, 11538, 14783]
				          ];
		    $scope.datasetOverride1 = [{                              //
			      fill: true, 
			      backgroundColor: [ 
                    "#803690",
                    "#00ADF9",
                    "#DCDCDC",
                    "#46BFBD",
                    "#FDB45C",
                    "#949FB1",
                    "#4D5360",
                    "#008B8B",
                    "#FA8072",
                    "#20B2AA",
                    "#9ACD32"
			      ] 
			    }, { 
			      fill: true, 
			      backgroundColor: [ 
			        "#7B68EE", 
			        "#DAA520", 
			        "#006400" 
			      ] 
			    }];	    
				    
			
			})			                 
				    
}
	  
	  $scope.getModelCityCount = function() {
	    	
	    	
	  		carRecordService.getModelCityCount(function(data1) {
	  			
	  			$scope.carDetails = data1;// populates the view
	  			
	  	  		
	/*bar chart	*/    			 
				    $scope.labelsStacked = ['seden', 'sport car', 'convertible', 'compact car', 'medium suv', 'small suv', 'hybrid','family saloon','couper','large suv','station wagon'];
				    $scope.type = 'StackedBar';
				    $scope.series = ['Bellevue','Redmond','Seattle'];
				    $scope.options = {
				      scales: {
				        xAxes: [{
				          stacked: true,
				        }],
				        yAxes: [{
				          stacked: true
				        }]
				      },legend: {display: true}    
				    };
				    
				
				    
				    $scope.dataStacked = [
				                          [data1[0].modelCount, data1[3].modelCount, data1[6].modelCount, data1[9].modelCount, data1[12].modelCount, data1[15].modelCount, data1[18].modelCount, data1[21].modelCount, data1[24].modelCount, data1[27].modelCount, data1[30].modelCount],
				                          [data1[1].modelCount, data1[4].modelCount, data1[7].modelCount, data1[10].modelCount, data1[13].modelCount, data1[16].modelCount, data1[19].modelCount, data1[22].modelCount, data1[25].modelCount, data1[28].modelCount, data1[31].modelCount],
				                          [data1[2].modelCount, data1[5].modelCount,data1[8].modelCount, data1[11].modelCount, data1[14].modelCount, data1[17].modelCount, data1[20].modelCount, data1[23].modelCount, data1[26].modelCount, data1[29].modelCount, data1[32].modelCount]
				                        ];

	})
	}
					   
	
	  $scope.getFuelEffModelCount = function() {
			
			
			carRecordService.getFuelEffModelCityCount(function(data1) {
				
			$scope.carDetails = data1;// populates the view

			 
			$scope.labels3 =[
			                 data1[0].model,data1[1].model, data1[2].model,data1[3].model,data1[4].model,data1[5].model,data1[6].model,data1[7].model,data1[8].model,data1[9].model,data1[10].model
                          
			                 ];
			
			
		    $scope.options3 = {legend: {display: true}};
		    $scope.data3 = [
	                       [data1[0].modelCount, data1[1].modelCount, data1[2].modelCount, data1[3].modelCount, data1[4].modelCount, data1[5].modelCount, data1[6].modelCount,data1[7].modelCount,data1[8].modelCount,data1[9].modelCount,data1[10].modelCount],
				           
				          ];
		    $scope.datasetOverride2 = [{                              //
			      fill: true, 
			      backgroundColor: [ 
                  "#803690",
                  "#00ADF9",
                  "#DCDCDC",
                  "#46BFBD",
                  "#FDB45C",
                  "#949FB1",
                  "#4D5360",
                  "#008B8B",
                  "#FA8072",
                  "#20B2AA",
                  "#9ACD32"
			      ] 
			    }];	    
				    
			
			})			                 
				    
}
	  
  }]);
  
  
  // table controller
  
  
  app.controller('DataTablesCtrl1',['$scope','carRecordService', function ($scope,carRecordService) {
	  
	  $scope.getModelCount = function() {
		
		
			
			carRecordService.getModelCount(function(data1) {
				
				$scope.carDetails = data1;// populates the view
			
			})
		}
	
	  $scope.getModelCityCount = function() {
			
			
				carRecordService.getModelCityCount(function(data1) {
					
				
					$scope.carDetails = data1;// populates the view
					
				})
			} 
	  
	  
}]);
  


  

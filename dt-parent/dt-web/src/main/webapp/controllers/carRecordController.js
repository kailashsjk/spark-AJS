module.controller('carRecordController', function($scope, carRecordService) {

	$scope.editingData = {};

	$scope.getCarDetail = function() {
		alert("hiiiii");
		carRecordService.getdata(function(data) {
			alert("hiiiii");
			alert("car data:" + data);
			alert("car data:" + data.vin);
			alert("car data:" + data.model);
			alert("car data:" + data.speed);
			alert("car data:" + data.city);
			$scope.carDetail = data;// populates the view
			for (var i = 0, length = $scope.carDetail.length; i < length; i++) {
				$scope.editingData[$scope.carDetail[i].vin] = false;
			}
		})
	}

	
	$scope.getAggDriverDetail = function() {
		
		carRecordService.getdata1(function(data1) {
			
			alert("car data:" + data1);
			//alert("car data:" + data1.model);
			$scope.carDetails = data1;// populates the view
			for (var i = 0, length = $scope.carDetail.length; i < length; i++) {
				$scope.editingData[$scope.carDetail[i].vin] = false;
			}
		})
	}
	
	
$scope.getModelCount = function() {
	
	alert("inside contoller modelcount");
		
		carRecordService.getModelCount(function(data1) {
			
			alert("modelcount data:" + data1);
			alert("data"+data1.modelCount);
			//alert("car data:" + data1.model);
			$scope.carDetails = data1;// populates the view
			for (var i = 0, length = $scope.carDetail.length; i < length; i++) {
				$scope.editingData[$scope.carDetail[i].vin] = false;
			}
		})
	}
	

$scope.getModelCityCount = function() {
	
	alert("inside contoller modelcitycount");
		
		carRecordService.getModelCityCount(function(data1) {
			
			alert("modelcitycount data:" + data1);
			alert("data"+data1.modelCount);
			//alert("car data:" + data1.model);
			$scope.carDetails = data1;// populates the view
			for (var i = 0, length = $scope.carDetail.length; i < length; i++) {
				$scope.editingData[$scope.carDetail[i].vin] = false;
			}
		})
	}
	
	
})




/*
(function () {
  'use strict';

  var app = angular.module('examples', ['chart.js']);


  app.controller('DataTablesCtrl', function ($scope) {
    
   $scope.labels = ['Ask', 'Bid', 'simple'];
    $scope.series = ['Volume Ask', 'Volume Bid', 'Volume simple'];

    $scope.data = [
      [65, 59, 65],
      [28, 48, 43]
    ];
    
    $scope.labelsStacked = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];
    $scope.type = 'StackedBar';
    $scope.series = ['2015', '2016'];
    $scope.options = {
      scales: {
        xAxes: [{
          stacked: true,
        }],
        yAxes: [{
          stacked: true
        }]
      }
    };
    
    $scope.dataStacked = [
      [65, 59, 90, 81, 56, 55, 40],
      [28, 48, 40, 19, 96, 27, 100]
    ];

  });
  // 
})();
*/


















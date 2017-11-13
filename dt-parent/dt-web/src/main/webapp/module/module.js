/*
* created a route module which is applicable through out whole html tag of index.html
* 
var productModule = angular.module('productModule', ['ngRoute','chart.js','angularUtils.directives.dirPagination']);

productModule.config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
                when('/route1', {
                    templateUrl: 'partial/route1.html'
                   
                }).
                when('/route2', {
                    templateUrl: 'partial/bars.html'
                }).
                otherwise({
                    redirectTo: '/route1'
                });
        }]);
		
productModule.config(function (ChartJsProvider) {
     // Configure all charts
     ChartJsProvider.setOptions({
			colours: ['#97BBCD', '#DCDCDC', '#F7464A', '#46BFBD', '#FDB45C', '#949FB1', '#4D5360'],
			responsive: true
     });
    
   });
*/


var module = angular.module('examples', ['ngRoute','chart.js','angularUtils.directives.dirPagination']);

module.config(function($stateProvider, $locationProvider) {
   // $locationProvider.html5Mode(true);

    $stateProvider
        .state('home', {
        url: '^',
        views: {
        'main@': {
            templateUrl: 'partials/home.html',
            controller: 'app'
            }
        },
      data: {// This data is breadcrumbs properties
        displayName: 'Home'
      }
    })
  
   
   
});




  
'use strict';
angular.module('clubApp').controller('ClubController', function($scope, $http) {
	
	var REST_SERVICE_URI = 'http://localhost:8080/clubapp/club/';
	$http.get(REST_SERVICE_URI)
    	.then(
    		function (response) {
    			$scope.clubs = response.data;
    		});
});
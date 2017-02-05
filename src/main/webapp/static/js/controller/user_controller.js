'use strict';
angular.module('clubApp').controller('UserController', function($scope, $http) {
	
	var REST_SERVICE_URI = 'http://localhost:8080/clubapp/user/';
	$http.get(REST_SERVICE_URI)
    	.then(
    		function (response) {
    			$scope.users = response.data;
    		});
});
'use strict';
angular.module('clubApp').config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "main.html"
    })
    .when("/club", {
        templateUrl : "club.html"
    })
    .when("/user", {
        templateUrl : "user.html"
    });
});
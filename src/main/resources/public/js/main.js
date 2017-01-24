/**
 * Created by green
 */
angular.module("reCaptcha", [])
    .controller("AppCtrl", function ($scope, $http) {
        $scope.auth = {};
        $scope.sendForm = function (auth) {
            $http({
                method: "POST",
                url: "/register",
                data: $.param(auth) // format to email=some@mail.com&password=somepass
                headers: { "Content-Type" : "application/x-www-form-urlencoded"}
            });
            window.alert(auth.email);
        }
    });
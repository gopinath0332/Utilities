var app = angular.module("test", []);

app.controller("tc", function($scope) {
    console.debug("controller");
    $scope.data = [1, 2, 3, 4];
    $scope.add = function() {
        $scope.data.push($scope.data.length + 1);
    }
});

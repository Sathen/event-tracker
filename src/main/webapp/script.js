function Events($scope, $http) {
    $http.get('http://localhost:8080/events').success(function (data) {
        $scope.events = data;
    });
}
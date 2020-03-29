var app = new Vue({
    el:'#app',
    data: {
      movies: null  
    },
    
    mounted: function () {
//        fetch('https://hplussport.com/api/products/order/price')
        fetch('http://localhost:8080/Assignment2_REST_API/resources/movies')
            .then(response => response.json())
            .then(data => {
                this.movies = data;
            })
    }
})

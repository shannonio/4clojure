function fizzbuzz() { 
    _.each([_.range(1,100)], function(num){ 
            if(num%3 === 0) {console.log("fizz");} 
            else if(num%5 === 0){console.log("buzz");} 
            else {console.log(num);}
        });
};
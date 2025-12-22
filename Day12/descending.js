function descending(number){
    const length = String(number).length;
    const newNumber = new Array(length);
    let count = 0;
    while(number > 0){
        let remainder = number % 10;
        newNumber[count] = remainder;
        number = Math.floor(number/ 10);
        count++;
    }
    let descend = joinedNumbers(newNumber)
    return descend;
}


function sortNumber(numbers){
    for(let count = 0; count < numbers.length;count++){
        for(let counter = count + 1; counter < numbers.length; counter++){
            if(numbers[count] > numbers[counter]){
                let temp = numbers[count];
                numbers[count] = numbers[counter];
                numbers[counter] = temp;
            }

        }
    }
    return numbers;
}

function joinedNumbers(numbers){
    let join = "";
    for(let count = 0; count < numbers.length; count++){
        join += numbers[count]; 
    }
    return join;
}
number = 1234;
console.log(descending(number));
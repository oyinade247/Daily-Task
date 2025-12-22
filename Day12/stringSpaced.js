function highestAndLowest(numbers){
    const noSpace = numbers.replaceAll(" ","").replaceAll(",", "");
    let length = noSpace.length;
    let convert = Number(noSpace);

    let newArray = new Array(length);
    let count = 0;
    while(convert > 0){
        let remainder = convert % 10;
        newArray[count] = remainder;
        convert = Math.floor(convert / 10);
        count++;
    }
        let joined = joinedHighestAndLowest(newArray);
        return joined;
}

    function getHighest(numbers){
        let highest = numbers[0]
        for(let count = 0; count < numbers.length; count++){
            if(numbers[count] > highest){
                highest = numbers[count]
            }
        }
        return highest;
    }

    function getLowest(numbers){
        let lowest = numbers[0];
        for(let count = 0; count < numbers.length; count++){
            if(numbers[count] < lowest){
                lowest = numbers[count];
            }
        }
        return lowest
    }

    function joinedHighestAndLowest(numbers){
        let join =  "";
       let highest =  getHighest(numbers);
       join += highest + " ";
       let lowest = getLowest(numbers)
       join += lowest;
         return join
    }
   





const num = "1, 2, 3, 4, 5"
console.log(highestAndLowest(num));
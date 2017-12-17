function KeyValuePairs(numbers){
    let input = [];
    let duplicateEntry = numbers[numbers.length-1];
	let found = false;
    for(let i=0 ;i<numbers.length-1;i++){
        let keyValue = numbers[i].split(' ');
        let command = keyValue[0];
        input[command] = keyValue[1];
        if(duplicateEntry==command){
            console.log(input[command]);
			found = true;
        }
    }
	if(!found){
         console.log("None")
    }
}
function valuesIndexes(args) {
	let len = Number(args[0]);
	let obj=[];
	for (let i=1; i < args.length; i++) {
		let nums = args[i].split(' - ').map(Number);
		let index=nums[0];
        let value=nums[1];
        obj[index]=value;
	}
    for(let j=0;j<len;j++){
        if(obj[j]==undefined){
            console.log(0);
        }
        else{
            console.log(obj[j]);
        }
	}
}
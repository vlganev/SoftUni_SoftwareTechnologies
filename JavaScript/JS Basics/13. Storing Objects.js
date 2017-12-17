function StoreObjects(args){
    let array = [];
	for (let i=0; i < args.length; i++) {
		let tokens = args[i].split(' -> ');
		let name = tokens[0];
		let age = tokens[1];
		let grade = tokens[2];
		let obj = {'name' : name, 'age' : age, 'grade' : grade }
		array.push(obj);
	}
	
	for (let j=0; j < array.length; j++) {
		console.log('Name: ' + array[j].name);
		console.log('Age: ' + array[j].age);
		console.log('Grade: ' + array[j].grade);
	}
}
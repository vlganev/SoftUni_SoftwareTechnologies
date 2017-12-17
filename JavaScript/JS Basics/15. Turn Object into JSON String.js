function ObjectIntoJSON(args) {
	let object = {};
	for	(let i=0; i<args.length; i++) {
		let tokens = args[i].split(' -> ');
		let index = tokens[0];
		let value = tokens[1];
		if (index === "age" || index === "grade") {
			value = Number(tokens[1]);
		}
		object[index] = value;
	}
	let str = JSON.stringify(object);
	console.log(str);
}
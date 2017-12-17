function ParseJSONObjects(args) {
	let objects = args.map(JSON.parse);
	for (let obj of objects) {
		console.log(`Name: ${obj.name}`);
		console.log(`Age: ${obj.age}`);
		console.log(`Date: ${obj.date}`);
	}
}
	function addRemoveElements(args) {
		array =[];
		for (let i=0; i < args.length; i++) {
			let tokens = args[i].split(' ');
			if (tokens[0] == "add") {
				array.push(tokens[1]);
			}
			if (tokens[0] == "remove") {
				array.splice(tokens[1], 1);
			}
		}
		for(let j=0;j<array.length;j++){
			console.log(array[j]);
		}
	}
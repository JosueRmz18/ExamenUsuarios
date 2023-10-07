document.addEventListener('DOMContentLoaded', function() {
	var urlParams = new URLSearchParams(window.location.search);
	if (urlParams.has('error')) {
		console.log("true")
		document.getElementById('invalidAlert').style.display = 'block';
	}
});

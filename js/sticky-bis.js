	window.onscroll = function(){remonter(); scrollFunction(); }
	
    var ejectBtn = document.getElementById("ejectBtn");
	var menu = document.getElementById("menu");
	var mybutton = document.getElementById("myBtn"); // GO TO TOP

	var positionInitiale = ejectBtn.offsetTop;

	function remonter() {
	  if(window.pageYOffset > positionInitiale ){
		ejectBtn.classList.add("sticky-ejectBtn");
		menu.classList.add("sticky-menu");
	  } else {
		ejectBtn.classList.remove("sticky-ejectBtn");
		menu.classList.remove("sticky-menu");	
	  }
	} 
	
	
	function scrollFunction() {
		if (document.body.scrollTop > 900 || document.documentElement.scrollTop > 900) {
			 mybutton.style.display = "block";
		}else{
			 mybutton.style.display = "none";
		}
    }
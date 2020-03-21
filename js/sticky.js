

	var barre = document.getElementById("sidebarGauche");
	var main = document.getElementById("main")


	// sticky top menu
	
	window.onscroll = function(){ remonter() };

	var ejectBtn = document.getElementById("ejectBtn");
	var menu = document.getElementById("menu");

    	
	var positionInitiale = ejectBtn.offsetTop;


	function remonter() {
	  if (window.pageYOffset > positionInitiale){
		ejectBtn.classList.add("sticky-ejectBtn");
		menu.classList.add("sticky-menu");
		barre.classList.add("stickySidebar");
		main.classList.add("sticky-main");
	  } else {
		ejectBtn.classList.remove("sticky-ejectBtn");
		menu.classList.remove("sticky-menu");
		barre.classList.remove("stickySidebar");
		main.classList.remove("sticky-main");
	  }
	}
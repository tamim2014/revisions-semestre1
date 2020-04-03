	window.onscroll = function(){remonter(); scrollFunction(); }
	
    var ejectBtn = document.getElementById("ejectBtn");
	var menu = document.getElementById("menu");
	var mybutton = document.getElementById("myBtn"); // GO TO TOP
	var barre = document.getElementById("sidebarGauche");
	var barreDroite = document.getElementById("sidebarDroit");// session 2017 seulement

	var positionInitiale = ejectBtn.offsetTop;

	function remonter() {
	  if(window.pageYOffset > positionInitiale ){
		ejectBtn.classList.add("sticky-ejectBtn");
		menu.classList.add("sticky-menu");
		barre.classList.add("stickySidebar");// pour les pages corrigées d'examen
		barreDroite.classList.add("stickySidebarDroit");// pour la session 2017 seulement
	  } else {
		ejectBtn.classList.remove("sticky-ejectBtn");
		menu.classList.remove("sticky-menu");
        barre.classList.remove("stickySidebar"); // pour les pages corrigées d'examen		
		barreDroite.classList.remove("stickySidebarDroit"); // pour la session 2017 seulement
	  }
	} 
	
	
	function scrollFunction() {
		if (document.body.scrollTop > 900 || document.documentElement.scrollTop > 900) {
			 mybutton.style.display = "block";
		}else{
			 mybutton.style.display = "none";
		}
    }
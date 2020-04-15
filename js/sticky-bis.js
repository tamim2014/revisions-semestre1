	window.onscroll = function(){remonter(); paSuperposer(); scrollFunction(); }
	
    var ejectBtn = document.getElementById("ejectBtn");
	var menu = document.getElementById("menu");
	var mybutton = document.getElementById("myBtn"); // GO TO TOP
	var barre = document.getElementById("sidebarGauche");
	var barreDroite = document.getElementById("sidebarDroit");

	
	var positionInitiale = ejectBtn.offsetTop;
	var positionFinale = footer.offsetTop;

	function remonter() {
	  if(window.pageYOffset > positionInitiale  ){
		ejectBtn.classList.add("sticky-ejectBtn");
		menu.classList.add("sticky-menu");
		barre.classList.add("stickySidebar");// pour seulement les pages corrigées d'examen
		barreDroite.classList.add("stickySidebarDroit");
	  } else  {
		ejectBtn.classList.remove("sticky-ejectBtn");
		menu.classList.remove("sticky-menu");
        barre.classList.remove("stickySidebar"); // pour seulement les pages corrigées d'examen		
		barreDroite.classList.remove("stickySidebarDroit"); 
	  }

	  
	} 
	// Solution à la supperposition des sidebar par le footer
	function paSuperposer() {
	  if (document.body.scrollTop > 5626  || document.documentElement.scrollTop > 5626 ) {
		barreDroite.classList.add("stickyNoSupepose");
	  }else{
		barreDroite.classList.remove("stickyNoSupepose");   
	  } 		
	}
	// L'action varie en fonction de la longuer de la page et la page de l'énoncé est plus courte
	function paSuperposerSujet() {
	  if (document.body.scrollTop > 2000  || document.documentElement.scrollTop > 2000 ) {
		barreDroite.classList.add("stickyNoSupepose");
	  }else{
		barreDroite.classList.remove("stickyNoSupepose");   
	  } 		
	}
	
	
	function scrollFunction() {
		if (document.body.scrollTop > 900 || document.documentElement.scrollTop > 900) {
			 mybutton.style.display = "block";
		}else{
			 mybutton.style.display = "none";
		}
    }
	
	
	

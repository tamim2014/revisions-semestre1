	window.onscroll = function(){remonter();}
    var ejectBtn = document.getElementById("ejectBtn");
	var menu = document.getElementById("menu");
	var mybutton = document.getElementById("myBtn");// GO TO TOP

	var positionInitiale = ejectBtn.offsetTop;

    // gestion (spécifique) des info-bull lors d'un sticky
	  var courUn = document.getElementById('coursUn');
	  var infoUn = document.getElementById('infoUn');
	  var courDeux = document.getElementById('coursDeux');
	  var infoDeux = document.getElementById('infoDeux');
	  var courTrois = document.getElementById('coursTrois');
	  var infoTrois = document.getElementById('infoTrois');	



	function remonter() {
	  if(window.pageYOffset > positionInitiale ){
		ejectBtn.classList.add("sticky-ejectBtn");
		menu.classList.add("sticky-menu");
		barre.classList.add("stickySidebar");
		main.classList.add("sticky-main");
		// virer les info-bulle
		coursUn.onmouseover = function(){infoUn.style.display = "none";}
		coursDeux.onmouseover = function(){infoDeux.style.display = "none";}
		coursTrois.onmouseover = function(){infoTrois.style.display = "none";}
		// GO TO TOP
		mybutton.style.display = "block";
	  } else {
		ejectBtn.classList.remove("sticky-ejectBtn");
		menu.classList.remove("sticky-menu");
		barre.classList.remove("stickySidebar");
		main.classList.remove("sticky-main");		
		// remettre en place les info-bull ( sinon elles réaparaisse plus )
		coursUn.onmouseover = function(){infoUn.style.display = "block";}
		coursDeux.onmouseover = function(){infoDeux.style.display = "block";}
		coursTrois.onmouseover = function(){infoTrois.style.display = "block";}
		// inverse GO TO TOP
		mybutton.style.display = "none";
	  }
	} 
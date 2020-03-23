
   	// ouverture / Fermeture de la barre laterale
	var  barre =  document.getElementById("sidebarGauche") ;
	var  main  =  document.getElementById("main")

	function  openBarreGauche(){
	  barre.style.display  =  "block" ;
	  barre.style.width  =  "15%" ;	  
	  barre.style.marginLeft =  "0" ;
	  barre.style.borderRadius =  "0" ;

	  main.style.marginLeft  =  "17%" ;

      //main.style.width = "114%"; 
      main.style.width  =  "113%" ; 	  
	}

	function  closeBarreGauche(){

	  barre.style.display  =  "none" ;  / * barre.style.width = "0"; * /
	  main.style.marginLeft =  "0" ;
	  main.style.width =  "137%" ;	
	}





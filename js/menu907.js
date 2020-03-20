        
    function openNav() {
        document.getElementById("mySidepanel").style.width = "16%";
		document.getElementById("mySidepanel").style.left = "0.8%";
		//remonter le scroll à l'ouverture du menu
		/*
		include(top.js);
		topFunction();
		* ça ne marche pas: 
		* solution: i fo mettre topFunction() directement sur l'evenement(dans la page html)
		*/
    }

    function closeNav() {
        document.getElementById("mySidepanel").style.width = "0";
    }
   
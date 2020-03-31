<?php

   /************************************* ETAPE1:   COLLECT DES VALEURS ************************/
   
   // Etudiant
   $nom = $_GET["nom"];
   $prenom = $_GET["prenom"];
   $email = $_GET["email"];
   $promotion = $_GET["promotion"];
   // Appreciation sur les TD
   $commentTD = $_GET["commentTD"];
   
   // Evaluation1
   if(isset($_GET["checkbox1"]))        $presence1= $_GET["checkbox1"];
   if(isset($_GET["appreciation1"]))    $appreciation1 = $_GET["appreciation1"];

   // Evaluation2
   if(isset($_GET["checkbox2"]))        $presence2= $_GET["checkbox2"];
   if(isset($_GET["appreciation2"]))    $appreciation2 = $_GET["appreciation2"];


   /*********************************  ETAPE2:    TRAITEMENT DES VALEURS ************************/


   if(!empty($presence1))  {
   	     $presence1 = "OUI";            
   } else {
	    $presence1 = "NON";
	    $appreciation1 = "";
   }

   if(!empty($presence2))  {
   	     $presence2 = "OUI";            
   } else {
	    $presence2 = "NON";
	    $appreciation2 = "";
   }


   /********************************  ETAPE3: AFFICHAGE DES VALEURS ************************/ 

   echo '

   <table>
     <tr><th align="left" style="color:gray">Etudiant:</th><th align="left">'.$nom.' &emsp; '.$prenom.' </th></tr>
     <tr><td style="color:gray">Email:</td><td> '.$email.'</td></tr>
     <tr><td style="color:gray">Promotion:</td><td> '.$promotion.'</td></tr>
   </table><hr>
   
  
   <h4> 1&egrave;re Evaluation : </h4>
    <table>
     <tr><td style="color:gray">Pr&eacute;sence:</td><td> '.$presence1.'</td></tr>
     <tr><td style="color:gray">Appr&eacute;ciation:</td><td> '.$appreciation1.'</td></tr>
   </table><hr>


   <h4> 2&egrave;me Evaluation : </h4>
   <table>
     <tr><td style="color:gray">Pr&eacute;sence:</td><td> '.$presence2.'</td></tr>
     <tr><td style="color:gray">Appr&eacute;ciation:</td><td> '.$appreciation2.'</td></tr>
   </table><hr>
   
   <h4> Commentaires re&ccedil;u sur les TD : </h4> '.$commentTD.'

   ';

?>
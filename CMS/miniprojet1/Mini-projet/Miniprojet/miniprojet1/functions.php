<?php

/******************************************************** 
*  
* Feuilles de style 
* Exo : ajouter la feuille css/template.css
* 
**********************************************************/

wp_enqueue_style('template',get_template_directory_uri().'/css/template.css');


// AJOUT  MENU
function add_menu(){
	register_nav_menu('main_menu','Menu principal');
}
add_action('init','add_menu');

//AJOUT WIDGET 
function add_sidebar(){
	register_sidebar(array(
		'id' => 'search_engine',
		'name' => 'Barre Laterale',
		'description' => 'Apparait dans la Barre Laterale Gauche en haut.'
	));
}
add_action('widgets_init','add_sidebar'); // hook correspondant

function add_sidebar2(){
	register_sidebar(array(
		'id' => 'article_recent',
		'name' => 'Barre Laterale',
		'description' => 'Apparait dans la Barre Laterale Gauche en bas.'
	));
}
add_action('widgets_init','add_sidebar2'); // hook correspondant

function add_sidebar3(){
	register_sidebar(array(
		'id' => 'calendrier',
		'name' => 'Barre Laterale droit',
		'description' => 'Apparait dans la Barre Laterale Droite en haut.'
	));
}
add_action('widgets_init','add_sidebar3'); // hook correspondant

//CUSTOM FUNCTIONS
add_theme_support('custom-background');//COURS6: COULEUR DE FOND & IMAGE DE FOND
//add_theme_support('custom-header');//COURS6:En-têtes perso
//add_theme_support('custom-logo'); //  COURS6 : LOGO
 
?>



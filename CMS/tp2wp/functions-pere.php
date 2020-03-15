<?php
/******************************************************** 
*  
* Virer le <hr> du dernier article (dans la div blog ) 
* echo get_the_ID(); => l'article tout en bas a un ID = 1
* 
**********************************************************/
function ajoute_text_post($content){ 
     if (get_the_ID() > wp_count_posts()->publish) $texto = "<hr>";
	 return $content.$texto; 
}
add_filter( 'the_content' , 'ajoute_text_post' ); // hook filtre

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
		'id' => 'barre_laterale',
		'name' => 'Barre Laterale',
		'description' => 'Apparait dans la Barre Laterale a gauche.'
	));
}
add_action('widgets_init','add_sidebar'); // hook correspondant

//CUSTOM FUNCTIONS
add_theme_support('custom-background');//COURS6: COULEUR DE FOND & IMAGE DE FOND
add_theme_support('custom-header');//COURS6:En-têtes perso
//add_theme_support('custom-logo'); //  COURS6 : LOGO
 
?>



<?php
/*
if (!function_exists('wp_enqueue_style')) {

	 wp_enqueue_style('template',get_template_directory_uri().'/css/template.css');
}
*/
if (!function_exists('wp_enqueue_style')) {

  function theme_enqueue_styles(){  
	wp_enqueue_style(“masterhandi”, get_template_directory_uri().“/css/template.css”);
  }
  add_action(“wp_enqueue_scripts”, “theme_enqueue_styles”);

}

//CUSTOM FUNCTIONS
add_theme_support('custom-background');//COURS6: COULEUR DE FOND & IMAGE DE FOND
//add_theme_support('custom-header');//COURS6:En-têtes image
add_theme_support('custom-logo'); //COURS6 : En-têtes image
 
?>



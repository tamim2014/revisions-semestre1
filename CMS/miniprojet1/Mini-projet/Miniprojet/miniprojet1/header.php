<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="template.css">
    <title>Master Handi Mini projet CMS</title>
    <?php wp_head();  ?>
</head>

<body <?php body_class(); ?> >
<header>
	<div class="en-tete">
	        <h1> Master Handi Cours de CMS </h1>
	        <h2> Un site utilisant WordPress </h2>
	</div>
	
	<div class="menu"> 
	   <?php  wp_nav_menu(array('theme_location' => 'main_menu')); ?>		    
	</div>
</header>




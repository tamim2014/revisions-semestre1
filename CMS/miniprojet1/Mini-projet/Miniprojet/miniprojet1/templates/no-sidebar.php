<?php
/*
Template Name: No Sidebar Template
*/
?>

<?php get_header(); ?>
<div class="contenu">
        <div class="colonne_laterale">
            <aside>
                 <?php dynamic_sidebar('search_engine');?>
            </aside>
            
            <aside>
                 <?php dynamic_sidebar('article_recent');?>
            </aside>
        </div>
        <div class="colonne_contenu">
		        <?php
				  while(have_posts()){
				  	the_post(); ?>
				  	<h1> <?php the_title(); ?> </h1>
				  	<hr>
				  	<h2> Aliquam erat volutpat. Vestibulum vel semper arcu </h2>
				  	<p> <?php the_content(); ?> </p>
				  	<?php

				  }
				?>                             
        </div>
    </div>     
<?php get_footer(); ?>











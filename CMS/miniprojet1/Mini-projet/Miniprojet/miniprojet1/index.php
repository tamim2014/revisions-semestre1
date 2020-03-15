
<?php get_header(); ?>
<div class="contenu">
        <div class="colonne_laterale">
            <aside >
                 <?php dynamic_sidebar('search_engine');?>
            </aside>
            
            <aside>
                 <?php dynamic_sidebar('article_recent');?>
            </aside>
        </div>
        <div class="colonne_contenu">               
             <h1>
             <?php
             if(is_home()) {
             ?>
                 Bienvenue sur mon site!        
                 </h1><hr>
             <?php
             }                   
             while(have_posts()){
                     the_post();
            ?>
                     <h2 > <?php the_title(); ?></h2>
                     <p><?php the_content(); ?></p>
            <?php
                 }
            ?>                   
        </div>
        <div class="colonne_laterale">
        	<aside>
                 <?php dynamic_sidebar('calendrier');?>
            </aside>
        </div>
    </div>     
<?php get_footer(); ?>




 


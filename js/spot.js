	
	$(function(){
	  var winners_list = $('.winners li');
	  var ul_height = $('.winners').outerHeight();
	  $('.winners').append(winners_list.clone());

	  var i = 0;
	  (function displayWinners(i){
		setTimeout(function(){
		  if( $('.winners').css('top') == (-1 * ul_height) + 'px'){
			$('.winners').css('top', '0');
		  }
		  var li_height = $(winners_list[i]).outerHeight();
		  $('.winners').animate({
			top: '-=' + li_height + 'px'}, 1000);
		  if( i == winners_list.length - 1){
			i = 0;
		  }else{
			i++;
		  }
		  displayWinners(i);
		  
		}, 3000);
	  })(i);
	  
	});

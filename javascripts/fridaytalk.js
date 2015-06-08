$(document).ready(function(){
	$( ".row" ).accordion({
		collapsible:true,
		active:false
	});

});
function lecturePage(){
		document.getElementById("lectures").innerHTML="";
		$("#lectures").append('<div class="episodes"></div>');
		$(".episodes").append('<div class="slideshare"></div>');
		$(".slideshare").append('<iframe src="http://www.slideshare.net/slideshow/embed_code/key/MAB4Va88G7cwK4" width="425" height="355" frameborder="0" marginwidth="0" marginheight="0" scrolling="no" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen> </iframe>');
		$(".episodes").append('<div class="summary"></div>');
		$(".summary").append('<h2>Full Lecture Summary</h2><p>The full summary of the lecture will go here.</p>');
		$(".episodes").append('<div class="authorimage"></div>');
		$(".authorimage").append('<img src="http://upload.wikimedia.org/wikipedia/commons/8/81/Dilma_Rousseff_-_foto_oficial_2011-01-09.jpg">');
	}
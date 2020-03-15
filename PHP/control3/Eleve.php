<?php

class Eleve
{
	private $que;//chaine
	protected $te;//entier

	public function __construct($que, $te){
        $this->que = $que;
        $this->te = $te;
	}

	public function getQue(){ return $this->que; }

	public function setTe($te){ $this->te = $te; }
		
	public function getTe(){ return $this->te; }
	
}
		
?>
<?php

class Reussite extends Eleve
{
	private $eteuq; //entier

	public function __construct($que, $te, $eteuq){
        parent::__construct();
        $this->eteuq = $eteuq;
	}

	public function victoire(){
		
		$eleve1 = new Eleve("toto",1);
		$te = $eleve1->getTe();
		
		return $te * $this->eteuq;
	}
}
	
?>
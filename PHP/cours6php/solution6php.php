<?php
class Compte
{
    private $prenom, $nom; 
    protected $solde ;
    
    public function __construct($prenom, $nom, $solde) {   
        $this->prenom = $prenom; $this->nom = $nom; $this->solde = $solde;             
    }
    // visualiserSolde
    public function __toString() {   
        return "Le nouveau  solde compte de $this->prenom est  " .
            "<b>".$this->solde."</b>" . " " . "<b>&#8364;</b>";
    }
}

class CompteClient extends Compte
{

    public function ajouter($montant) { $this->solde += $montant; }
    public function retirer($montant) { $this->solde -= $montant; }
}

$compte1 = new CompteClient("Andjib", "Ahamada", 300);
//AJOUT
echo '<h2>' . $compte1 . '</h2><br />';
echo ' Ajouter <b>250&#8364;</b>:<br />';
$compte1->ajouter(250);
echo $compte1 . '<br /><hr>';
//RETRAIT
echo '<h2>' . $compte1 . '</h2><br />';
echo ' Retrait <b>125&#8364;</b>:<br />';
$compte1->retirer(125);
echo $compte1 . '<br />';

?>
#Erreur (à placer avant émergence)

L’algorithme est un objet qui permet d’arriver à un résultat. Ce résultat est soit la réponse à un problème (Euclide, quelle est le plus grand commun diviseur entre ces deux nombres ?), soit le produit d’une série de manipulation (la recette de cuisine). Fondamentalement, il est donc un objet qui résout. 
Si ce résultat n’est pas forcément consistant ou prédictible, on n’en attend pas moins que l’algorithme *fonctionne*, c’est-à-dire qu’il produise le résultat pour lequel il a été conçu. Dans le cas contraire, l’algorithme est inexploitable, *cassé*.
L’erreur n’est donc pas souhaitable dans une pratique algorithmique classique.

// notre vie entre les mains de l’algo
// l’industrie du logiciel (qui repose en grande partie sur l’algorithme), alloue un gros budget à l’erreur
// débuggage


Pour éviter toute confusion, Alan Turing souligne cependant la nécessité de distinguer deux types d’erreur.
> « The claim that "machines cannot make mistakes" seems a curious one. [...] It seems to me that this criticism depends on a confusion between two kinds of mistake, We may call them "**errors of functioning**" and "**errors of conclusion**". [...] In philosophical discussions one likes to ignore the possibility of such errors; one is therefore discussing "abstract machines." These abstract machines are mathematical fictions rather than physical objects. By definition they are incapable of errors of functioning. In this sense we can truly say that "machines can never make mistakes." Errors of conclusion can only arise when some meaning is attached to the output signals from the machine. »




Pour éviter toute confusion sur le discours algorithmique, Alan Turing souligne la nécessité de distinguer deux types d’erreur : erreur de fonctionnement et erreur de conclusion (**citation**).
Dans le contexte des machines de Turing, l’erreur de fonctionnement est mécanique ou électrique, et force la machine à se comporter autrement qu’initialement prévu. C’est l’anecdote du « *bug* », littéralement une mite qui s’est glissé dans un transistor d’un ordinateur, provoquant des erreurs de fonctionnement.

« It is claimed that the interrogator could distinguish the machine from the man simply by setting them a number of problems in arithmetic. The machine would be unmasked because of its deadly accuracy. » — Turing
Qu’en est-il d’algorithmes spécifiquement conçus pour faire des erreurs ?


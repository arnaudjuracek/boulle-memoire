#Boucle


Définir l’algorithme comme une suite d’instructions permettant d’arriver à un résultat, c’est donner une vision séquentielle, linéaire de son fonctionnement. Bien que Knuth (//cf fin « 01—algo ») souligne au travers de sa propre définition la nécessité de finitude (« Un algorithme doit toujours se terminer après un nombre fini d’étapes. »), il est intéressant de questionner la possibilité d’un algorithme comportant un nombre infini d’étapes.
(//schémas d’algo linéaire, et linéaire avec nb étapes infini)
Si l’on défini la notion d’autonomie comme la faculté d’un être à agir selon ses propres choix, alors l’algorithme n’est pas autonome. En tant que que méthode explicite de production d’un résultat déterminé, l’algorithme est plutôt à considérer comme un objet d’intention : il est développé dans un but, et cristallise dans son être cette intention. Ainsi, plus le nombre d’étapes entre le point de départ (l’input) et l’arrivée (l’output) sera court, plus l’algorithme sera performant dans la résolution de l’intention qui justifie son existence.
Mais l’implication grandissante des algorithmes dans le cadre de l’automatisation de nos sociétés (chaînes de montages robotiques, assistants numériques personnels, voitures « auto-conduisantes »...) implique de leur offrir une forme d’autonomie : s’ils restent objet d’intention, cette intention ne réside plus la production d’un résultat unique et ponctuel, mais dans un fonctionnement déterminé.

C’est alors qu’intervient la notion de boucle.
Plutôt que de considérer l’algorithme comme une ligne droite dont l’arrivée est l’output, il convient de le représenter comme un circuit fermé dont l’output devient à son tour input : on parle alors de *closed loop feedback* (//petite comparaison à l’effet Larsen en tant que boucle fermée produisant un output ?). 
(//...schéma boucle, pseudo code d’un algorithme d’itération récursive (a = 0; a = a + 1;) avec légende décrivant son but et ouverture sur les algorithmes de listages de nombres premiers)
Ici, la réelle production de l’algorithme ne réside plus dans sa finitude, mais dans son fonctionnement (//boucle avec output collatéral). Arrêter l’exécution d’un tel algorithme, c’est alors arrêter sa production.

Lorsque Dominique Cardon choisi d’intituler son essai « à quoi rêvent les algorithmes », il illustre la tendance actuelle à l’humanisation de l’algorithme. Si l’on prête de plus en plus une forme de vie à ce qui n’est en définitif qu’une simple abstraction mathématique, c’est justement parce qu’en bouclant, les algorithmes modernes développent une forme d’autonomie, nous trompant sur leur réel mode d’existence.
Il convient alors de rappeler que cette autonomie n’est qu’illusoire : l’exécution algorithmique de l’intention qui justifie son existence ne fait pas —encore— intervenir de libre-arbitre : au contraire, elle est mécanique, déterministe.

Le propos tenu sur cette séparation de l’intention et de l’exécution nécessite alors de convoquer Sol LeWitt concernant sa vision de l’art conceptuel :
> « The artist's will is secondary to the process he initiates from idea to completion. [...] The process is mechanical and should not be tampered with. It should run its course." — Sol LeWitt: "Sentences on Conceptual Art." Art-Language 1,1 (May 1969).
Selon LeWitt, l’artiste conceptuel se doit de dissocier le procédé de création du procédé de conception. Ainsi l’intelligence créatrice devient-elle une intelligence de conception, et s’incarne dans l’intention ; l’exécution de cette intention ne nécessite pas la sensibilité de l’esprit, tout au plus celle de la main : l’existence de l’oeuvre est justifiée par le concept qui l’a produite, et l’oeuvre elle-même, en tant que production, n’est que la cristallisation de ce concept. 
Ainsi lorsque Roman Opalka décide en 1965 de vouer le restant de son existence à la production de ses *Détails*, il défini une méthodologie de production d’une intention : //explication et analyse sur 2-3 phrases.
Peut-on alors considérer Opalka, et peut-être chaque artiste conceptuel, comme une machine exécutant les algorithmes dont ils sont leurs propres auteurs ? (//mal dit ?)

> « The things I want to show are mechanical. Machines have less problems. I'd like to be a machine, wouldn't you? » — Andy Warhol. (In: David Bourdon: Warhol. New York: Harry N. Abrams, 1989, p. 140.)

> « Ce qui distinguera toujours le fonctionnement de l'homme et celui des machines, même les plus intelligentes, c'est l'ivresse de fonctionner, le plaisir. Inventer des machines qui aient du plaisir, voilà qui est heureusement encore au delà des pouvoirs de l'homme. » —Jean Baudrillard, Le xérox et l'infini, 1987




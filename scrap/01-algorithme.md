#01 — Algorithme

Le terme d’ « Algorithme » est dérivé du nom d’Al-Khwarizmi, un mathématicien et savant perse du IX° siècle réputé pour avoir permis le développement de l’algèbre en occident. Son essai, « On the Calculation with Hindu Numerals » (825 AD) sera traduit en Latin « Algoritmi de numero Indorum », littéralement « Algorithmes des nombres Indiens ».
Étymologiquement comme historiquement, l’algorithme prend ainsi sa place dans le domaine des mathématiques et de l’algèbre, et défini alors un système logique de calculs. Contrairement à l’arithmétique qui s’intéresse à l’étude des nombres et à leur combinaison par des opérations (addition, soustraction, multiplication et soustraction), l’algorithmique concerne la décomposition systématique de calculs complexes en petites opérations. En proposant une méthode objective et exhaustive permettant la manipulation complexe de nombre, l’algorithme devient ainsi un outil de désambiguïsation de concepts mathématiques complexes : il rend les choses moins ambigües, les clarifie pour mieux les saisir.
(//image de l’algorithme d’euclide du PGCD)

Un algorithme est donc une suite d’instructions non-ambigües décrivant les étapes nécessaires pour arriver à un résultat ou pour résoudre un problème. George Boolos (//nbp : 1940—96, philosophe et mathématicien américain) défini pour sa part l’algorithme comme un ensemble d’instructions qui « sont données de façon bien explicite, sous une forme qui puisse être utilisée par une machine à calculer ou par un humain qui est capable de transposer des opérations très élémentaires en symboles ». 

On cite souvent le métier à tisser Jacquard (1801)(//images) comme l’une des premières machines algorithmiques mécaniques, et il correspond effectivement à la définition donnée par Boolos : la machine est capable d’interpréter mécaniquement des instructions de tissage transcrites sur des cartes perforées, permettant ainsi sa programmation. Si ces instructions de tissages sont explicites pour la machine, elles ne le sont cependant pas forcément pour l’homme.
Cet exemple permet donc d’élargir l’application de l’algorithme aux machines et à la mécanique, mais plus important encore, il permet d’introduire la notion d’automatisation qui justifie aujourd’hui l’algorithmisation de nos machines.

Il convient alors d’enrichir notre définition de l’algorithme en y intégrant celle de Gérard Berry (//nbp : 1948—, chercheur français en science informatique) : 
« Un algorithme, c’est tout simplement une façon de décrire dans ses moindres détails comment procéder pour faire quelque chose. Il se trouve que beaucoup d’actions mécaniques, toutes probablement, se prêtent bien à une telle décortication. Le but est d’évacuer la pensée du calcul, afin de le rendre exécutable par une machine numérique (ordinateur, …). On ne travaille donc qu’avec un reflet numérique du système réel avec qui l’algorithme interagit. »

En « évacuant la pensée du calcul », l’algorithme permet d’évacuer l’implication de l’homme de son exécution, et nous offre la possibilité d’automatiser un grand nombre de processus qui jusque-là nécessitaient l’intervention humaine.

Dans les années 50, la complexité grandissante du monde moderne pousse à la création de nouvelles machines capables d’une grande puissance de calcul. La Seconde Guerre mondiale et les enjeux en cryptographie sonnent alors le début d’une nouvelle ère pour l’algorithme. Les travaux d’Alan Turing sur le décryptage des messages échangés par l’Axe façonne une nouvelle forme de machine algorithmique, capable de résoudre efficacement des opérations complexes là où l’Homme n’en est plus capable.

Aujourd’hui les algorithmes permettent le fonctionnement de tous les dispositifs numériques que nous pouvons côtoyer. Le GPS utilisé pour se rendre d’un point A à un point B embarque par exemple un très grand nombre d’algorithmes, chacun développé pour résoudre une tâche précise : établir un protocole de communication avec plusieurs satellites, calculer en fonction du temps de réponse la distance par rapport à ces satellites, trianguler ces distances pour trouver sa localisation, puis établir l’itinéraire le plus court de la position actuelle à sa destination. Le tout en l’espace de quelques micro-secondes et sans intervention humaine nécessaire. 
Ces algorithmes fonctionnent en choeur dans un système autonome, où l’homme n’est plus opérateur mais utilisateur.

Citons pour finir Donald Knuth (1938—, informaticien et mathématicien américain) et sa définition des cinq propriétés élémentaires d’un algorithme :
+ finitude : 
	+ « Un algorithme doit toujours se terminer après un nombre fini d’étapes. »
+ définition explicite : 
	+ « Chaque étape d’un algorithme doit être définie précisément, les actions à transposer doivent être spécifiées rigoureusement et sans ambiguïté pour chaque cas. »
+ entrées : 
	+ « ... des quantités qui lui sont données avant qu’un algorithme ne commence. Ces entrées sont prises dans un ensemble d’objets spécifié . »
+ sorties : 
	+ « ... des quantités ayant une relation spécifiées avec les entrées. »
+ rendement : 
	+ « ... toutes les opérations que l’algorithme doit accomplir doivent être suffisamment basiques pour pouvoir être en principe réalisées dans une durée finie par un homme utilisant un papier et un crayon. »



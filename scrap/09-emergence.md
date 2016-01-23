#09 — émergence


En théorie des systèmes, l’émergence est le principe selon lequel des propriétés nouvelles peuvent spontanément apparaître des interactions entre les différents éléments constituants d’un système. Edgar Morin (//nbp « introduction à la pensée complexe ») explique le concept d’émergence par l’étude d’une tapisserie comme d’un système complexe : « prenons une tapisserie contemporaine. Elle comporte des fils de lin, de soie, de coton, de laine, aux couleurs variées. Pour connaître cette tapisserie, il serait intéressant de connaître les lois et les principes concernant chacun de ces types de fil. Pourtant, la somme des connaissances sur chacun de ces types de fil entrant dans la tapisserie est insuffisante pour, non seulement connaître cette réalité nouvelle qu’est le tissu, c’est-à-dire les qualités et les propriétés propres à cette texture, mais, en plus, est incapable de nous aider à connaître sa forme et sa configuration ».
L’émergence, c’est donc la rationalisation de l’idée qu’un système complexe est plus que la somme de ses parties.

Dans la mesure où l’algorithme est à considérer comme un système complexe (//nbp cf « 03 — Code »), il convient alors de s’interroger sur sa capacité à développer spontanément des propriétés émergentes.

En 1970, le mathématicien John Conway (//nbp bio) imagine et conçoit *le jeu de la vie* (« The Game of Life »), un « automate cellulaire » capable de simuler des comportements complexes. Ce modèle mathématique est basé sur un algorithme très simple : 
+ sur une grille en deux dimensions de taille infinie, se trouvent des cases, ou « cellules » ; 
+ ces cellules peuvent être dans deux états : « vivant » (la case est noire, pleine), et « mort » (la case est blanche, vide) ; 
+ le passage d’un état à l’autre est dicté par les deux conditions suivantes : 
	+ si une cellule est vivante et entourée par deux ou trois autres cellules vivantes, alors elle reste en vie ; sinon, elle meurt
	+ si une cellule est morte mais entourée par deux ou trois autres cellules vivante, alors elle naît ; sinon, elle reste morte
En prenant un état de la grille initial avec une répartition aléatoire de cellules « vivantes » et de cellules « mortes » et en faisant boucler l’algorithme, on observe alors ce qu’il se passe. À l’échelle d’une cellule, on reconnaît effectivement le comportement déterminé par l’algorithme à chacune de ses itérations. À l’échelle macroscopique de la grille par contre, où l’on peut appréhender d’un seul regard des centaines de cellules, on découvre alors des motifs émergents : certains groupes de cellules semblent se déplacer en diagonale, d’autres restent statiques et finissent par mourrir, d’autres encore se déplacent de façon erratique jusqu’à s’arrêter pour commencer à produire de nouvelles cellules, qui à leur tour se déplaceront vers de nouveaux groupes pour créer de nouveaux motifs...
(//plein de schémas, avec renvoi à des vidéos et des animations, en attendant vous pouvez aller sur la page wikipédia du « game of life »)
Observer une variation du *jeu de la vie*, c’est alors appréhender toute la complexité qui peut naître d’un algorithme aussi simple que celui défini par Conway. Si ce modèle mathématique d’ « automate cellulaire » sert aujourd’hui de support aux théories du chaos, de l’entropie et des systèmes complexes, il est ici intéressant parce qu’il ouvre la production algorithmique à un nouveau concept : l’émergence.

« In algorithmic art in the true sense of that word, the artwork is the algorithm. The artistic value of an algorithm is not necessarily purely conceptual, however. Algorithmic art often bridges (or short-circuits) the gap between the conceptual and the "retinal", when the observer is confronted with a surprising or puzzling relation between the algorithm and its visual output – for instance, when a simple procedure yields a complex result, or when a seemingly random process creates striking regularities. This is the art of "emergence": to explore the discrepancies between what is programmed and what is observed; to initiate the "spontaneous" generation of form out of iterated local interactions. » — Remko Scha

Vu en ces termes, la production algorithmique n’est alors pas forcément vouée à la cristallisation d’une intention. Si son exécution reste mécanique, la production qui en découlera pourra par ses qualités émergentes surprendre son créateur. Le concept d’émergence appelle alors à l’utilisation de l’algorithme en tant qu’un nouveau procédé de création, qui cloisonne d’abord les notions d’intentions et d’exécution (Sol LeWitt), avant de s’en détacher complètement pour arriver à une production dont son concepteur n’est plus seulement auteur, mais également spectateur.

« Machines take me by surprise with great frequency. » — Alan Turing

Il convient pour finir de re-placer le concept d’émergence dans le domaine où il est initialement apparu : celui de la biologie. 
Si l’on considère un organisme vivant comme un système de molécules, et l’intégralité de ses comportements comme le résultat des interactions entre les molécules de ce système, alors on peut considérer la vie elle-même comme une propriété émergente d’un tel système. C’est quelque part ce que tend à modéliser Conway et son *jeu de la vie*.
Il convient alors de poser une dernière question : peut-on appréhender l’algorithme comme un objet à partir duquel peut apparaître spontanément, de façon émergente, une forme de vie ?


(// à placer en double page annexe)
En établissant de nouveaux protocoles de création, algorithmiques et computationnels, il convient alors de questionner de nouvelles formes de productions émergentes, issues de systèmes dynamiques. C’est ce que proposent au travers d’un manifeste le collectif du *Conditionnal Design* : 
> « Through the influence of the media and technology on our world, our lives are increasingly characterized by speed and constant change. We live in a dynamic, data-driven society that is continually sparking new forms of human interaction and social contexts. Instead of romanticizing the past, we want to adapt our way of working to coincide with these developments, and we want our work to reflect the here and now. We want to embrace the complexity of this landscape, deliver insight into it and show both its beauty and its shortcomings. Our work focuses on processes rather than products: things that adapt to their environment, emphasize change and show difference. Instead of operating under the terms of Graphic Design, Interaction Design, Media Art or Sound Design, we want to introduce Conditional Design as a term that refers to our approach rather than our chosen media. We conduct our activities using the methods of philosophers, engineers, inventors and mystics. » — Conditional Design Workbook

// + Permutations de Brion Gysin à placer quelque part, soit ici en tant que produit algorithmique, soit plus trivialement dans la partie boucle



# Boîte Noire
## Préface



Parce que l’écriture de ce mémoire s’inscrit dans une démarche globale que j’ai débuté il y a quelques années, et que je compte poursuivre encore longtemps, j’aimerais l’introduire par un court point sur ma pratique personnelle.

Je code.
Depuis près de dix ans, plusieurs fois par semaine, j’allume un ordinateur, craque mes doigts et me plonge dans des lignes de code. 
Parfois, il s’agit de développer un jeu ou un site web. D’autres fois, de créer un programme capable de générer des formes, des images, des sons. Et quelque fois, simplement de m’amuser avec des concepts abstraits et logiques, pour le sport, pour la beauté du geste.
Parce que j’ai commencé relativement jeune et que c’est pour moi si présent, il m’est difficile de prendre du recul et d’expliquer *pourquoi* je code. Je pense que mes premiers contacts, à l’époque du collège, ont été motivés par la curiosité de comprendre comment ça marchait, curiosité qui a rapidement laissé la place à une fascination de la complexité que pouvait atteindre certains algorithmes, et de ce qu’ils étaient capable de produire.

// Il y a un rapport peu évident entre le code et l’algorithme. 
// (relation algo/code : « La pensée fait le langage en se faisant par le langage », écrivait Henri Delacroix. L’algorithme fait le code en se faisant par le code. + si le code est une porte d’entrée évidente pour l’apprentissage, l’appréhension et la compréhension de l’Algorithme, elle n’est pas forcément la seule.)
// (une petite définition de l’algo ?)


L’enjeu de cette introduction coulante de pathos est de soulever un point important : notre rapport à l’algorithme est très subjectif, et dépend de l’ascendance que nous avons sur lui. Je pense entretenir un rapport à l’algorithme basé sur la compréhension, ou en tout cas sur une volonté de le comprendre. L’introduction du très récent « À quoi rêvent les algorithmes » du sociologue Dominique Cardon pose quant à lui les bases d’un rapport plus général de l’individu à l’algorithme : 

> Un nouvel objet a fait son entrée dans nos vies : les algorithmes. Ce terme d’informatique a une signification bien plus large qu’on ne le croit. Comme la recette de cuisine, un algorithme est une série d’instructions permettant d’obtenir un résultat. À très grande vitesse, il opère un ensemble de calculs à partir de gigantesques masses de données (les « big data »). Il hiérarchise l’information, devine ce qui nous intéresse, sélectionne les biens que nous préférons et s’efforce de nous suppléer dans de nombreuses tâches.
> Nous fabriquons ces calculateurs, mais en retour ils nous construisent. Il n’est plus beaucoup de gestes quotidiens, d’achats, de déplacements, de décisions personnelles ou professionnelles qui ne soient orientés par une infrastructure de calculs. Quand elle vient soudainement à disparaître, comme lorsqu’une panne interrompt le trafic téléphonique, nous sommes désemparés. Pourtant, dès que nous pensons à la présence des calculateurs dans nos sociétés, nous maudissons la froide rationalité des machines et redoutons qu’elles ne prennent le pouvoir sur nous. Nous aimons leur opposer « notre » subtile sagacité. »  
— D. Cardon, « *À quoi rêvent les algorithmes* »

Cardon pose ici le paradoxe fondamental de la place de l’algorithme dans nos sociétés. Omniprésents, les algorithmes restent pourtant mystérieux. Insérés dans les systèmes de régence sociétales que sont la Bourse, les rapports socio-économiques ou encore Internet, ils appareillent orientent nos décisions et justifient des choix politiques. Pourtant, nous interrogeons leurs effets sans examiner leur fabrication ni leur fonctionnement.

Et c’est à ce moment qu’il convient d’aborder le titre de ce mémoire et l’enjeu qu’il soulève. Une boîte noire, c’est une façon de représenter un système sans considérer son fonctionnement. C’est un terme que l’on doit au mathématicien Norbert Weiner, qui théorise le concept dans « Cybernétique et société » en 1948. Le terme naît durant la seconde guerre mondiale du besoin en cryptologie de pouvoir étudier des dispositifs de cryptages militaires ennemis sans connaître leur fonctionnement : l’analyse des relations entre les entrées (le message à crypter) et les sorties (le message crypté) de ces boîtes noires permet la compréhension, et possiblement le décryptage, de leur fonctionnement.
Aujourd’hui, le concept de boîte noire permet aux théoriciens des systèmes et aux sociologues d’assumer l’analyse de systèmes complexes sans en connaître ou en décrire leur fonctionnement. Les algorithmes en font partie.

Pour autant, encastrer l’Algorithme dans une boîte noire ne permet pas de réellement comprendre sa place dans nos sociétés. Comme l’explique Cardon en parlant de son livre, nous avons aujourd’hui une sorte d’attitude de repli en se disant qu’après tout, puisque nous sommes incapable de comprendre ces boîtes noires, de les *ouvrir*, autant finalement les laisser faire pour nous, en espérant qu’elles fassent au mieux.

Je partage cependant son avis : il ne faut pas se laisser intimider, et chercher au contraire à ouvrir ces boîtes noires, aller chercher les algorithmes qui y habitent, et essayer de les décomposer, de les **disséquer** afin de les comprendre de *l’intérieur*.

Ne vous laissez donc pas tromper par son titre : si ce mémoire parle de boîte noire, c’est pour prendre conscience du phénomène d’élusion du fonctionnement de l’Algorithme, et l’importance de ne pas simplement s’arrêter à l’analyse de ses entrées et sorties, mais bien de donner à voir ses mécanismes internes, et les notions fondamentales qu’il soulève.
« 
Et c’est là la démarche que je souhaite mener au travers de ce mémoire : offrir une analyse de ce qui fait d’un algorithme un algorithme, et étudier les concepts clefs ainsi que les questions qu’ils soulèvent : le principe de boucle, d’itérations, le rapport entrées/sorties, mais aussi l’erreur, l’aléatoire...


// analogie forme du mémoire / forme du code, pertinence d’un plan systémique


L’enjeu est donc d’offrir une appréhension de l’abstraction mathématique qu’est l’Algorithme. Mais parce que mon algorithme est le compagnon d’une démarche de création, je souhaite en partager la vision sensible que j’en ai. Ou plutôt, je souhaite partager la relation paradoxale que j’entretiens avec lui.

Le sensible c’est la confusion, disait Descartes. Et je me suis développé autour de cette idée que notre monde, nos relations, toute la complexité du réel et de notre Humanité pouvait être algorithmisée, et que ce faisant tout deviendrai plus simple. Pour autant, ma pratique du code m’oriente vers la création de systèmes de plus en plus sensibles et intuitifs, prenant racines dans l’art conceptuel et la sensibilité Humaine.

Si l’enjeu est donc toujours d’offrir cette appréhension de l’objet mathématique qu’est l’Algorithme, il s’agit toutefois de le faire par le bais de la sensibilité. Et de poser la problématique : peut-on esthétiser l’Algorithme ?
#Dominique Cardon — À quoi rêvent les algorithmes : Nos vies à l’heure des *big data*

##Passage à France Culture — La grande table
> Il ne faut pas se laisser intimider, c’est vraiment ma position. Nous avons aujourd’hui une sorte d’attitude de repli en se disant, effectivement, ces boîtes noires, je suis incapable de les comprendre, ou de les ouvrir, et finalement je vais les laisser faire pour moi, en espérant qu’elles font au mieux pour moi.
> La nouvelle culture numérique dans laquelle il faut qu’on entre, et dans laquelle il y a de la pédagogie, de l’éducation, et un rapport critique, c’est pas de comprendre les réseaux Bayésiens naifs, ni les chaînes de Markov ni les algorithmes compliqués, mais c’est d’avoir suffisamment de compréhension sur ce qu’ils essayent de nous faire faire, sur la manière dont ils travaillent. J’ai essayé de le faire de la façon la plus pédagogique et la plus simple possible pour qu’on puisse entrer dans un débat dans lequel on essaye de comprendre de l’intérieur ce qu’essayent de nous faire faire ces systèmes calculatoires plutôt que de les critiquer de l’extérieur, en réanimant cette chose que les sociologues des sciences et des techniques sont toujours un petit peu réticents à cette idée du partage entre l’humain et la machine ; nous formons couple avec elle, elle s’est inscrite dans nos vies, elle est un outil cognitif, intellectuel constant dans plein de nos activités. Et donc d’essayer d’éviter cette idée que les machines prennent notre place ou nous prenons la place des machines. D’essayer plutôt de comprendre dans la relation que nous avons avec ces machines, on peut essayer de les comprendre, de les décoder, et surtout aussi de leur proposer de calculer autrement, de faire autrement, et d’avoir un rapport stratégique avec elles. Et quand on regarde les usages, les utilisateurs ne sont pas si dociles et naïfs face aux artefacts techniques qui cherchent à les conduire et à la guider.
— France culture, 9’32’’

> La vocation du livre est pédagogique, c’est-à-dire qu’il ne faut pas voir le numérique comme un tout, mais le décomposer pour voir comment ses différentes parties interagissent avec nos vies. Décomposer les variables autour desquelles la « salade algorithmique » se compose. Il y a un enjeu là-dessus, qui est effectivement important : pour bien critiquer, il faut être capable d’entrer dans ces systèmes pour les comprendre. Ce qu’il ne faut pas dire qu’il faut coder en Python, ou être statisticien expert, mais entre les deux, il y a une zone de langage et d’exploration critique dans laquelle il faut s’aventurer réellement.
> Être en position de réflexion face à ces usages, et être capable de les décoder.
> On imagine toujours une sorte de docilité passive de l’utilisateur, toujours mené par le haut au travers des prescriptions qui lui sont faites.
— France culture, 17’00’’


##Introduction — Comprendre la révolution des calculs


> Un nouvel objet a fait son entrée dans nos vies : les algorithmes. Ce terme d’informatique a une signification bien plus large qu’on ne le croit. Comme la recette de cuisine, un algorithme est une série d’instructions permettant d’obtenir un résultat. À très grande vitesse, il opère un ensemble de calculs à partir de gigantesques masses de données (les « big data »). Il hiérarchise l’information, devine ce qui nous intéresse, sélectionne les biens que nous préférons et s’efforce de nous suppléer dans de nombreuses tâches. **Nous fabriquons ces calculateurs, mais en retour ils nous construisent.**
> Il n’est plus beaucoup de gestes quotidiens, d’achats, de déplacements, de décisions personnelles ou professionnelles qui ne soient orientés par une infrastructure de calculs. Quand elle vient soudainement à disparaître, comme lorsqu’une panne interrompt le trafic téléphonique, nous sommes désemparés. Pourtant, dès que nous pensions à la présence des calculateurs dans nos sociétés, nous maudissons la froide rationalité des machines et redoutons qu’elles ne prennent le pouvoir sur nous. Nous aimons leur opposer « notre » subtile sagacité.  
— p.7


> Calculs algorithmiques embarqués à l’intérieur des interfaces numériques.  
— p.10


> À très grande vitesse, un nombre croissant de domaines — la culture, le savoir et l’information, mais aussi la santé, la ville, les transports, le travail, la finance et même l’amour et le sexe — sont désormais outillés par des algorithmes. Ils organisent et structurent les informations, aident à prendre des décisions ou automatisent des processus que nous avions l’habitude de contrôler nous-mêmes.  
— p.11


> Omniprésents, ces calculs restent pour nous mystérieux. Ils orientent des décisions, appareillent des processus automatiques et justifient des choix politiques, mais nous interrogeons leurs effets sans examiner leur fabrication. Quelles sont les données qui servent au calcul ? Comment l’information a-t-elle été quantifiée ? quels sont les principes de représentation qui animent le modèle statistique mis en oeuvre pour classer tel objet plutôt que tel autre ? Qui pilote le codage des calculs et quels sont ses objectifs ?
> Habités par un sentiment d’incompétence, nous préférons ignorer les conditions de fonctionnement de la société des calculs, en laissant les clés aux statisticiens, aux informaticiens et aux économètres. La complexification des modèles algorithmiques mis en oeuvre dans les nouvelles infrastructures informationnelles contribue à imposer le silence à ceux qui sont soumis à leurs effets. Elle désarme aussi ceux qui entreprennent de critiquer l’avènement de la froide rationalité des calculs, sans chercher ) en comprendre le fonctionnement. Par facilité autant que par ignorance, la critique du nouvel empire des calculs s’est réfugiée dans une pseudo-opposition entre les « humains » et les « machines ». Elle dénonce confortablement la rationalisation néolibérale du monde, la tyrannie de l’évaluation ou les accidents automatisés du *high-frequency trading*.  
— p.12-13, « Ouvrir la boîte noire »


> Ce livre ne propose pas de critiquer les algorithmes de l’extérieur, en en faisant les reflets des intérêts de leurs concepteurs, mais de comprendre de l’intérieur la manière dont ils produisent des effets (plus ou moins critiquables) sur nos sociétés.  
— p.15-16, « Ouvrir la boîte noire »


##Thèse
> La thèse de ce livre est que, si les logiques de personnalisation s’installent aujourd’hui dans nos vies, c’est parce qu’elles calculent une forme nouvelle du social, la société des comportements, où se recompose la relation entre le centre de la société et des individus de plus en plus autonomes.  
— p.16


##Quatre familles de calcul numérique

> Pour justifier le développement de ces outils prédictifs, les promoteurs des *big data* ont entrepris de disqualifier la sagesse et la pertinence des jugements humains. Les individus, soutiennent-ils, ne cessent de faire des erreurs d’évaluation. Ils manquent de discernement, font des estimations systématiquement trop optimistes, anticipent mal les effets futurs en préférant toujours le présent, se laissent déborder par leurs émotions, s’influencent mutuellement et ne raisonnent pas de façon probabiliste.   
— p.34


> Les coulisses du marché de la donnée publicitaire constituent un monde opaque qui entretient une discrétion délibérée, afin de ne pas susciter l’hostilité du public. Les prospères entreprises qui dominent cet univers sont inconnues du grand public.  
— p.37



##La révolution dans les calculs

> Les catégories parviennent moins bien à représenter des individus qui se singularisent de plus en plus ; les corrélations statistiques ne vont plus de la cause vers la conséquence, mais remontent des conséquences vers une estimation des causes probables.  
— p.39


> C’est précisément pour faire droit à cette revendication de singularité qu’un vaste processus de réinvention des techniques statistiques s’est mis en branle pour calculer la société sans catégoriser les individus. [...] Désormais, assurent les promoteurs des nouveaux calculs, il va être possible de connaître avec précision les destins individuels et de s’adresser aux individus en s’affranchissant de la solidarité collective.  
—p.46


> En se mathématisant, le calcul économétrique individualise les données placées en entrée des modèles, en s’efforçant de les rendre les plus fines et univoques possible. Il se méfie des catégories trop englobantes qui risquent de polluer les calculs, de créer des explications tautologiques et de laisser transpirer des présupposés politiques et sociaux.  
—p.46



##Calculer au plus près

> La logique de personnalisation renforcée dans laquelle sont entrées les actuelles techniques est une conséquence de l’individualisation expressive qui accompagne le développement des usages du numérique. Dans les sociétés hiérarchiques où l’accès à l’espace public était restreint, il était facile de parler au nom des individus au moyen de catégories qui les représentaient. [...] Alors que le web a ouvert à tous le droit de prendre la parole en public, le monopole exercé par les représentants sur la description de la société a éclaté et, avec lui, les catégories qui leur servaient à faire parler les autres. La libération des subjectivités ouverte par l’espace pubic numérique a permis aux individus de s’autoreprésenter. [...] Les patients ne veulent plus être réduits à leur maladie, les clients à leurs achats, les touristes à leurs trajets, les militants à leur organisation, les spectateurs au silence, etc.  
—p.47


> Aux variables stable,s pérennes et structurantes, qui fixaient les objets statistiques dans des catégories, les algorithmes numériques préfèrent *capturer des événements* (un clic, un achat, une interaction, etc) qu’ils enregistrent à la volée pour les comparer à d’autres événements, sans avoir à procéder à une catégorisation. Plutôt que des variables « lourdes », ils cherchent à mesurer des signaux, des conduites, des actions, des performances.  
— p.49


##Des machines « statistiques »

> Nous sommes habités par l’idée anthropomorphe que les machines calculatoires seraient intelligentes et que leurs concepteurs seraient parvenus à glisser un esprit à l’intérieur de leurs mécanismes. Cette conception nourrit nos représentations et nos craintes. De HAL, l’ordinateur fou de *2001, l’Odyssée de l’espace*, aux « précogs mutants » de *Minority Report*, qui prédisent un crime avant qu’il ait eu lieu, elle est constamment alimentée par l’imaginaire de la science-fiction. Pourtant, dans les laboratoires de recherche, personne ne croit vraiment que les algorithmes aient ce type d’intelligence.
> Dans les années 1980, le programme de l’Intelligence artificielle (IA, visait à faire reproduire aux automates le raisonnement humain en les dotant de règles, de modèles cognitifs, d’ontologies et de syntaxes reproduisant la complexité des formes logiques et symboliques de la pensée. Ce programme a échoué dans les années 1990 pour de nombreuses raisons, dont la principale est l’incapacité des automates « intelligents » à interpréter l’infinie variété des situations et des contextes.  
— p.59

> Pour illustrer ce changement de paradigme [machines « intelligentes » deviennent « statistiques »], prenons le cas de la traduction automatique. Dans les années 1980, ingénieurs et linguistes ont cherché à mettre dans les programmes des règles de grammaire et de syntaxe abstraites, des dictionnaires de mots et de concepts (appelés « ontologies »), afin que les traducteurs automatiques puissent reproduire le raisonnement formel permettant le passaged ‘une langue dans une autre. En dépit d’efforts de recherche considérables, cette stratégie n’a fait faire à la traduction automatique que des progrès fort limités.
> IBM puis Google ont alors orienté le projet dans une direction différente. Au lieu de concevoir une machine au raisonnement abstrait, ils ont décidé de lui faire apprendre mot par mot, groupe de deux mots par groupe de deux mots, puis de trois mots, etc., les correspondances entre deux textes déjà traduits par d’autres, comme l’immense corpus réalisé par les traducteurs humains des instituions européennes. La machine ne traduit pas : elle calcule l’estimation statistique de la meilleure traduction de ces deux (trois, quatre, etc.) mots, en les comparant à toutes les autres traductions qu’elle a en mémoire.
> Pour « apprendre », l’ordinateur a donc besoin d’avaler le plus gros tas de textes possible et de leurs traductions dans les langues visées. La machine ne « comprend » rien de ce qu’elle fait, mais, en s’appuyant sur la masse considérable de données qui lui fournissent des milliers de contextes d’utilisation de différents sacs de mots, elle peut estimer les correspondances statistiques les plus probables dans une autre langue. La qualité de la traduction de Google Traduction est loin d’être optimale, mais ce changement de paradigme lui a permis de faire des progrès considérables.  
— p.59-60


> Mais ceci n’empêche pas de prendre en compte plusieurs théories dans la prédiction ni, surtout, de changer les pondérations affectées aux différentes hypothèses pour chaque profil et chaque contexte d’utilisation. Les méthodes non paramétriques ont ceci d’agnostique qu’elles ne figent pas la contribution de leurs variables, mais les révisent constamment en fonction des actions de l’utilisateur. Pour cette raison, il est vain de réclamer que soit levé le « secret » des algorithmes et plus utile de connaître le flux de données qui « entrent » dans la composition du calcul. Ceux qui les fabriquent ne savent pas eux-mêmes expliquer pour le calculateur a, dans ce contexte, retenu telle hypothèse plus que telle autre.  
— p.61
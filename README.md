# [ TP Gilded Rose ]
## Spécification de la Rose dorée (Gilded Rose) :

On a un systeme de differents elements qui ont chacuns trois attributs differents : Un nom, une qualité et egalement une date de valeur, ce qui leurs permet d'evoluer au fur et a meusure du temps.
Tous les éléments ont une valeur sellIn qui désigne la date de valeur / le nombre de jours restant pour vendre l'article.
Tous les articles ont une valeur quality qui dénote combien l'article est précieux.
À la fin de chaque journée, notre système diminue ces deux valeurs pour chaque produit.

-----------------

* Une fois que la date de péremption est passée, la qualité se dégrade deux fois plus rapidement.
* La qualité (quality) d'un produit ne peut jamais être négative.
* "Aged Brie" augmente sa qualité (quality) plus le temps passe.
* La qualité d'un produit n'est jamais de plus de 50.
* "Sulfuras", étant un objet légendaire, n'a pas de date de péremption et ne perd jamais en qualité (quality)
* "Backstage passes", comme le "Aged Brie", augmente sa qualité (quality) plus le temps passe (sellIn) ; La qualité augmente de 2 quand il reste 10 jours ou moins et de 3 quand il reste 5 jours ou moins, mais la qualité tombe à 0 après le concert.
* Nous avons récemment signé un partenariat avec un fournisseur de produit invoqué ("Conjured"). Cela nécessite une mise à jour de notre système :

-----------------

les éléments "Conjured" voient leur qualité se dégrader de deux fois plus vite que les objets normaux.
Si la date de valeur d'un objet Conjured est superieure ou egale a 0, alors il voit sa qualité diminuer de 2 a chaque passage en boucle et si la date est inferieure a 0, alors sa qualité diminuera de 4.

Juste une précision, un produit ne peut jamais voir sa qualité augmenter au-dessus de 50, cependant "Sulfuras" est un objet légendaire et comme tel sa qualité est de 80 et elle ne change jamais.

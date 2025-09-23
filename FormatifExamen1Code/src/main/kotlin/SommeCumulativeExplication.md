La raison pour laquelle le code ne fonctionnait pas est à cause du
tabEntiers[i] = 0. Avec cette ligne de code, la valeur à "i" est mise à 0
à chaque boucle. Lorsqu'on vient à faire le calcul, puisque tout est égal
à zéro la valeur qui est imprimée dans la console est de 0. En faisant 
une copie du tableau avant la boucle, on peut bel et bien faire le calcul
en additionnant la valeur du tableau modifié += la valeur du tableau copié.
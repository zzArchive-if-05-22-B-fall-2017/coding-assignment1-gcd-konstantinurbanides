/*Konstantin Urbanides 3BHIF
Realisierung des Stammbaumes*/
parent(adam, john).
parent(eve, john).
parent(eve, lisa).
parent(john, anne).
parent(john, pat).
parent(pat, jacob).
parent(carol, jacob).

/*Who is the parent of pat?
parent(X,pat).
Does lisa have a child?
parent(lisa,X).*/

/*Definition der Männer und Frauen male/1 female/1*/
male(adam).
male(john).
male(pat).
male(jacob).
female(eve).
female(anne).
female(lisa).
female(carol).

/*Definition der Grandparent-Regel grandparent/2*/
grandparent(X,Y):-parent(X,Z),parent(Z,Y).



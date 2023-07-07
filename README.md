Java Version : 8 ou + Tomcat Version : 10.0.4

Pré-requis: . Mettre toutes les classes dans le meme package . Les fonctions doivent retourner un objet ModelView et doivent etre annoter par @Url(lien="...") pour pouvoir etre accessible . Avec l'objet ModelView: - Utiliser la fonction setView("exemple.jsp") pour se rediriger vers la page exemple.jsp - Utiliser la fonction addItem("CLE", OBJECT) pour renvoyer l'objet 'OBJECT' , La recuperation de l'objet 'OBJECT' se fait par la fonction request.getAttribute("CLE") dans votre page jsp . Ajouter ce bout de code dans votre web.xml (modifier avec le package de vos classes) :
FrontServlet etu2069.framework.servlet.FrontServlet package ... package_modele FrontServlet / . Compiler vos classes avec l'option -parameters

Remarque :
. Si il y a des insertion à travers des formulaires le nom des champs dans le formulaire devrait correspondre aux noms des attributs de votre classe Exemple : Employer.java c
NOTER BIEN QUE DANS WAR.BAT LE PATH PRESENT SERONT MODIFIER EN FONCTION DE VOTRE REPERTOIRE LOCAL DONC N'OUBLIER DE MODIFIER LES PAF SI VOUS VOULER UILISER LA FRAMEWORK ET NOTER BIEN ICI LE TEST SE FAIT DANS NETBEANS ET UTILSER JAVA8

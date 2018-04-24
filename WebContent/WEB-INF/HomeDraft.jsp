<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="reset.css">
<link rel="stylesheet" href="Home.css">
<title>MyTube</title>
</head>
<body>
    <div id="nav-horiz" >
            <ol class="menu-horiz">
                    <li><a class="menu-horiz__item" href="">Menu</a></li>
                    <li><div class="menu-horiz__item" href="" id="recherche">

                            <form >
                            <input  placeholder="Rechercher" />
                            <input id="format-loupe" >

                            </form>

                            
                            </div></li>
                    <li><a class="menu-horiz__item" href="">Mettre en ligne</a></li>
                    <li><a class="menu-horiz__item" href="">Applications</a></li>
                    <li><a class="menu-horiz__item" href="">Paramètres</a></li>
                    <li><a class="menu-horiz__item" href="">SE CONNECTER</a></li>
            </ol>
    </div>
    <div id="nav-verti" >
        <ol class="menu-verti">
            <li><a class="menu-verti__item" id="accueil" href="">Accueil</a></li>
            <li><a class="menu-verti__item" href="">Tendances</a></li>
            <li><a class="menu-verti__item" href="">Historique</a></li>
            <li><a class="menu-verti__item" id="theBest" href="">LE MEILLEUR DE YOUTUBE</a></li>
            <li><a class="menu-verti__item" href="">Musique</a></li>
            <li><a class="menu-verti__item" href="">Sport</a></li>
            <li><a class="menu-verti__item" href="">Jeux Vidéo et autres</a></li>
            <li><a class="menu-verti__item" href="">Films</a></li>
            <li><a class="menu-verti__item" href="">Emissions télévisées</a></li>
            <li><a class="menu-verti__item" href="">Actualités</a></li>
            <li><a class="menu-verti__item" href="">En direct</a></li>
            <li><a class="menu-verti__item" href="">360° Video</a></li>
        </ol>
    </div>
    <section id="conteneur">
            <div class="ligne-video">
                <h1>Tendances</h1>
                <div class="element" >
                	<c:forEach items="${videoList}" var="item">
                	<div class="video">
                	<video src="${item.url}" autoplay poster="${item.capture}"></video>
                	
  					</div>
					</c:forEach>  
					  
                    <div class="video">
                        <video src="https://www.youtube.com/watch?v=PSLBKeZnPyE" autoplay poster="image1.jpg"></video>               
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?time_continue=1&v=NDrAng2nueI" autoplay poster="image2.jpg"></video>
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?v=sdlWIZSsmhs" autoplay poster="image3.jpg"></video>
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?v=5o4r1hlI5tI" autoplay poster="image4.jpg"></video>
                    </div>
                    <div class="video">                   
                    	<video src="https://www.youtube.com/watch?v=37StRy0LEbI" autoplay poster="image5.jpg"></video>
                    </div>
                </div>
            </div>
            <div class="ligne-title"> 
            	<c:forEach items="${videoList}" var="item">
                	<div class="video">
                		<h2>${item.title}</h2>
  					</div>
				</c:forEach> 
                    <%-- <h2>${titre1}</h2>
                    <h2>2 CHANSONS A ÉCOUTER EN MÊME TEMPS - Tai Reflections</h2>
                    <h2>RECETTES : 4 BREAKFAST IDEAS</h2>
                    <h2>LA PISCINE - PAROLE DE RATON LAVEUR</h2>
                    <h2>OrelSan - La pluie (feat. Stromae) [CLIP OFFICIEL]</h2> --%>
            </div>
        <div class="ligne-video">
            <h1 class="title">Recommandations</h1>
            <div class="element">

                   <div class="video">
                        <video src="https://www.youtube.com/watch?v=kWrRVh-cmAk" autoplay poster="image6.jpg"></video>               
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?v=zsuy9Aw-b38" autoplay poster="image7.jpg"></video>
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?time_continue=1&v=1z6CW5bduGg" autoplay poster="image8.jpg"></video>
                    </div>
                    <div class="video">
                    	<video src="https://www.youtube.com/watch?v=DwhR8lsPCxo" autoplay poster="image9.jpg"></video>
                    </div>
                    <div class="video">                   
                    	<video src="https://www.youtube.com/watch?v=BbT_Q23SSpc" autoplay poster="image10.jpg"></video>
                    </div>
            </div>
        </div>
        <!-- <div class="ligne-video">
            <h1 class="title">Videos mises en ligne récemment</h1>
            <div class="element" >   
                <div class="video">
                        <iframe class="format-video" src="https://www.youtube.com/embed/5VjC0KerJCI" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                </div>
                <div class="video">
                </div>
                <div class="video">
                </div>
                <div class="video">
                </div>
                <div class="video">
                </div>     
            </div>
        </div> -->
    </section>
</body>
</html>
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
                    <li><a class="menu-horiz__item" href=""><img id="logo"src="data:image/jpeg;base64,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" alt="logo MyTube"></a></li>
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
                	<video src="${item.url}" autoplay poster="C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image1.PNG"></video>
                	<!-- <video src="${item.url}" autoplay poster="${item.capture}"></video> -->
                	
  					</div>
					</c:forEach>  
					  
                    
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
                    <iframe class="format-video" src="https://www.youtube.com/embed/kWrRVh-cmAk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                </div>
                <div class="video">
                    <iframe class="format-video" src="https://www.youtube.com/embed/zsuy9Aw-b38" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                </div>
                <div class="video">
                    <iframe class="format-video" src="https://www.youtube.com/embed/1z6CW5bduGg" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                </div>
                <div class="video">
                        <iframe class="format-video" src="https://www.youtube.com/embed/DwhR8lsPCxo" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
                </div>
                <div class="video">
                        <iframe class="format-video" src="https://www.youtube.com/embed/BbT_Q23SSpc" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
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
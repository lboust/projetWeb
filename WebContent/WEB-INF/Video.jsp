<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>MyTube video player</title>
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="Video.css">
</head>
<body>
    <div id="nav-horiz" >
            <ol class="menu-horiz">
                    <li><a class="menu-horiz__item" href="">Menu</a></li>
                    <li><a class="menu-horiz__item" href=""><img id="logo"src="images/logoTitre"></a></li>
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
    <section id="conteneur">
            <div class="colonne-video">
                <div class="element" >    
                    <div>
                        <iframe class="format-video-main" src="https://www.youtube.com/embed/PSLBKeZnPyE" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>                          
                    </div>
                    <div class="title"> 
                            <h2>KENZO - KENZO WORLD</h2>
                    </div>
                    
                </div>
            </div>

            <div class="to-follow">
                <div id="following-video">
                        <p>A suivre</p>   
                    <c:forEach items="${videoList}" var="item">
                	<div class="video">
                	<video class="format-video" src="${item.url}" autoplay poster="${item.capture}"></video>
                	
  					</div>
					</c:forEach> 
            </div>

    </section>
</body>
</html>
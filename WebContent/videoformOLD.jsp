<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Form</title>
</head>
<body>
    <form action="" method="POST" id="video" enstype="application/x-www-form-urlencoded">
        <div>
            <label for="video-title">Title</label>
            <input type="text" name="title" id="title" value="">
        </div>
        <div>                
            <label for="video-url">Url</label>
            <input type="text" name="url" id="url" value="">
        </div>
        <div>                
            <label for="video-duration">Duration</label>
            <input type="text" name="duration" id="duration" value="">
        </div>
        <div>                
            <label for="video-publicationDate">Publication date</label>
            <input type="text" name="publicationDate" id="publicationDate" value="">
        </div>
        <div>                
                <label for="video-type">Type</label>
                <input type="text" name="type" id="type" value="">
            </div>
        <div>
        <div>                
                <label for="video-capture">Capture</label>
                <input type="text" name="capture" id="capture" value="">
        </div>
        <div>                
            <label for="comment-description" cols="30" rows="10">Description</label>
            <textarea name="description"  > </textarea>
        </div>
        <div>
            <input type="submit" value="Ajouter une video">
        </div>     

    </form>

    
</body>

</html>
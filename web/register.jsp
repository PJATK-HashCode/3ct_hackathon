
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <title>No Podaj Podaj</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

        .rame {
            height: 50px;
        }

        .element {
            margin-top: 5px;
            margin-left: 10px;
            padding-top: 10px;
            width: 34px;
            padding-bottom: 10px;
            height: 34px;
        }

    </style>
</head>
<body>

<header></header>

<script type="text/javascript">

    $(window).ready(function(){

        $.get("header.jsp", function(fileData){
            $('header').html(fileData);
        });

        // add footer.html into <footer>
        //$.get("footer.html", function(fileData){
        //  $('footer').html(fileData);
        //});
    });
</script>

<div class="container" style="margin-top: 50px;">
    <h2>Panel rejestracji</h2>
    <form class="form-horizontal" action="RegisterServlet">
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Imię:</label>
            <div class="col-sm-10 rame">
                <input type="text" class="form-control" style="width: 226px;" id="name"
                       placeholder="Podaj Imię" name="firstName">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Nazwisko:</label>
            <div class="col-sm-10 rame">
                <input type="text" class="form-control" style="width: 226px;" id="surname"
                       placeholder="Podaj Nazwisko" name="lastName">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd" style="padding-top: 15px;">Nick:</label>
            <div class="col-sm-10 rame" style="width: 226px;margin-top: 8px;margin-bottom: 8px;">
                <input type="text" class="form-control" style="width: 226px;" id="nickname" placeholder="Podaj nick" name="nick">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Telefon:</label>
            <div class="col-sm-10 rame" style="width: 226px;margin-top: 8px;margin-bottom: 8px;">
                <input type="number" class="form-control" style="width: 226px;" id="phone" placeholder="Podaj telefon"
                       name="phone">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Email:</label>
            <div class="col-sm-10 rame">
                <input type="email" class="form-control" style="width: 226px;" id="email" placeholder="Podaj email"
                       name="email">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Hasło:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" style="width: 226px;" id="pwd" placeholder="Wprowadź hasło"
                       name="password">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" style="width: 100px">Rejestruj</button>
                <a href="index.jsp" data-original-title="Anuluj" data-toggle="tooltip" type="button" class="btn btn-sm btn-danger element" style="padding-top: 8px;"><i class="glyphicon glyphicon-remove"></i></a>
            </div>
        </div>
    </form>
</div>

</body>
</html>

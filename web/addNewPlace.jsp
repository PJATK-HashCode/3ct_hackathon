
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
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
    <h2>Formularz rejestracji własnego obiektu</h2>
    <form class="form-horizontal" action="/action_page.php">
        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Nazwa obiektu:</label>
            <div class="col-sm-10 rame">
                <input type="text" class="form-control" style="width: 226px;" id="objName" placeholder="Podaj nazwę" name="pwd">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Adres obiektu:</label>
            <div class="col-sm-10 rame">
                <input type="text" class="form-control" style="width: 226px;" id="ojbStreet" placeholder="Podaj ulicę" name="pwd">
            </div>
        </div>


        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Kod pocztowy:</label>
            <div class="col-sm-10 rame">
                <input type="number" class="form-control" style="width: 100px;" id="objCode" placeholder="Podaj kod" name="pwd">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Miasto:</label>
            <div class="col-sm-10 rame">
                <input type="text" class="form-control" style="width: 226px;" id="objCity" placeholder="Podaj miasto" name="pwd">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd" style="padding-top: 15px;">Dane Twoje/firmy:</label>
            <div class="col-sm-10 rame" style="width: 226px;margin-top: 8px;margin-bottom: 8px;">
                <input type="text" class="form-control" style="width: 226px;" id="objDane" placeholder="Podaj nazwę" name="pwd">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Email:</label>
            <div class="col-sm-10 rame">
                <input type="email" class="form-control" style="width: 226px;" id="objEmail" placeholder="Podaj email" name="email">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Telefon:</label>
            <div class="col-sm-10 rame" style="width: 226px;margin-top: 8px;margin-bottom: 8px;">
                <input type="number" class="form-control" style="width: 226px;" id="objPhone" placeholder="Podaj telefon" name="pwd">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Przystosowanie boiska:</label>
            <div class="col-sm-10">
                Piłka nożna: <input type="checkbox" id="objCheckFootball" value="objCheckFootball" name="pwd"><br/>
                Koszykówka: <input type="checkbox" id="objCheckBasketball" value="objCheckBasketball" name="pwd"><br/>
                Siatkówka: <input type="checkbox" id="objCheckVolleyball" value="objCheckVolleyball" name="pwd"><br/>
                Pływanie: <input type="checkbox" id="objCheckSwimming" value="objCheckSwimming" name="pwd"><br/>
                Tenis: <input type="checkbox" id="objCheckTenis" value="objCheckTenis" name="pwd"><br/>
                Hokej: <input type="checkbox" id="objCheckHockey" value="objCheckHockey" name="pwd"><br/>
                Jazda figurowa: <input type="checkbox" id="objCheckIce" value="objCheckIce" name="pwd"><br/>
                Lekkoatletyka: <input type="checkbox" id="objCheckAthletics" value="objCheckAthletics" name="pwd"><br/>
                Unihokej: <input type="checkbox" id="objCheckUni" value="objCheckUni" name="pwd"><br/>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Godziny otwarcia:</label>
            <div class="col-sm-10">
                <textarea id="objText" cols="40" rows="5"></textarea>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Dodatkowe:</label>
            <div class="col-sm-10">
                Prysznice: <input type="checkbox" id="objCheckShower" value="objCheckShower" name="pwd"><br/>
                Szatnia: <input type="checkbox" id="objCheckChange" value="objCheckShower" name="pwd"><br/>
                Oświetlenie: <input type="checkbox" id="objCheckLight" value="objCheckShower" name="pwd"><br/>
                Darmowa woda: <input type="checkbox" id="objCheckWater" value="objCheckShower" name="pwd"><br/>

            </div>
        </div>




        <div class="form-group">

            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" style="width: 100px">Zgłoś</button>
                <a href="index.jsp" data-original-title="Anuluj" data-toggle="tooltip" type="button" class="btn btn-sm btn-danger element" style="padding-top: 8px;"><i class="glyphicon glyphicon-remove"></i></a>
            </div>
        </div>
    </form>
</div>

</body>
</html>

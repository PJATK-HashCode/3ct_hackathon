
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
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-bottom: 0;
        }

        .bgimg {
            background-image: url("bannerNPP.png");
            margin-left: 70px;
            margin-top: 70px;
            background-size: 100% 100%;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
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

<div class="jumbotron bgimg" style="height: 256px;">
    <div class="container text-center">
        <h1></h1>
        <p></p>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="panel panel-primary">
                <div class="panel-heading">ZNAJDŹ MIEJSCE DLA SIEBIE</div>
                <div class="panel-body"><img src="indeximg1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Kilka kliknięć dzieli Cię od uprawiania sportu na idealnym obiekcie sportowym!</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-danger">
                <div class="panel-heading">JESTEŚ WŁAŚCICIELEM HALI / BOISKA?</div>
                <div class="panel-body"><img src="indeximg2.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Udostępnij swoją miejscówkę innym i zacznij zarabiać.</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-success">
                <div class="panel-heading">SPRÓBUJ I ZOBACZ SAM!</div>
                <div class="panel-body"><img src="indeximg3.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Zaledwie kilka kliknięć dzieli Cię od pokopania w gałę!</div>
            </div>
        </div>


        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 1</p>
                    <img src="indexfieldicon.png" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej informacji</button>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="indexfieldicon.png" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="indexfieldicon.png" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="indexfieldicon.png" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="indexfieldicon.png" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="bird.jpg" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="col-sm-3">
                <div class="well">
                    <p>Pozycja nr 2</p>
                    <img src="bird.jpg" class="img-circle" height="55" width="55" alt="Avatar">
                </div>
            </div>
            <div class="col-sm-9">
                <div class="well">
                    <p>Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't.</p>
                    <button type="submit" class="btn btn-default" onclick="location.href = 'detailInformations.jsp';" style="width: 200px">Więcej infromacji</button>
                </div>
            </div>
        </div>


    </div>
</div><br>


<footer class="container-fluid text-center">
    <p>NoPodajPodaj Copyright</p>
    <form class="form-inline">Get deals:
        <input type="email" class="form-control" size="50" placeholder="Email Address">
        <button type="button" class="btn btn-danger">Sign Up</button>
    </form>
</footer>

</body>
</html>
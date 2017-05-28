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
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }
        .jumbotron {
            margin-bottom: 0;
        }

        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
        .wrappertop{
            position: fixed;
            top: 0;
            display:block;
            width:100%;
            margin:0;
            padding:0;
            text-align:left;
            word-wrap:break-word;
            z-index: 2;
        }
    </style>
</head>
<body>

<login></login>

<script type="text/javascript">

    $(window).ready(function(){

        // add header.html into <header>
        $.get("login.html", function(fileData){
            $('login').html(fileData);
        });

        // add footer.html into <footer>
        //$.get("footer.html", function(fileData){
        //  $('footer').html(fileData);
        //});

    });
</script>


<nav class="wrappertop navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            </button>
            <a class="navbar-brand" href="#">NoPodajPodaj</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.jsp">Strona główna</a></li>
                <li><a href="addNewPlace.jsp">Dodaj placówke</a></li>
                <li><a href="adminPanel.jsp">Panel Admina (hidden)</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a onclick="document.getElementById('id01').style.display='block'""><span onclick="document.getElementById('id01').style.display='block'" class="glyphicon glyphicon-user"></span> Zaloguj</a></li>
                <li><a href="register.jsp"><span class="glyphicon glyphicon-user"></span> Zarejestruj</a></li>
            </ul>
            <form class="navbar-form navbar-right" role="search">
                <div class="form-group input-group">
                    <input type="text" class="form-control" placeholder="Search..">
                    <span class="input-group-btn">
            <button class="btn btn-default" type="button">
              <span class="glyphicon glyphicon-search"></span>
            </button>
          </span>
                </div>
            </form>
        </div>
    </div>
</nav>
</body>
</html>
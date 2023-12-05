<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="assets/css/bootstrap.css">
<link rel="stylesheet" href="assets/css/style.css">
<!--Fonts-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kalam&display=swap" rel="stylesheet">
<!--Fonts End-->
<!--Icon-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!--Icon End-->
<!--JavaScript-->
<script src="assets/js/main.js"></script>
<!--JavaScript End-->
</head>
<body id="index-body">
    <div class="logo">
        <h1 class="logotxt">eCurrecyVault</h1>
        <div class="menu">
            <div class="menulinks">
                <i class="fa-solid fa-house"></i>
            </div>
        </div>
    </div>
    <div class="box">
        <div class="container">
            <div>
                <div class="shape1"></div>
                <div class="shape2"></div>
                <div class="shape3"></div>
                <div class="shape4"></div>
            </div>
            <div class="blur-panel">
                <div id="registerForm">
                    <h1 class="regtxt">Register</h1>
                    <form action="RegisterEmp">
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="id">
                            <label class="lbl">User Id</label>		
                        </div>
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="name">
                            <label class="lbl">User Name</label>		
                        </div>
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="password">
                            <label class="lbl">Password</label>		
                        </div>
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="contact">
                            <label class="lbl">Contact</label>		
                        </div>
                        <input class="btn regbtn" type="submit">
                        <div id="logForm" onclick="getLogin()">login</div>
                    </form>  
                </div>
                <div id="loginForm">
                    <h1 class="regtxt">Login</h1>
                    <form action="LoginEmp">
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="name">
                            <label class="lbl">User Name</label>		
                        </div>
                        <div class="input-container">
                            <input class="ip" type="text" required=""/ name="password">
                            <label class="lbl">Password</label>		
                        </div>
                        <input class="btn regbtn" type="submit">
                        <div id="regForm" onclick="getRegister()">Register</div>
                    </form>  
                </div>
            </div>
            </div>
        </div>

</body>
</html>
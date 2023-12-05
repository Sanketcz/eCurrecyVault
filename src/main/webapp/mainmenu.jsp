<%@page import="com.demo.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
               <div class="ATMmenu">
                    <h1 class="headtxt">Menu</h1>
                    <div class="showBalance" onclick="showSbaldiv()">
                        <h2>Show Balance</h2>
                        <div class="sbaldiv" id="sbaldiv">
                            <h3 class="headtxt divinhead">Account Balance</h3>
                            <h4 class="accbalamt"><i class="fa-solid fa-indian-rupee-sign"></i><%=request.getAttribute("balance") %></h4>
                        </div>
                    </div>
                    <% 
                    	HttpSession s=request.getSession();
                    	s.setAttribute("name", request.getAttribute("name"));
                    	s.setAttribute("password", request.getAttribute("password"));
                    %>
                    <div class="depositMoney" onclick="showDmnydiv()">
                        <h2>Deposit Money</h2>
                        <div class="dmnydiv" id="dmnydiv">
                            <h3 class="headtxt divinhead">Enter Amount</h3>
                            <form action="DepositMoney">
                                <div class="input-container inpdivin">
                                    <input class="ip" type="text"  name="dbal" required=""/>
                                    <label class="lbl">Enter here</label>		
                                </div>
                                <input class="btn btndivin" type="submit">
                            </form>
                        </div>
                    </div>
                    <div class="withdrawMoney" onclick="showWmnydiv()">
                        <h2>Withdraw Money</h2>
                        <div class="wmnydiv" id="wmnydiv">
                            <h3 class="headtxt divinhead">Enter Amount</h3>
                            <form action="WithdrawMoney">
                                <div class="input-container inpdivin">
                                    <input class="ip" name="wbal" type="text" required=""/>
                                    <label class="lbl">Enter here</label>		
                                </div>
                                <input class="btn btndivin" type="submit">
                            </form>
                        </div>
                    </div>
                    <div class="changePassword" onclick="showChpsdiv()">
                        <h2>Change Password</h2>
                        <div class="chpsdiv" id="chpsdiv">

                        </div>
                    </div>
                    <h3 class="usernm"><i class="fa-regular fa-user"></i> <%=request.getAttribute("name") %></h3>    
               </div>
            </div>
            </div>
        </div>

</body>
</html>
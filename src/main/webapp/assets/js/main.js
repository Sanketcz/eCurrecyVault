function getLogin() {

    document.getElementById("loginForm").style.display='block';
    document.getElementById("registerForm").style.display='none';
}
function getRegister() {

    document.getElementById("loginForm").style.display='none';
    document.getElementById("registerForm").style.display='block';
}
/*--------------------Menu divs hover click effects------------------------*/
function showSbaldiv() {
    document.getElementById("sbaldiv").style.display='block';

    document.getElementById("wmnydiv").style.display='none';
    document.getElementById("dmnydiv").style.display='none';
    document.getElementById("chpsdiv").style.display='none';
}
function showWmnydiv() {
    document.getElementById("wmnydiv").style.display='block';

    document.getElementById("sbaldiv").style.display='none';
    document.getElementById("dmnydiv").style.display='none';
    document.getElementById("chpsdiv").style.display='none';
}
function showDmnydiv() {
    document.getElementById("dmnydiv").style.display='block';

    document.getElementById("sbaldiv").style.display='none';
    document.getElementById("chpsdiv").style.display='none';
    document.getElementById("wmnydiv").style.display='none';
}
function showChpsdiv() {
    document.getElementById("chpsdiv").style.display='block';

    document.getElementById("wmnydiv").style.display='none';
    document.getElementById("sbaldiv").style.display='none';
    document.getElementById("dmnydiv").style.display='none';
}
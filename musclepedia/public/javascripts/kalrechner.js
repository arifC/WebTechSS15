function berechneKal(){
    var gewicht = document.getElementById("gewicht").value;
    var groesse = document.getElementById("groesse").value;
    var faktor = document.getElementById("faktor").value;
    var alter = document.getElementById("alter").value;

    var bedarf = 66.47 +13.7*gewicht+5*groesse-6.8*alter;
    bedarf= bedarf*faktor;
    $("#kalerg").html("Der Bedarf ist:" + bedarf);
}

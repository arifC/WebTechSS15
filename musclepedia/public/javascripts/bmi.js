function bmirechnen(){
    var gewicht = document.getElementById("gewicht").value;
    var groesse = document.getElementById("groesse").value;
    // var geschlecht= document.getElementById("gesch").options[document.getElementById("gesch").selectedIndex].text;
    var geschlecht = "m�nnlich";
    if(groessee > 2.5 || gewicht < 30 || gewicht > 300){
        alert("Falsche Eingabe")
    }
    var bmi = gewicht/(groesse*groesse);
    if(geschlecht === "m�nnlich"){
        if(bmi<20){
            $("#bmierg").html("Untergewichtig der BMI liegt bei:");
        }
        if (bmi>=20 && bmi<25){
            $("#bmierg").html("Normalgewichtig der BMI liegt bei:");
        }
        if(bmi>=25 && <20){
            $("#bmierg").html("Leichtes �bergewicht der BMI liegt bei:");
        }
        if(bmi>=30 && bmi<40){
            $("#bmierg").html("�bergewichtig der BMI liegt bei:");
        }
        if(bim>=40){
            $("#bmierg").html("Sehr starkes �bergewicht der BMI liegt bei:");
        }

    }else{
        if(bmi<19){
            $("#bmierg").html("Untergewichtig der BMI liegt bei:");
        }
        if (bmi>=19 && bmi<24){
            $("#bmierg").html("Normalgewichtig der BMI liegt bei:");
        }
        if(bmi>=24 && <30){
            $("#bmierg").html("Leichtes �bergewicht der BMI liegt bei:");
        }
        if(bmi>=30 && bmi<40){
            $("#bmierg").html("�bergewichtig der BMI liegt bei:");
        }
        if(bim>=40){
            $("#bmierg").html("Sehr starkes �bergewicht der BMI liegt bei:");
        }

    }
    $("#bmierg").html(bmi);
}
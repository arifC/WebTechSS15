function bmi(){
    var gewicht= document.getElementById("gewicht").value;
    var groe�e= document.getElementById("groe�e").value;
   // var geschlecht= document.getElementById("gesch").options[document.getElementById("gesch").selectedIndex].text;
    var geschlecht = "m�nnlich";
    alert(gewicht);
    if(groe�e > 2.5 || gewicht < 30 || gewicht > 300){
        alert("Falsche Eingabe")
    }
    var bmi = gewicht/(groe�e*groe�e);
    if(geschlecht ="m�nnlich"){
        switch(bmi){
            case bmi>20:
                alert("Untergewicht");
                break;
            case bmi<=25&&bmi>20:
                alert("Normalgewicht");
                break;
            case bmi<=30&&bmi>25:
                alert("�bergewicht");
                break;
            case bmi<=40&&bmi>31:
                alert("Adipositas");
                    break;
            case bmi>40:
                alert("Hochgradige Adipositas");
                break;
            default:
                alert("Ihr BMI ist keine Zahl...");
                break;
        }
    }else{
        switch(bmi){
            case bmi>19:
                alert("Untergewicht");
                break;
            case bmi<=24&&bmi>19:
                alert("Normalgewicht");
                break;
            case bmi<=30&&bmi>24:
                alert("�bergewicht");
                break;
            case bmi<=40&&bmi>31:
                alert("Adipositas");
                break;
            case bmi>40:
                alert("Hochgradige Adipositas");
                break;
            default:
                alert("Ihr BMI ist keine Zahl...");
                break;
        }

    }
    $("#bmierg").html(bmi);
}
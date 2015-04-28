function bmi(){
    var gewicht= document.getElementById("gewicht");
    var groeße= document.getElementById("groeße");
    if(document.getElementById("myCheck").checked)
    var geschlecht= document.getElementById("gesch").options[document.getElementById("gesch").selectedIndex].text)
    if(groeße >2.5){
        alert("Falsche Eingabe oder du bist zu Groß")
    }
    var bmi = gewicht/(groeße*groeße);
    if(geschlecht ="männlich"){
        switch(bmi){
            case bmi>20:
                alert("ACHTUNG UNTERGEWICHT!");
                break;
            case bmi<=25&&bmi>20:
                alert("Normalgewicht sollange Sie unter 25 Jahre alt sind");
                break;
            case bmi<=30&&bmi>25:
                alert("Übergewicht ausser Sie sind über 35 Jahre alt");
                break;
            case bmi<=40&&bmi>31:
                alert("ACHTUNG Adipositas(Fettleibigkeit");
                    break;
            case bmi>40:
                alert("SUCHEN SIE IHREN ARZT ODER BESTATTER AUF SIE HABEN STARKE FETTLEIBIGKEIT!")
                break;
            default:
                alert("Ihr BMI ist keine Zahl...");
                break;
        }
    }else{
        switch(bmi){
            case bmi>19:
                alert("ACHTUNG UNTERGEWICHT!");
                break;
            case bmi<=24&&bmi>19:
                alert("Normalgewicht sollange Sie unter 25 Jahre alt sind");
                break;
            case bmi<=30&&bmi>24:
                alert("Übergewicht ausser Sie sind über 35 Jahre alt");
                break;
            case bmi<=40&&bmi>31:
                alert("ACHTUNG Adipositas(Fettleibigkeit");
                break;
            case bmi>40:
                alert("SUCHEN SIE IHREN ARZT ODER BESTATTER AUF SIE HABEN STARKE FETTLEIBIGKEIT!")
                break;
            default:
                alert("Ihr BMI ist keine Zahl...");
                break;
        }

    }
    $("#bmierg").append(bmi.innerHTML)
}
function loadJSON(callback,url) {   
    var xobj = new XMLHttpRequest();
    // xobj.overrideMimeType("application/json");
    xobj.open('GET', url, true); 
    xobj.onreadystatechange = function () {
            if (xobj.readyState == 4 && xobj.status == "200") {
            // sending the resonse to your callback
            callback(xobj.responseText);
            }
    };
    xobj.send(null);
}

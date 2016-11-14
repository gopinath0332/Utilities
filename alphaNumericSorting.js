list.sort(function(a, b) {
    var textReg = /[^a-zA-Z]/g;
    var numReg = /[^0-9]/g;
    var aText = a.replace(textReg, "").toLowerCase();
    var bText = b.replace(textReg, "").toLowerCase();
    if (aText === bText) {
        var aNum = parseInt(a.replace(numReg, ""), 10);
        var bNum = parseInt(b.replace(numReg, ""), 10);
        return aNum === bNum ? 0 : aNum > bNum ? 1 : -1;
    } else {
        return aText > bText ? 1 : -1;
    }
});

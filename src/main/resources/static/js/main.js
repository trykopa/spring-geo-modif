$(document).ready(function(){
    $.getJSON('/rate', function(data) {
        $('#rate').text(data.rates.UAH);
        $('#usdrate').text(data.rates.USD);
        $('#gbprate').text(data.rates.GBP);
        $('#chfrate').text(data.rates.CHF);
        $('#date').text(data.date);
    });
});
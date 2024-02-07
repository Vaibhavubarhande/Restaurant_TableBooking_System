
async function book() {

   const days =  $('#day').val();
   const fullName =  $('#fn').val();
   const time =  $('#tim').val();
   const phoneNumber =  $('#pn').val();
   const persons =  $('#person').val();

   if (days!="" && fullName!="" && time!=""&& phoneNumber!=""&& persons!="") {
      
      const url = 'http://localhost:8080/book';
      const result = await fetch(url, {method:'POST', body: JSON.stringify({

                     name: fullName,
                     day: days,
                     time: time,
                     mobile: phoneNumber,
                     persons: persons
   
               }), headers: {"content-Type": "application/json"} });
   
      const finalData = await result.json();
      console.log(finalData)

      $('#dt').html("Hello " + finalData.name + " Your table has been Booked Successfully...");
   
   } else {
      $('#dt').html("Error - Please enter a valid information**");
   }
}
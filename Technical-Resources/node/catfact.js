var axios = require('axios');

var config = {
  method: 'get',
  url: 'https://catfact.ninja/fact',
  headers: { }
};

axios(config)
.then(function (response) {
  console.log(JSON.stringify(response.data));
})
.catch(function (error) {
  console.log(error);
});

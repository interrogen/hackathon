var axios = require('axios');

var config = {
    method: 'get',
    url: 'https://api.github.com/repos/robot297/hello-world',
    headers: {
        'Accept': 'application/vnd.github.v3+json', 
        'Authorization': 'token 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'
    }
};


axios(config).then(function (response) {
    console.log(JSON.stringify(response.data));
}).catch(function (error) {
    console.log(error);
})
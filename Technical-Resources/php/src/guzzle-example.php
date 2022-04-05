<?php

$client = new GuzzleHttp\Client(); // add this first through composer
$url = 'https://example-url.com/api/v1';
$method = 'GET'; // can be 'POST', 'PUT', 'DELETE', etc...

// Example 1:
    // Below is an example GET request
$response = $client->request($method, $url, [
    'headers' => [
        'Accept' => 'application/json',
        'Content-type' => 'application/json'
    ]
]);
$body = $response->getBody();

// Example 2:
    // Alternatively, you can use the syntax below, e.g. for a POST request
$data = array();
$response = $client->post($url, [
    'data' => $data,
    'headers' => [
        'Accept' => 'application/json',
        'Content-type' => 'application/json'
    ]
]);
$body = $response->getBody();

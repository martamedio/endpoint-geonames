# Endpoint Geonames

An example of JAX-WS to create a SOAP Web Service Endpoint without any framework. 
There's a Publisher and a Client who, given a postal code, returns a JSON informing the city (with GeoNames.org)

## Getting Started

### Prerequisities

You only need:

```
* Java 1.8
* Maven
```

## Running it!

* Run *MyPublisher* for set up the Endpoint
* Run *MyClient* with two arguments: your name and your postal code and will return a JSON
* It will return a JSON the city:
```
        {"name":"Marta","postalCode":"33213","city":"Gijon"}
```

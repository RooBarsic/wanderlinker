# Wanderlinker Backend

## frist blueprint of the API

### /map/treasures
- Create, Read, Update, Delete

To make the app more fun to use we need to setup rewards, powerups, funCoins and points to collect

``` json
{
    "id":234324,
    "title": "Hidden Place XY",
    "description":"very hidden place",
    "imgUrl": "https://some.image",
    "treasureCategory":23234,
    "userLikes":43,
    "powerUpsAfterFinding":["double-funIcons"],
    "award":[
        "id":234324,
        "title":"Hidden Ninja",
        "description": "You are greatest ninja on the world",
        "imageURL": "https://img.cc/goblet.png",
        "ranking": 89
    ],
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat":"40.243223",
    "Lon":"120.234234",
    "searchRadiusMeter":20,
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 

### /map/activites
- Create, Read, Update, Delete

The user can spot hygenic alerts with the property: numberOfHygenicAlerts

``` json
{
    "id":234324,
    "title": "Great activity",
    "description":"Don't miss out this",
    "imgUrl": "https://some.image",
    "hoster":[{
        "name":"Ernst Haft",
        "birthday":"23.12.1994",
        "gender":"m",
        "profileUrl":"https://best.profile/ever"
    }],
    "bookingUrl":"https://book.here/now",
    "activityCategory":23234,
    "capacityInProcent":39,
    "numberOfHygenicAlerts":0,
    "price":"34",
    "currency":"USD",
    "userLikes":43,
    "award":[
        "id":234324,
        "title":"Most active vistor",
        "description": "You are great",
        "imageURL": "https://img.cc/goblet.png",
        "ranking": 0
    ],
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat":"40.243223",
    "Lon":"120.234234",
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 

### /map/event
- Create, Read, Update, Delete

``` json
{
    "id":234324,
    "title": "Great event",
    "description":"Don't miss out this",
    "imgUrl": "https://some.image",
    "hoster":[{
        "name":"Ernst Haft",
        "birthday":"23.12.1994",
        "gender":"m",
        "profileUrl":"https://best.profile/ever"
    }],
    "bookingUrl":"https://book.here/now",
    "eventCategory":23234,
    "capacityInProcent":39,
    "numberOfHygenicAlerts":0,
    "price":"344",
    "currency":"USD",
    "userLikes":43,
    "award":[
        "id":234324,
        "title":"Best vistor",
        "description": "You are great",
        "imageURL": "https://img.cc/goblet.png",
        "ranking": 0
    ],
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat":"40.243223",
    "Lon":"120.234234",
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 

### /map/crowds
- Create, Read, Update, Delete

### /map/infections
- Create, Read, Update, Delete

Get from [COVID-19-API](https://covid19api.com/) and [docu](https://documenter.getpostman.com/view/10808728/SzS8rjbc?version=latest)
``` json
{
    "Country": "Switzerland",
    "CountryCode": "",
    "Lat": "0",
    "Lon": "0",
    "Cases": 0,
    "Status": "confirmed",
    "Date": "2020-01-22T00:00:00Z"
  },
  {
    "Country": "Switzerland",
    "CountryCode": "",
    "Lat": "0",
    "Lon": "0",
    "Cases": 0,
    "Status": "confirmed",
    "Date": "2020-01-23T00:00:00Z"
  },
``` 

### /map/localspecials
- Create, Read, Update, Delete
## /hygenicalert
- Create, Read, Update, Delete

## /user

- Create, Read, Update, Delete

``` json
{
    "id":234324,
    "username": "Ernst Haft",
    "email":"ernst@haft.de",
    "verify":True,
    "bio":"I want to save the plent",
    "proflieImgUrl": "https://some.image",
    "socialLinks":["https://ddd.image","https://ddd.image"],
    "collectedFunCoins": 23000,
    "level":33,
    "levelPoints":220,
    "followers":43,
    "awards":[
        {
            "id":234324,
            "title":"Best vistor",
            "description": "You are great",
            "imageURL": "https://img.cc/goblet.png",
            "ranking": 0
        },
        {
            "id":234324,
            "title":"Best vistor",
            "description": "You are great",
            "imageURL": "https://img.cc/goblet.png",
            "ranking": 0
        },
        {
            "id":234324,
            "title":"Best vistor",
            "description": "You are great",
            "imageURL": "https://img.cc/goblet.png",
            "ranking": 0
        }   
    ],
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 
## /login
Use tokens to authenticate (Single Sign On???)
## /register
Integrate for
## /recoverpasword
via email

# COVID-19 REST API
#### To get information about all countries use:
    /countries/all

#### To get information about exactly country use:
    /countries/getCountry?
    
##### as a parameter you can use :
    id - to get country info by ID
    name - to get country info by country name
    capital - to get country info by country capital
    iso2 - to get country info by ISO2 code of country 
    iso3 - to get country info by ISO3 code of country 

#### as a result you will get such information about the country :
    name - name of country
    officialName - the officail name of the country
    capital - name of the capital of the country 
    iso2 - ISO2 code of the country
    iso3 - ISO3 code of the country
    currencyName - local currency name
    totalConfirmed - number of total confirmed cases of COVID-19
    totalDeaths - number of total confirmed deaths cases of COVID-19
    totalRecovered - number of total confirmed recovered cases of COVID-19
    totalActive - number of total confirmed active patients of COVID-19
    lastUpdate - date last updated information about COVID-19 situation in this country

### Some examples
    /countries/getCountry?name=Russia
    
``` json
{
    "id": 182,
    "name": "Russia",
    "officialName": "the Russian Federation",
    "capital": "Moscow",
    "currencyName": "Russian Ruble",
    "totalConfirmed": 0,
    "totalDeaths": 0,
    "totalRecovered": 0,
    "totalActive": 0,
    "lastUpdate": "2020-01-01",
    "iso2": "RU",
    "iso3": "RUS"
}
``` 
    
# ER-Diagram
Suggest to use a SQL-Model:

Entities:

- treasures
- awards
- users
- hygenicalerts

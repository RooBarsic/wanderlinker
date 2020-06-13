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


# ER-Diagram
Suggest to use a SQL-Model:

Entities:

- treasures
- awards
- users
- hygenicalerts

# Wanderlinker Backend

## Draft sketching the API

/infections
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


/crowds
- Create, Read, Update, Delete
/treasures
- Create, Read, Update, Delete

``` json
{
    "title": "Hidden Place XY",
    "description":"very hidden place",
    "imgUrl": "https://some.image",
    "treasureCategory":23234,
    "userLikes":43,
    "powerUpsAfterFinding":["double-funIcons"],
    "awardID": 342,
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat": "0",
    "Lon": "0",
    "searchRadiusMeter":20,
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 

/activites
- Create, Read, Update, Delete

``` json
{
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
    "awardID": 23,
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat": "0",
    "Lon": "0",
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 


/event
- Create, Read, Update, Delete

``` json
{
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
    "awardID": 23,
    "funCoins": 100,
    "levelPointsToAdd":200,
    "Lat": "0",
    "Lon": "0",
    "creationDate": "2020-01-22T00:00:00Z"
  },
``` 

/locations
- Create, Read, Update, Delete

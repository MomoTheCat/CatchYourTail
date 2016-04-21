# CatchYourTail

###import Postman: https://www.getpostman.com/collections/90094fa0f2809683f33f

Wyszukiwanie tanich lotów. Obejmuje to korzystanie z API Ryanair by uzyskać dostęp do cen oraz dat wylotów. Zaplanowany jest również web scrapping strony WIZZ AIR, by uzyskać ten same informacje. 
Przykładowe użycie: Mam wolne 5 dni w pracy i chcę spędzić miło ten czas za granicą. Wpisuję daty graniczne wraz z marginesem (+-0/1/3 dni) . Miejsce wylotu (miasto lub jedynie kraj) i klikamy wyszukaj. Program znajduje najtańsze połączenia lotnicze w danym okresie czasu. Voilà możemy już szukać noclegów :)

##Ryanair:

-https://gist.github.com/smcelhinney
-https://www.ryanair.com/en/api/2/flights/from/GDN/2016-04-02/2016-04-05/250/unique/?limit=15&offset-0
-https://www.ryanair.com/en/api/2/forms/flight-booking-selector/
-https://api.ryanair.com/flightinfo/3/flights/?&arrivalAirportIataCode=&departureAirportIataCode=KIR&departureTimeScheduledFrom=00:00&departureTimeScheduledTo=23:59&length=&number=&offset=
-https://api.ryanair.com/aggregate/3/common?embedded=airports,countries,cities,regions,nearbyAirports,defaultAirport&market=en-gb

##Wizzair:

-nothing so far..
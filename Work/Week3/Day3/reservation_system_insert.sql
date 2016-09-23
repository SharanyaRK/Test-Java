/* Coaches table */

insert into  coaches values ( "1A"  , 4.00 );
insert into  coaches values ( "2A"  , 3.50 );
insert into  coaches values ( "4A"  , 0.40 );
insert into  coaches values ( "3A"  , 2.50 );
insert into  coaches values ( "5A"  , 2.00 );
insert into  coaches values ( "6A"  , 1.80 );
insert into  coaches values ( "FC"  , 3.00 );
insert into  coaches values ( "8A"  , 0.80 );
  
 
/* Users table  */

insert into  users values( 100 ,  100 , "abc" );
insert into  users values( 101 ,  101 , "aaa" );
insert into  users values( 102 ,  102 , "bbb" );
insert into  users values( 103 ,  103 , "6Ac" );
insert into  users values( 104 ,  104 , "ddd" );
 

/* Trains table */

 insert into  trains values( 12344, "Kerala Express" );
 insert into  trains values( 12345, "Coimbatore express" );
 insert into  trains values( 12346, "Bangalore Exp" );
 insert into  trains values( 12347, "Chennai Express" );
 insert into  trains values( 12348, "Delhi Exp" );
 insert into  trains values( 12349, "Chennai Vayanad" );
 insert into  trains values( 13456, "Madurai Express"  );
 insert into  trains values( 13467, "Pandian Express" );
 insert into  trains values( 12389, "BLRore Express"  );

/*Stations table*/
 
 insert into  stations values( 12 , "MAS" );
 insert into  stations values( 13 , "SBC" );
 insert into  stations values( 14 , "BLR" );
 insert into  stations values( 15 , "MDR" );

  
/*TrainCoaches table*/

insert into  TrainCoaches (TrainNo, CoachCode, NoOfSeats) values
(  12344 , "1A" ,  50 ),
(  12344 , "2A" ,  50 ),
(  12344 , "4A" ,  50 ),
(  12344 , "3A" ,  50 ),
(  12344 , "5A" ,  50 ),
(  12344 , "6A" ,  50 ),
(  12344 , "FC" ,  50 ),
(  12344 , "8A" ,  50 ),
(  12345 , "1A" , 100 ),
(  12345 , "2A" , 100 ),
(  12345 , "4A" , 100 ),
(  12345 , "3A" , 100 ),
(  12345 , "5A" , 100 ),
(  12345 , "6A" , 100 ),
(  12345 , "FC" , 100 ),
(  12345 , "8A" , 100 ),
(  12346 , "1A" , 150 ),
(  12346 , "2A" , 150 ),
(  12346 , "4A" , 150 ),
(  12346 , "3A" , 150 ),
(  12346 , "5A" , 150 ),
(  12346 , "6A" , 150 ),
(  12346 , "FC" , 150 ),
(  12346 , "8A" , 150 ),
(  12347 , "1A" , 200 ),
(  12347 , "2A" , 200 ),
(  12347 , "4A" , 200 ),
(  12347 , "3A" , 200 ),
(  12347 , "5A" , 200 ),
(  12347 , "6A" , 200 ),
(  12347 , "FC" , 200 ),
(  12347 , "8A" , 200 ),
(  12348 , "1A" , 250 ),
(  12348 , "2A" , 250 ),
(  12348 , "4A" , 250 ),
(  12348 , "3A" , 250 ),
(  12348 , "5A" , 250 ),
(  12348 , "6A" , 250 ),
(  12348 , "FC" , 250 ),
(  12348 , "8A" , 250 ),
( 12349 , "1A"  ,  50 ),
( 12349 , "2A"  ,  50 ),
( 12349 , "4A"  ,  50 ),
( 12349 , "3A"  ,  50 ),
( 12349 , "5A"  ,  50 ),
( 12349 , "6A"  ,  50 ),
( 12349 , "FC"  ,  50 ),
( 12349 , "8A"  ,  50 ),
( 12389 , "1A"  , 100 ),
( 12389 , "2A"  , 100 ),
( 12389 , "4A"  , 100 ),
( 12389 , "3A"  , 100 ),
( 12389 , "5A"  , 100 ),
( 12389 , "6A"  , 100 ),
( 12389 , "FC"  , 100 ),
( 12389 , "8A"  , 100 ),
( 13467 , "1A"  , 100 ),
( 13467 , "2A"  , 100 ),
( 13467 , "4A"  , 100 ),
( 13467 , "3A"  , 100 ),
( 13467 , "5A"  , 100 ),
( 13467 , "6A"  , 100 ),
( 13467 , "FC"  , 100 ),
( 13467 , "8A"  , 100 ),
( 13456 , "1A"  , 100 ),
( 13456 , "2A"  , 100 ),
( 13456 , "4A"  , 100 ),
( 13456 , "3A"  , 100 ),
( 13456 , "5A"  , 100 ),
( 13456 , "6A"  , 100 ),
( 13456 , "FC"  , 100 ),
( 13456 , "8A"  , 100 );
  

/*Routes table*/

 insert into  routes (RouteId,OriginStationId,DestinationStationId,DistanceInKms) values

( 1 ,  12 ,  13 ,  362 ),
( 2 ,  13 ,  12 ,  362 ),
( 3 ,  12 ,  14 ,  500 ),
( 4 ,  15 ,  12 ,  350 ),
( 5 ,  12 ,  15 ,  350 );
 


 

/* Train route maps*/

insert into  trainroutemaps (RouteId,TrainNo,ArrivalTime,DepartureTime,DurationInMins)values

( 1 ,  12344 , "20:40:00" , "14:20:00" , 380 ),
( 1 ,  12345 , "21:35:00" , "15:30:00" , 365 ),
( 1 ,  12346 , "20:05:00" , "13:35:00" , 390 ),
( 1 ,  12348 , "14:00:00" , "07:50:00" , 370 ),
( 2 ,  12347 , "14:30:00" , "08:00:00" , 390 ),
( 2 , 12349 , "04:40:00" , "22:40:00" , 360 ),
( 3 , 12389 , "08:20:00" , "23:30:00" , 530 ),
( 4 , 13467 , "05:30:00" , "20:30:00" , 540 ),
( 5 , 13456 , "06:30:00" , "21:30:00" , 540 );
 
  

insert into  bookings (BookingRefNo,RouteId,TrainNo,CoachCode,DateOfJourney,DateOfBooking,NoOfTickets)values
 (500 , 1 ,  12344 , "1A"  , "2005-04-28" , "2005-02-14" ,  2 ),
 (501 , 1 ,  12345 , "2A"  , "2005-03-20" , "2005-03-10" ,  2 ),
 (502 , 1 ,  12346 , "6A"  , "2005-04-20" , "2005-04-10" , 51 ),
 (503 , 2 ,  12347 , "FC"  , "2006-12-20" , "2007-01-10" , 150 ),
 (504 , 2 ,  12347 , "6A"  , "2006-12-20" , "2007-01-10" , 150 ),
 (505 , 2 ,  12347 , "8A"  , "2006-12-20" , "2007-01-10" , 150 ),
 (506 , 2 ,  12347 , "2A"  , "2006-12-20" , "2007-01-10" , 100 ),
 (507 , 1 ,  12348 , "2A"  , "2015-02-20" , "2015-02-14" , 10 ),
 (508 , 2 , 12349 , "3A"  , "2015-03-20" , "2015-03-14" , 10 ),
 (509 , 3 , 12389 , "6A"  , "2015-04-20" , "2015-04-14" , 10 ),
 (510 , 4 , 13467 , "FC"  , "2004-04-20" , "2004-04-14" , 10 ),
 (511 , 5 , 13456 , "8A"  , "2004-06-20" , "2004-06-14" , 10 ),
 (512 , 5 , 13456 , "5A"  , "2004-07-20" , "2004-07-14" ,  5 );
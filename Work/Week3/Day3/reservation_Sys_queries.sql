-- 1)To get the list of all trains
SELECT `TrainName` FROM `Trains`;

-- 2)To get the list of all train routes in the database
SELECT `origin`.`StatiONCode` AS ORIGIN ,`dest`.`StatiONCode`  AS DESTINATION
	FROM `Routes` 
	JOIN `StatiONs` `origin` ON `OriginStatiONId` = `StatiONId` 
	JOIN `StatiONs` `dest` ON `DestinatiONStatiONId` = `dest`.`StatiONId`;

-- 3)Total number of seats in the each train.
SELECT DISTINCT  TrainCoaches.NoOfSeats , Trains.TrainName 
	 FROM `TrainCoaches`
	 JOIN Trains ON TrainCoaches.TrainNo = Trains.TrainNo ;

-- 4)List of all routes goes to Bangalore
SELECT `origin`.`StatiONCode` as `Origin`,`dest`.`StatiONCode` as `DestinantiON`,`DistanceInKms` 
	FROM `Routes` 
	JOIN `StatiONs` `origin` ON `OriginStatiONId` = `StatiONId` 
	JOIN `StatiONs` `dest` ON `DestinatiONStatiONId` = `dest`.`StatiONId` 
	WHERE `dest`.`StatiONCode` = "BLR";

-- 5)List of all routes starting from bangalore, calcutta and chennai
SELECT `origin`.`StatiONCode` as `Origin`,`dest`.`StatiONCode` as `DestinantiON`,`DistanceInKms` 
	FROM `Routes` 
	JOIN `StatiONs` `origin` ON `OriginStatiONId` = `StatiONId` 
	JOIN `StatiONs` `dest` ON `DestinatiONStatiONId` = `dest`.`StatiONId` 
	WHERE `origin`.`StatiONCode` = "BLR" 
	or `origin`.`StatiONCode` = "MDR" 
	or `origin`.`StatiONCode` = "MAS";

-- 6)List of all the bookings booked between 1st Jan 2005 and 31st Dec 2005
select `train`.`TrainName`,`CoachCode`,`DateOfJourney`,`DateOfBooking`,`NoOfTickets` 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	WHERE `booking`.`DateOfBooking` between '2005-01-01' and '2005-12-31';

-- 7)List of all trains whose name begins with B
select `TrainName` from `Trains` WHERE `TrainName` like "B%";

-- 8)List of all bookings WHERE DOB is not null
select `train`.`TrainName`,`CoachCode`,`DateOfJourney`,`DateOfBooking`,`NoOfTickets` 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	WHERE `booking`.`DateOfBooking` is not null;

-- 9)List of all bookings for the booked in 2006, DOJ in 2007
select `train`.`TrainName`,`CoachCode`,`DateOfJourney`,`DateOfBooking`,`NoOfTickets` 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	WHERE year(`booking`.`DateOfBooking`) = 2006 and year(`booking`.`DateOfJourney`) = 2007;

-- 10)Total number of coaches in the all the trains
select `train`.`TrainName`,count(`CoachCode`)  as `coach_count`
	from `TrainCoaches` `traincoach` 
	JOIN `Trains` `train` ON `traincoach`.`TrainNo` = `train`.`TrainNo` 
	group by `traincoach`.`TrainNo`;

-- 11)Total number of bookings in the database for the train no 16198
select count(*) as `booking_count` from `Bookings` WHERE `TrainNo` = "16198";

-- 12)Total no of tickets column 'total' , booked for train no. 14198
select sum(`NoOfTickets`) as `total` from `Bookings` WHERE `TrainNo` = "14198";

-- 13)Minimum distance route
SELECT `origin`.`StatiONCode`,`dest`.`StatiONCode`,`DistanceInKms`
	FROM `Routes` `r`
	JOIN `StatiONs` `origin` ON `OriginStatiONId` = `StatiONId` 
	JOIN `StatiONs` `dest` ON `DestinatiONStatiONId` = `dest`.`StatiONId`
	order by `r`.`DistanceInKms` limit 1; 

-- 14)Total number of tickets booked for each train in the database
select `train`.`TrainName`,sum(`NoOfTickets`) `total`
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	group by `train`.`TrainNo`;

-- 15)cost for 50 kms for each coach.
select `CoachCode`,`CostPerKm`*50 as `total_cost` from `Coaches`;

-- 16)List the train name and departure time for the trains starting from Bangalore.	
select `train`.`TrainName`, `trainroutemap`.`DepartureTime` 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	JOIN `TrainRouteMaps` `trainroutemap` ON `booking`.`RouteId` = `trainroutemap`.`RouteId` and `booking`.`TrainNo` = `trainroutemap`.`TrainNo` 
	JOIN `Routes` `route` ON `booking`.`RouteId` = `route`.`RouteId` 
	JOIN `StatiONs` `statiON` ON `statiON`.`StatiONId` = `route`.`OriginStatiONId` 
	WHERE `statiON`.`StatiONCode` = "BLR";

-- 17)List the trains for which the total no of tickets booked is greater than 500
select `train`.`TrainName`,sum(`NoOfTickets`) 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo`
	group by `train`.`TrainNo` 
	having sum(`NoOfTickets`)>500;

-- 18)List the trains for which the total no of tickets booked is lesser than 50
select `train`.`TrainName`,sum(`NoOfTickets`) 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	group by `train`.`TrainNo` 
	having sum(`NoOfTickets`)<50;

-- 19)List the bookings alONg with train name, origin statiON, destinatiON statiON and coach code after the date of journey ’25th Feb 2015’
select `train`.`TrainName`, `trainroutemap`.`DepartureTime` 
	from `Bookings` `booking` 
	JOIN `Trains` `train` ON `booking`.`TrainNo`= `train`.`TrainNo` 
	JOIN `TrainRouteMaps` `trainroutemap` ON `booking`.`RouteId` = `trainroutemap`.`RouteId` and `booking`.`TrainNo` = `trainroutemap`.`TrainNo` 
	JOIN `Routes` `route` ON `booking`.`RouteId` = `route`.`RouteId` 
	JOIN `StatiONs` `origin` ON `route`.`OriginStatiONId` = `origin`.`StatiONId` 
	JOIN `StatiONs` `dest` ON `route`.`DestinatiONStatiONId` = `dest`.`StatiONId` 
	JOIN `TrainCoaches` `traincoach` ON `booking`.`TrainNo` = `traincoach`.`TrainNo` 
	JOIN `Coaches` `coach` ON `traincoach`.`CoachCode` = `coach`.`CoachCode` 
	WHERE `booking`.`DateOfJourney`> DATE(25-02-2015);

-- 20)List the trains via the route SBCore - Chennai
SELECT `origin`.`StatiONCode` as `Origin`,`dest`.`StatiONCode` as `DestinantiON`,`DistanceInKms` 
	FROM `Routes`
	JOIN `StatiONs` `origin` ON `OriginStatiONId` = `StatiONId` 
	JOIN `StatiONs` `dest` ON `DestinatiONStatiONId` = `dest`.`StatiONId` 
	WHERE `dest`.`StatiONCode` = "SBC" and `origin`.`StatiONCode` = "MAS";

-- 21)List the trains for which are booked till now.
select `train`.`TrainName` 
	from `Trains` `train` 
	left JOIN `Bookings` `booking` ON `train`.`TrainNo` = `booking`.`TrainNo` 
	WHERE `booking`.`TrainNo` is not null;
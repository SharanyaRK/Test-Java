ALTER table marks add (created_at datetime NOT NULL default current_timestamp,updated_at datetime on update current_timestamp default current_timestamp);

ALTER table students add (created_at datetime NOT NULL default current_timestamp,updated_at datetime on update current_timestamp default current_timestamp);

ALTER table medals add (created_at datetime NOT NULL default current_timestamp,updated_at datetime on update current_timestamp default current_timestamp);

UPDATE marks SET annual = 0 WHERE annual is NULL;
UPDATE marks SET quarterly = 0 WHERE quarterly is NULL;
UPDATE marks SET half_yearly = 0 WHERE half_yearly is NULL;

ALTER table marks MODIFY column annual int(11) NOT NULL;
ALTER table marks MODIFY column quarterly int(11) NOT NULL;
ALTER table marks MODIFY column half_yearly int(11) NOT NULL;


INSERT INTO marks(student_id,subject_id,quarterly,half_yearly,annual,year,grade) VALUES ("100001","2","100","100","100","2008","11");

CREATE TABLE students_summary (
	student_id bigint(19) NOT NULL,
	student_name varchar(100) NOT NULL,
	year int(11) ,
	percentage float(4,2),
	no_of_medals_received  int(11)
);


INSERT INTO `students_summary`
SELECT `st`.`id` as `student_id`, st.`name` as `student_name`, `year` ,`annual_per` as `percentage`,`medals` as `no_of_medals_received`
	FROM ((SELECT COUNT(`medal_won`) as `medals`,`student_id` FROM `medals` GROUP BY `student_id`,`year`) as m) 
	JOIN (SELECT `student_id`,sum(COALESCE(`annual`,0))/5 as `annual_per`,`year` FROM `marks` GROUP BY `year`,`student_id`) as t on m.`student_id` = t.`student_id` 
	JOIN `students` `st` 
	WHERE `m`.`student_id` = `st`.`id`;


delimiter $$
create trigger medal_copy before insert on medals
	for each row
	begin
		if new.medal_won is NULL then
			set new.medal_won = new.medal_recieved;
		elseif new.medal_recieved is NULL then
			set new.medal_recieved = new.medal_won;
		end if;
	end
$$
delimiter ;


ALTER table medals drop medal_won;
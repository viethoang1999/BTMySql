create schema if not exists  store_cms_plusplus default character set utf8mb4;
use  store_cms_plusplus;

create table if not exists ` store_cms_plusplus`.`laptop`(
`id` int not null auto_increment primary key,
`name` varchar(225) null,
`url` varchar(225) null,
`maker` varchar(45) null,
`type` varchar(45) null,
`ram` varchar(45) null,
`cpu` varchar(45) null,
`ssd` varchar(45) null,
`hdd` varchar(45) null,
`price` float null,
`card` varchar(45)null,
`screen_resolution` VARCHAR(45) NULL,
`screen_size` float  NULL,
`sold` int null,
`created_tỉmestamp` timestamp(6) 
);





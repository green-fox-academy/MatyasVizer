USE [master]
RESTORE DATABASE [AdventureWorks2016] 
FROM  DISK = N'C:\install\MSSQL\AdventureWorks2016.bak' 
WITH  FILE = 1,
MOVE N'AdventureWorks2016_Data' TO N'C:\SQLDATA\DB\AdventureWorks2016_Data.mdf',
MOVE N'AdventureWorks2016_Log' TO N'C:\SQLDATA\LOG\AdventureWorks2016_Log.ldf',
NOUNLOAD,
STATS = 5

GO



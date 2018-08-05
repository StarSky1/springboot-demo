@echo off
echo "run redis sentinel mode"
::启动redis主从服务器
start cmd /k  "redis-server.exe ./master_6380/redis.conf"
start cmd /k  "redis-server.exe ./slave_6381/redis.conf"
start cmd /k  "redis-server.exe ./slave_6382/redis.conf"
::启动sentinel哨兵集群
start cmd /k  "redis-server.exe ./sentinel_26379/sentinel.conf --sentinel"
start cmd /k  "redis-server.exe ./sentinel_26380/sentinel.conf --sentinel"
start cmd /k  "redis-server.exe ./sentinel_26381/sentinel.conf --sentinel"
@pause

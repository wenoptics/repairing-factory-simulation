# Repairing Factory Simulation

[INFSCI 2500 DS] 

## Simulation Sample

### Condition: 

 - Customers enter the shop according to poisson distributions `lambda = 2`
 - Customers' VIP levels are random according to uniform distribution. (from 1 to 10)
 - The mechanic uses time that directly proportional to VIP level units to finish one repairing, with 
 proportional `k = 0.05`
 - Simulation starts from `t=0` to `t=50`, `t` as **hour**

### Simulation Outputs:

``` 
=====================
Current Time: 0
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=0
Customer with vip_level == 2 start repairing at t=0!
There're 0 customer waiting on the line
=====================
Current Time: 1
nNewCustomer: 2
Customer with vip_level == 3 entered Repairing Shop at t=1
Customer with vip_level == 5 entered Repairing Shop at t=1
Customer with vip_level == 2 finish repairing at t=1!
Customer with vip_level == 5 start repairing at t=1!
There're 1 customer waiting on the line
=====================
Current Time: 2
nNewCustomer: 1
Customer with vip_level == 4 entered Repairing Shop at t=2
Customer with vip_level == 5 finish repairing at t=2!
Customer with vip_level == 4 start repairing at t=2!
There're 1 customer waiting on the line
=====================
Current Time: 3
nNewCustomer: 1
Customer with vip_level == 6 entered Repairing Shop at t=3
Customer with vip_level == 4 finish repairing at t=3!
Customer with vip_level == 6 start repairing at t=3!
There're 1 customer waiting on the line
=====================
Current Time: 4
nNewCustomer: 1
Customer with vip_level == 10 entered Repairing Shop at t=4
Customer with vip_level == 6 finish repairing at t=4!
Customer with vip_level == 10 start repairing at t=4!
There're 1 customer waiting on the line
=====================
Current Time: 5
nNewCustomer: 2
Customer with vip_level == 6 entered Repairing Shop at t=5
Customer with vip_level == 10 entered Repairing Shop at t=5
Customer with vip_level == 10 finish repairing at t=5!
Customer with vip_level == 10 start repairing at t=5!
There're 2 customer waiting on the line
=====================
Current Time: 6
nNewCustomer: 2
Customer with vip_level == 8 entered Repairing Shop at t=6
Customer with vip_level == 4 entered Repairing Shop at t=6
Customer with vip_level == 10 finish repairing at t=6!
Customer with vip_level == 8 start repairing at t=6!
There're 3 customer waiting on the line
=====================
Current Time: 7
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=7
Customer with vip_level == 8 finish repairing at t=7!
Customer with vip_level == 6 start repairing at t=7!
There're 3 customer waiting on the line
=====================
Current Time: 8
nNewCustomer: 2
Customer with vip_level == 10 entered Repairing Shop at t=8
Customer with vip_level == 7 entered Repairing Shop at t=8
Customer with vip_level == 6 finish repairing at t=8!
Customer with vip_level == 10 start repairing at t=8!
There're 4 customer waiting on the line
=====================
Current Time: 9
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=9
Customer with vip_level == 10 finish repairing at t=9!
Customer with vip_level == 7 start repairing at t=9!
There're 4 customer waiting on the line
=====================
Current Time: 10
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=10
Customer with vip_level == 7 finish repairing at t=10!
Customer with vip_level == 5 start repairing at t=10!
There're 4 customer waiting on the line
=====================
Current Time: 11
nNewCustomer: 1
Customer with vip_level == 3 entered Repairing Shop at t=11
Customer with vip_level == 5 finish repairing at t=11!
Customer with vip_level == 5 start repairing at t=11!
There're 4 customer waiting on the line
=====================
Current Time: 12
nNewCustomer: 2
Customer with vip_level == 2 entered Repairing Shop at t=12
Customer with vip_level == 7 entered Repairing Shop at t=12
Customer with vip_level == 5 finish repairing at t=12!
Customer with vip_level == 7 start repairing at t=12!
There're 5 customer waiting on the line
=====================
Current Time: 13
nNewCustomer: 4
Customer with vip_level == 3 entered Repairing Shop at t=13
Customer with vip_level == 9 entered Repairing Shop at t=13
Customer with vip_level == 9 entered Repairing Shop at t=13
Customer with vip_level == 10 entered Repairing Shop at t=13
Customer with vip_level == 7 finish repairing at t=13!
Customer with vip_level == 10 start repairing at t=13!
There're 8 customer waiting on the line
=====================
Current Time: 14
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=14
Customer with vip_level == 10 finish repairing at t=14!
Customer with vip_level == 9 start repairing at t=14!
There're 8 customer waiting on the line
=====================
Current Time: 15
nNewCustomer: 1
Customer with vip_level == 3 entered Repairing Shop at t=15
Customer with vip_level == 9 finish repairing at t=15!
Customer with vip_level == 9 start repairing at t=15!
There're 8 customer waiting on the line
=====================
Current Time: 16
nNewCustomer: 2
Customer with vip_level == 9 entered Repairing Shop at t=16
Customer with vip_level == 8 entered Repairing Shop at t=16
Customer with vip_level == 9 finish repairing at t=16!
Customer with vip_level == 9 start repairing at t=16!
There're 9 customer waiting on the line
=====================
Current Time: 17
nNewCustomer: 1
Customer with vip_level == 9 entered Repairing Shop at t=17
Customer with vip_level == 9 finish repairing at t=17!
Customer with vip_level == 9 start repairing at t=17!
There're 9 customer waiting on the line
=====================
Current Time: 18
nNewCustomer: 1
Customer with vip_level == 10 entered Repairing Shop at t=18
Customer with vip_level == 9 finish repairing at t=18!
Customer with vip_level == 10 start repairing at t=18!
There're 9 customer waiting on the line
=====================
Current Time: 19
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=19
Customer with vip_level == 10 finish repairing at t=19!
Customer with vip_level == 8 start repairing at t=19!
There're 9 customer waiting on the line
=====================
Current Time: 20
nNewCustomer: 2
Customer with vip_level == 7 entered Repairing Shop at t=20
Customer with vip_level == 8 entered Repairing Shop at t=20
Customer with vip_level == 8 finish repairing at t=20!
Customer with vip_level == 8 start repairing at t=20!
There're 10 customer waiting on the line
=====================
Current Time: 21
nNewCustomer: 4
Customer with vip_level == 1 entered Repairing Shop at t=21
Customer with vip_level == 10 entered Repairing Shop at t=21
Customer with vip_level == 5 entered Repairing Shop at t=21
Customer with vip_level == 5 entered Repairing Shop at t=21
Customer with vip_level == 8 finish repairing at t=21!
Customer with vip_level == 10 start repairing at t=21!
There're 13 customer waiting on the line
=====================
Current Time: 22
nNewCustomer: 11
Customer with vip_level == 8 entered Repairing Shop at t=22
Customer with vip_level == 5 entered Repairing Shop at t=22
Customer with vip_level == 1 entered Repairing Shop at t=22
Customer with vip_level == 9 entered Repairing Shop at t=22
Customer with vip_level == 8 entered Repairing Shop at t=22
Customer with vip_level == 4 entered Repairing Shop at t=22
Customer with vip_level == 10 entered Repairing Shop at t=22
Customer with vip_level == 4 entered Repairing Shop at t=22
Customer with vip_level == 3 entered Repairing Shop at t=22
Customer with vip_level == 3 entered Repairing Shop at t=22
Customer with vip_level == 3 entered Repairing Shop at t=22
Customer with vip_level == 10 finish repairing at t=22!
Customer with vip_level == 10 start repairing at t=22!
There're 23 customer waiting on the line
=====================
Current Time: 23
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=23
Customer with vip_level == 10 finish repairing at t=23!
Customer with vip_level == 9 start repairing at t=23!
There're 23 customer waiting on the line
=====================
Current Time: 24
nNewCustomer: 2
Customer with vip_level == 3 entered Repairing Shop at t=24
Customer with vip_level == 8 entered Repairing Shop at t=24
Customer with vip_level == 9 finish repairing at t=24!
Customer with vip_level == 8 start repairing at t=24!
There're 24 customer waiting on the line
=====================
Current Time: 25
nNewCustomer: 1
Customer with vip_level == 9 entered Repairing Shop at t=25
Customer with vip_level == 8 finish repairing at t=25!
Customer with vip_level == 9 start repairing at t=25!
There're 24 customer waiting on the line
=====================
Current Time: 26
nNewCustomer: 1
Customer with vip_level == 8 entered Repairing Shop at t=26
Customer with vip_level == 9 finish repairing at t=26!
Customer with vip_level == 8 start repairing at t=26!
There're 24 customer waiting on the line
=====================
Current Time: 27
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=27
Customer with vip_level == 8 finish repairing at t=27!
Customer with vip_level == 8 start repairing at t=27!
There're 24 customer waiting on the line
=====================
Current Time: 28
nNewCustomer: 2
Customer with vip_level == 10 entered Repairing Shop at t=28
Customer with vip_level == 1 entered Repairing Shop at t=28
Customer with vip_level == 8 finish repairing at t=28!
Customer with vip_level == 10 start repairing at t=28!
There're 25 customer waiting on the line
=====================
Current Time: 29
nNewCustomer: 1
Customer with vip_level == 3 entered Repairing Shop at t=29
Customer with vip_level == 10 finish repairing at t=29!
Customer with vip_level == 8 start repairing at t=29!
There're 25 customer waiting on the line
=====================
Current Time: 30
nNewCustomer: 2
Customer with vip_level == 4 entered Repairing Shop at t=30
Customer with vip_level == 9 entered Repairing Shop at t=30
Customer with vip_level == 8 finish repairing at t=30!
Customer with vip_level == 9 start repairing at t=30!
There're 26 customer waiting on the line
=====================
Current Time: 31
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=31
Customer with vip_level == 9 finish repairing at t=31!
Customer with vip_level == 7 start repairing at t=31!
There're 26 customer waiting on the line
=====================
Current Time: 32
nNewCustomer: 1
Customer with vip_level == 10 entered Repairing Shop at t=32
Customer with vip_level == 7 finish repairing at t=32!
Customer with vip_level == 10 start repairing at t=32!
There're 26 customer waiting on the line
=====================
Current Time: 33
nNewCustomer: 4
Customer with vip_level == 3 entered Repairing Shop at t=33
Customer with vip_level == 6 entered Repairing Shop at t=33
Customer with vip_level == 2 entered Repairing Shop at t=33
Customer with vip_level == 2 entered Repairing Shop at t=33
Customer with vip_level == 10 finish repairing at t=33!
Customer with vip_level == 6 start repairing at t=33!
There're 29 customer waiting on the line
=====================
Current Time: 34
nNewCustomer: 4
Customer with vip_level == 7 entered Repairing Shop at t=34
Customer with vip_level == 8 entered Repairing Shop at t=34
Customer with vip_level == 3 entered Repairing Shop at t=34
Customer with vip_level == 3 entered Repairing Shop at t=34
Customer with vip_level == 6 finish repairing at t=34!
Customer with vip_level == 8 start repairing at t=34!
There're 32 customer waiting on the line
=====================
Current Time: 35
nNewCustomer: 1
Customer with vip_level == 8 entered Repairing Shop at t=35
Customer with vip_level == 8 finish repairing at t=35!
Customer with vip_level == 8 start repairing at t=35!
There're 32 customer waiting on the line
=====================
Current Time: 36
nNewCustomer: 3
Customer with vip_level == 6 entered Repairing Shop at t=36
Customer with vip_level == 7 entered Repairing Shop at t=36
Customer with vip_level == 2 entered Repairing Shop at t=36
Customer with vip_level == 8 finish repairing at t=36!
Customer with vip_level == 7 start repairing at t=36!
There're 34 customer waiting on the line
=====================
Current Time: 37
nNewCustomer: 1
Customer with vip_level == 6 entered Repairing Shop at t=37
Customer with vip_level == 7 finish repairing at t=37!
Customer with vip_level == 7 start repairing at t=37!
There're 34 customer waiting on the line
=====================
Current Time: 38
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=38
Customer with vip_level == 4 entered Repairing Shop at t=38
Customer with vip_level == 7 finish repairing at t=38!
Customer with vip_level == 6 start repairing at t=38!
There're 35 customer waiting on the line
=====================
Current Time: 39
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=39
Customer with vip_level == 6 finish repairing at t=39!
Customer with vip_level == 6 start repairing at t=39!
There're 35 customer waiting on the line
=====================
Current Time: 40
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=40
Customer with vip_level == 6 finish repairing at t=40!
Customer with vip_level == 5 start repairing at t=40!
There're 35 customer waiting on the line
=====================
Current Time: 41
nNewCustomer: 3
Customer with vip_level == 8 entered Repairing Shop at t=41
Customer with vip_level == 7 entered Repairing Shop at t=41
Customer with vip_level == 1 entered Repairing Shop at t=41
Customer with vip_level == 5 finish repairing at t=41!
Customer with vip_level == 8 start repairing at t=41!
There're 37 customer waiting on the line
=====================
Current Time: 42
nNewCustomer: 1
Customer with vip_level == 6 entered Repairing Shop at t=42
Customer with vip_level == 8 finish repairing at t=42!
Customer with vip_level == 7 start repairing at t=42!
There're 37 customer waiting on the line
=====================
Current Time: 43
nNewCustomer: 1
Customer with vip_level == 8 entered Repairing Shop at t=43
Customer with vip_level == 7 finish repairing at t=43!
Customer with vip_level == 8 start repairing at t=43!
There're 37 customer waiting on the line
=====================
Current Time: 44
nNewCustomer: 1
Customer with vip_level == 7 entered Repairing Shop at t=44
Customer with vip_level == 8 finish repairing at t=44!
Customer with vip_level == 7 start repairing at t=44!
There're 37 customer waiting on the line
=====================
Current Time: 45
nNewCustomer: 1
Customer with vip_level == 10 entered Repairing Shop at t=45
Customer with vip_level == 7 finish repairing at t=45!
Customer with vip_level == 10 start repairing at t=45!
There're 37 customer waiting on the line
=====================
Current Time: 46
nNewCustomer: 4
Customer with vip_level == 1 entered Repairing Shop at t=46
Customer with vip_level == 7 entered Repairing Shop at t=46
Customer with vip_level == 9 entered Repairing Shop at t=46
Customer with vip_level == 5 entered Repairing Shop at t=46
Customer with vip_level == 10 finish repairing at t=46!
Customer with vip_level == 9 start repairing at t=46!
There're 40 customer waiting on the line
=====================
Current Time: 47
nNewCustomer: 1
Customer with vip_level == 6 entered Repairing Shop at t=47
Customer with vip_level == 9 finish repairing at t=47!
Customer with vip_level == 7 start repairing at t=47!
There're 40 customer waiting on the line
=====================
Current Time: 48
nNewCustomer: 1
Customer with vip_level == 7 entered Repairing Shop at t=48
Customer with vip_level == 7 finish repairing at t=48!
Customer with vip_level == 7 start repairing at t=48!
There're 40 customer waiting on the line
=====================
Current Time: 49
nNewCustomer: 2
Customer with vip_level == 4 entered Repairing Shop at t=49
Customer with vip_level == 10 entered Repairing Shop at t=49
Customer with vip_level == 7 finish repairing at t=49!
Customer with vip_level == 10 start repairing at t=49!
There're 41 customer waiting on the line
=====================
Current Time: 50
nNewCustomer: 4
Customer with vip_level == 7 entered Repairing Shop at t=50
Customer with vip_level == 10 entered Repairing Shop at t=50
Customer with vip_level == 3 entered Repairing Shop at t=50
Customer with vip_level == 3 entered Repairing Shop at t=50
Customer with vip_level == 10 finish repairing at t=50!
Customer with vip_level == 10 start repairing at t=50!
There're 44 customer waiting on the line
```

## TODOs

  - [ ] stats generation
  
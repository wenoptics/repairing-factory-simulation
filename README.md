# Repairing Factory Simulation

[INFSCI 2500 DS] 

## Simulation Sample

### Condition: 

 - Customers enter the shop according to poisson distributions `lambda = 2`
 - Customers' VIP levels is another independent random variable.
 - The mechanic uses time that inversely proportional to VIP level units to finish one repairing, with 
 proportional `k = 4`
 - Simulation starts from `t=0` to `t=50`, `t` as **hour**

### Simulation Outputs:

``` 
===================== nowTime: 0 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=0
Customer with vip_level == 2 entered Repairing Shop at t=0
Customer (vip_level == 2) start repairing, after waited for 0 hours, at t=0!
There're 1 customer waiting on the line

===================== nowTime: 1 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=1
Customer with vip_level == 1 entered Repairing Shop at t=1
There're 3 customer waiting on the line

===================== nowTime: 2 =====================
nNewCustomer: 4
Customer with vip_level == 1 entered Repairing Shop at t=2
Customer with vip_level == 5 entered Repairing Shop at t=2
Customer with vip_level == 1 entered Repairing Shop at t=2
Customer with vip_level == 1 entered Repairing Shop at t=2
There're 7 customer waiting on the line

===================== nowTime: 3 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=3
Customer with vip_level == 1 entered Repairing Shop at t=3
Customer with vip_level == 2 finish repairing at t=3!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=3!
There're 8 customer waiting on the line

===================== nowTime: 4 =====================
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=4
Customer with vip_level == 5 finish repairing at t=4!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=4!
There're 8 customer waiting on the line

===================== nowTime: 5 =====================
nNewCustomer: 3
Customer with vip_level == 1 entered Repairing Shop at t=5
Customer with vip_level == 1 entered Repairing Shop at t=5
Customer with vip_level == 5 entered Repairing Shop at t=5
Customer with vip_level == 5 finish repairing at t=5!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=5!
There're 10 customer waiting on the line

===================== nowTime: 6 =====================
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=6
Customer with vip_level == 5 finish repairing at t=6!
Customer (vip_level == 2) start repairing, after waited for 0 hours, at t=6!
There're 10 customer waiting on the line

===================== nowTime: 7 =====================
nNewCustomer: 3
Customer with vip_level == 1 entered Repairing Shop at t=7
Customer with vip_level == 1 entered Repairing Shop at t=7
Customer with vip_level == 1 entered Repairing Shop at t=7
There're 13 customer waiting on the line

===================== nowTime: 8 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=8
There're 14 customer waiting on the line

===================== nowTime: 9 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=9
Customer with vip_level == 2 finish repairing at t=9!
Customer (vip_level == 1) start repairing, after waited for 6 hours, at t=9!
There're 14 customer waiting on the line

===================== nowTime: 10 =====================
nNewCustomer: 3
Customer with vip_level == 2 entered Repairing Shop at t=10
Customer with vip_level == 1 entered Repairing Shop at t=10
Customer with vip_level == 2 entered Repairing Shop at t=10
There're 17 customer waiting on the line

===================== nowTime: 11 =====================
nNewCustomer: 4
Customer with vip_level == 2 entered Repairing Shop at t=11
Customer with vip_level == 1 entered Repairing Shop at t=11
Customer with vip_level == 1 entered Repairing Shop at t=11
Customer with vip_level == 1 entered Repairing Shop at t=11
There're 21 customer waiting on the line

===================== nowTime: 12 =====================
nNewCustomer: 3
Customer with vip_level == 1 entered Repairing Shop at t=12
Customer with vip_level == 1 entered Repairing Shop at t=12
Customer with vip_level == 2 entered Repairing Shop at t=12
There're 24 customer waiting on the line

===================== nowTime: 13 =====================
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=13
There're 25 customer waiting on the line

===================== nowTime: 14 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=14
Customer with vip_level == 1 finish repairing at t=14!
Customer (vip_level == 2) start repairing, after waited for 4 hours, at t=14!
There're 25 customer waiting on the line

===================== nowTime: 15 =====================
nNewCustomer: 3
Customer with vip_level == 5 entered Repairing Shop at t=15
Customer with vip_level == 1 entered Repairing Shop at t=15
Customer with vip_level == 1 entered Repairing Shop at t=15
There're 28 customer waiting on the line

===================== nowTime: 16 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=16
There're 29 customer waiting on the line

===================== nowTime: 17 =====================
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=17
Customer with vip_level == 2 finish repairing at t=17!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=17!
There're 29 customer waiting on the line

===================== nowTime: 18 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=18
Customer with vip_level == 5 entered Repairing Shop at t=18
Customer with vip_level == 5 finish repairing at t=18!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=18!
There're 30 customer waiting on the line

===================== nowTime: 19 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=19
Customer with vip_level == 5 finish repairing at t=19!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=19!
There're 30 customer waiting on the line

===================== nowTime: 20 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=20
Customer with vip_level == 5 finish repairing at t=20!
Customer (vip_level == 2) start repairing, after waited for 9 hours, at t=20!
There're 30 customer waiting on the line

===================== nowTime: 21 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=21
There're 31 customer waiting on the line

===================== nowTime: 22 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=22
There're 32 customer waiting on the line

===================== nowTime: 23 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=23
Customer with vip_level == 2 finish repairing at t=23!
Customer (vip_level == 2) start repairing, after waited for 10 hours, at t=23!
There're 32 customer waiting on the line

===================== nowTime: 24 =====================
nNewCustomer: 3
Customer with vip_level == 1 entered Repairing Shop at t=24
Customer with vip_level == 1 entered Repairing Shop at t=24
Customer with vip_level == 1 entered Repairing Shop at t=24
There're 35 customer waiting on the line

===================== nowTime: 25 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=25
Customer with vip_level == 2 entered Repairing Shop at t=25
There're 37 customer waiting on the line

===================== nowTime: 26 =====================
nNewCustomer: 3
Customer with vip_level == 1 entered Repairing Shop at t=26
Customer with vip_level == 1 entered Repairing Shop at t=26
Customer with vip_level == 5 entered Repairing Shop at t=26
Customer with vip_level == 2 finish repairing at t=26!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=26!
There're 39 customer waiting on the line

===================== nowTime: 27 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=27
Customer with vip_level == 1 entered Repairing Shop at t=27
Customer with vip_level == 5 finish repairing at t=27!
Customer (vip_level == 2) start repairing, after waited for 15 hours, at t=27!
There're 40 customer waiting on the line

===================== nowTime: 28 =====================
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=28
There're 41 customer waiting on the line

===================== nowTime: 29 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=29
There're 42 customer waiting on the line

===================== nowTime: 30 =====================
nNewCustomer: 2
Customer with vip_level == 2 entered Repairing Shop at t=30
Customer with vip_level == 1 entered Repairing Shop at t=30
Customer with vip_level == 2 finish repairing at t=30!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=30!
There're 43 customer waiting on the line

===================== nowTime: 31 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=31
Customer with vip_level == 5 finish repairing at t=31!
Customer (vip_level == 2) start repairing, after waited for 6 hours, at t=31!
There're 43 customer waiting on the line

===================== nowTime: 32 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=32
Customer with vip_level == 1 entered Repairing Shop at t=32
There're 45 customer waiting on the line

===================== nowTime: 33 =====================
nNewCustomer: 3
Customer with vip_level == 2 entered Repairing Shop at t=33
Customer with vip_level == 1 entered Repairing Shop at t=33
Customer with vip_level == 1 entered Repairing Shop at t=33
There're 48 customer waiting on the line

===================== nowTime: 34 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=34
Customer with vip_level == 1 entered Repairing Shop at t=34
Customer with vip_level == 2 finish repairing at t=34!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=34!
There're 49 customer waiting on the line

===================== nowTime: 35 =====================
nNewCustomer: 4
Customer with vip_level == 1 entered Repairing Shop at t=35
Customer with vip_level == 5 entered Repairing Shop at t=35
Customer with vip_level == 5 entered Repairing Shop at t=35
Customer with vip_level == 1 entered Repairing Shop at t=35
Customer with vip_level == 5 finish repairing at t=35!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=35!
There're 52 customer waiting on the line

===================== nowTime: 36 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=36
Customer with vip_level == 5 entered Repairing Shop at t=36
Customer with vip_level == 5 finish repairing at t=36!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=36!
There're 53 customer waiting on the line

===================== nowTime: 37 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=37
Customer with vip_level == 5 finish repairing at t=37!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=37!
There're 53 customer waiting on the line

===================== nowTime: 38 =====================
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=38
Customer with vip_level == 5 finish repairing at t=38!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=38!
There're 53 customer waiting on the line

===================== nowTime: 39 =====================
nNewCustomer: 1
Customer with vip_level == 1 entered Repairing Shop at t=39
Customer with vip_level == 5 finish repairing at t=39!
Customer (vip_level == 2) start repairing, after waited for 6 hours, at t=39!
There're 53 customer waiting on the line

===================== nowTime: 40 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=40
Customer with vip_level == 5 entered Repairing Shop at t=40
There're 55 customer waiting on the line

===================== nowTime: 41 =====================
nNewCustomer: 1
Customer with vip_level == 5 entered Repairing Shop at t=41
There're 56 customer waiting on the line

===================== nowTime: 42 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=42
Customer with vip_level == 2 entered Repairing Shop at t=42
Customer with vip_level == 2 finish repairing at t=42!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=42!
There're 57 customer waiting on the line

===================== nowTime: 43 =====================
nNewCustomer: 2
Customer with vip_level == 2 entered Repairing Shop at t=43
Customer with vip_level == 1 entered Repairing Shop at t=43
Customer with vip_level == 5 finish repairing at t=43!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=43!
There're 58 customer waiting on the line

===================== nowTime: 44 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=44
Customer with vip_level == 1 entered Repairing Shop at t=44
Customer with vip_level == 5 finish repairing at t=44!
Customer (vip_level == 5) start repairing, after waited for 2 hours, at t=44!
There're 59 customer waiting on the line

===================== nowTime: 45 =====================
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=45
Customer with vip_level == 5 finish repairing at t=45!
Customer (vip_level == 5) start repairing, after waited for 1 hours, at t=45!
There're 59 customer waiting on the line

===================== nowTime: 46 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=46
Customer with vip_level == 1 entered Repairing Shop at t=46
Customer with vip_level == 5 finish repairing at t=46!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=46!
There're 60 customer waiting on the line

===================== nowTime: 47 =====================
nNewCustomer: 2
Customer with vip_level == 1 entered Repairing Shop at t=47
Customer with vip_level == 1 entered Repairing Shop at t=47
Customer with vip_level == 5 finish repairing at t=47!
Customer (vip_level == 2) start repairing, after waited for 9 hours, at t=47!
There're 61 customer waiting on the line

===================== nowTime: 48 =====================
nNewCustomer: 1
Customer with vip_level == 2 entered Repairing Shop at t=48
There're 62 customer waiting on the line

===================== nowTime: 49 =====================
nNewCustomer: 5
Customer with vip_level == 2 entered Repairing Shop at t=49
Customer with vip_level == 1 entered Repairing Shop at t=49
Customer with vip_level == 1 entered Repairing Shop at t=49
Customer with vip_level == 1 entered Repairing Shop at t=49
Customer with vip_level == 1 entered Repairing Shop at t=49
There're 67 customer waiting on the line

===================== nowTime: 50 =====================
nNewCustomer: 2
Customer with vip_level == 5 entered Repairing Shop at t=50
Customer with vip_level == 1 entered Repairing Shop at t=50
Customer with vip_level == 2 finish repairing at t=50!
Customer (vip_level == 5) start repairing, after waited for 0 hours, at t=50!
There're 68 customer waiting on the line



Statistics:
Total costs for customers: $830
There are still 68 customers still in the line:

```

## TODOs

  - [x] stats generation
  
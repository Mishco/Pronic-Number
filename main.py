# Python 3

# number of test cases
T = int(input())

while T > 0:

    # compute to n number
    n = int(input())
    i = 0
    list = []

    # do while
    while True:
     x = i * (i+1)
     if x > n:
        break
     list.append(x)
     i = i + 1
    # end of while True

    # print only list of
    print(*list)
    T = T-1

# end of while T > 0

# Code by Michal Slovik

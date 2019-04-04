# Code by Michal Slovik
# Python 3
import sys

def pronic_number():
    # number of test cases
    print("Please first define number of test case: ")
    T = int(input())

    while T > 0:
        print("Define to which pronic number you want to calculate: ")
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
        print("Results: ")
        print(*list)
        T = T-1
    # end of while T > 0

def main():
    pronic_number()
    sys.exit()

if __name__ == '__main__':
    main()
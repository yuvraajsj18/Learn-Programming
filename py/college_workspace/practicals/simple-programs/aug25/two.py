"""
    Write a python program to compute the future value of a specified
    principal amount, rate of interest, and a number of years.
"""

principal = float(input("Principal: "))
rate_of_interest = float(input("Rate of interest: "))
years = int(input("Number of years: "))

interest = principal * rate_of_interest * years
future_value = interest + principal

print("Future Value:", future_value)

"""
    Output:
            Principal: 1000
            Rate of interest: 0.1
            Number of years: 10
            Future Value: 2000.0
"""


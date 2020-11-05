"""
Write a program that makes use of a function to display sine, 
cosine, polynomial and exponential functions.
"""

import matplotlib.pyplot as plt
import math

def sine_curve():
    plt.subplot(2,2,1)
    degrees = range(0,360+1)
    sine_val = [math.sin(math.radians(i)) for i in degrees]
    plt.plot(degrees,sine_val)
    plt.xlabel('Degree')
    plt.ylabel('Sine Values')
    plt.title('Sine Curve')
    plt.grid()

def cosine_curve():
    plt.subplot(2,2,2)
    degrees = range(0,360+1)
    cos_val = [math.cos(math.radians(i)) for i in degrees]
    plt.plot(degrees,cos_val)
    plt.xlabel('Degree')
    plt.ylabel('Cosine Values')
    plt.title('Cosine Curve')
    plt.grid()

def polynomial(power, num_x):
    plt.subplot(2, 2, 3)
    xs = tuple(range(-num_x, num_x + 1))
    values = tuple(value**power for value in xs)

    plt.plot(xs, values)
    plt.xlabel("x")
    plt.ylabel("x^2")
    plt.title("y = x^2")
    plt.grid()

def exponential(base, num_x):
    plt.subplot(2, 2, 4)
    xs = tuple(range(num_x + 1))
    values = tuple(base**value for value in xs)

    plt.plot(xs, values)
    plt.xlabel("x")
    plt.ylabel(f"{base}^x")
    plt.title(f"y = {base}^x")
    plt.grid()

def main():
    sine_curve()
    cosine_curve()
    polynomial(2, 10)
    exponential(2, 10)
    plt.tight_layout()
    plt.show()

main()


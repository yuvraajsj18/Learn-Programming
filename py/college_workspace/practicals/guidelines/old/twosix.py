"""
Write a program that makes use of a function to plot a graph of people with pulse rate
p vs. height h. The values of p and h are to be entered by the user.
"""

import matplotlib.pyplot as plt

def plot_pulse_height(pulse_rates, heights):
    """plot a graph for pulse vs height"""

    plt.plot(heights, pulse_rates)
    plt.xlabel("height")
    plt.ylabel("pulse rate")
    plt.title("Height vs Pulse Rate")

    plt.grid()
    plt.show()

def main():
    heights = eval(input("Enter heights in a list: "))
    pulse_rates = eval(input("Enter pulse rates in a list: "))

    plot_pulse_height(pulse_rates, heights)

if __name__ == "__main__":
    main()

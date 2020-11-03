import matplotlib.pyplot as plt
import math

def sine_curve():
    plt.subplot(2,1,1)
    degrees = range(0,360+1)
    sine_val = [math.sin(math.radians(i)) for i in degrees]
    plt.plot(degrees,sine_val)
    plt.xlabel('Degree')
    plt.ylabel('Sine Values')
    plt.title('Sine Curve')
    plt.grid()

def cosine_curve():
    plt.subplot(2,1,2)
    degrees = range(0,360+1)
    cos_val = [math.cos(math.radians(i)) for i in degrees]
    plt.plot(degrees,cos_val)
    plt.xlabel('Degree')
    plt.ylabel('Cosine Values')
    plt.title('Cosine Curve')
    plt.grid()


def main():
    sine_curve()
    cosine_curve()
    plt.tight_layout()
    plt.show()

main()

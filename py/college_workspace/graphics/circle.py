import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plot_circle(radius):
    circle = patches.Circle((0,0),radius, facecolor='green'\
                                ,edgecolor='red',linestyle='dotted',antialiased=True)

    plt.gca().add_patch(circle)  # gca: get current axes
    plt.axis('scaled')
    plt.title('Circle')
    plt.show()


def main():
    radius = float(input('Enter the radius: '))
    plot_circle(radius)

main()
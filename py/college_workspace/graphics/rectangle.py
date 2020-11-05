import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plot_rectangle(breadth, length):
    rectangle = patches.Rectangle((1,1), width=breadth, height=length, fc='cyan'\
                                    ,ec='red',linestyle='dashed')

    plt.gca().add_patch(rectangle)
    plt.axis('scaled')
    plt.title('Rectangle')
    plt.show()


def main():
    breadth = float(input('Enter the breadth: '))
    length = float(input('Enter the length: '))
    plot_rectangle(breadth,length)

main()
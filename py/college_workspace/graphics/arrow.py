import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plot_arrow(pos,dx,dy):
    x,y = pos[0],pos[1]
    arrow = patches.Arrow(x,y,dx,dy,fill=False,hatch='*',width=2)   
    # x, y - starting point
    # dx, dy - head of the arrow relative to its base head = x + dx, y + dy

    plt.gca().add_patch(arrow)
    plt.axis('scaled')
    plt.title('Arrow')
    plt.show()


def main():
    pos = eval(input('Enter the starting position (x,y): '))
    dx = float(input('Enter dx: '))
    dy = float(input('Enter dy: '))
    plot_arrow(pos,dx,dy)

main()

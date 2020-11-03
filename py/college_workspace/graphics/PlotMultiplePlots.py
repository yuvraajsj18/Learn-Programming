import matplotlib.pyplot as plt

def plot_functions(x):
    y1 = [i**1 for i in x]
    y2 = [i**2 for i in x]
    y3 = [i**3 for i in x]
    y4 = [i**4 for i in x]
    y5 = [i**5 for i in x]
    y6 = [i**6 for i in x]
    
    plt.subplot(2,3,1)
    plt.plot(x,y1,'ro-')
    plt.xlabel('X')
    plt.ylabel('X')
    plt.title('X vs X')
    plt.grid()

    plt.subplot(2,3,2)
    plt.plot(x,y2,'b<--')
    plt.xlabel('X')
    plt.ylabel('X**2')
    plt.title('X vs X**2')
    plt.grid()

    plt.subplot(2,3,3)
    plt.plot(x,y3,'g*-.')
    plt.xlabel('X')
    plt.ylabel('X**3')
    plt.title('X vs X**3')
    plt.grid()

    plt.subplot(2,3,4)
    plt.plot(x,y4,'kx:')
    plt.xlabel('X')
    plt.ylabel('X**4')
    plt.title('X vs X**4')
    plt.grid()

    plt.subplot(2,3,5)
    plt.plot(x,y5,'mv-')
    plt.xlabel('X')
    plt.ylabel('X**5')
    plt.title('X vs X**5')
    plt.grid()

    plt.subplot(2,3,6)
    plt.plot(x,y6,'cp-.')
    plt.xlabel('X')
    plt.ylabel('X**6')
    plt.title('X vs X**6')
    plt.grid()

    plt.tight_layout()
    plt.show()
    plt.savefig('plotting')


def input_user():
    x = eval(input('Enter list x to be plotted: '))
    plot_functions(x)

input_user()
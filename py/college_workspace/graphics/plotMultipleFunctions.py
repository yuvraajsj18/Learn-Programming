import matplotlib.pyplot as plt

def plot_functions(a,b,step):
    n_steps = int((b-a)/step)
    x = [a + step*i for i in range(n_steps + 1)]
    y1 = [t**2 for t in x]
    y2 = [t**3 for t in x]
    plt.plot(x,y1,'ro--',label='X vs X**2')
    plt.plot(x,y2,'b<-.',label='X vs X**3')
    plt.legend()
    plt.xlabel('X')
    plt.ylabel('Y')
    plt.title('X vs X**2 and X vs X**3')
    plt.grid()
    plt.show()


def input_user():
    a = float(input('Enter first element: '))
    b = float(input('Enter last element: '))
    step = float(input('Enter step size: '))
    plot_functions(a,b,step)

input_user()
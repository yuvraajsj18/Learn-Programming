import matplotlib.pyplot as plt

def plot_histogram(data):
    # plt.hist(data)
    plt.hist(data,bins = [i-0.5 for i in range(1,max(data)+2)])
    plt.xlabel('Value')
    plt.ylabel('Frequency')
    plt.title('Histogram')
    plt.xlim(min(data)-1, max(data)+1)
    plt.show()

def user_input():
    data = eval(input('Enter data to be plotted: '))
    plot_histogram(data)
    
user_input()

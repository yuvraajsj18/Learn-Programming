import matplotlib.pyplot as plt

def plot_piechart(data,labels):
    plt.pie(data,labels = labels, autopct='%.2f')
    plt.title('Pie chart')
    plt.show()


def user_input():
    data = eval(input('Enter data to be plotted: '))
    labels = eval(input('Enter the labels: '))
    plot_piechart(data,labels)

user_input()
                        
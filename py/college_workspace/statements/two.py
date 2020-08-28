import math

n_v = 2.0 * 10 ** -3
q_v = 5
R = 3.18
T = 293

n = n_v * math.e ** (-q_v / (R ** T))

print(n)

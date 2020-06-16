"""
    Hackerrank challenge Nested Lists
    https://www.hackerrank.com/challenges/nested-list/problem
"""

from operator import itemgetter

if __name__ == '__main__':
    names = []
    scores = []
    names_score_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        names_score_list.append([name, score])

    names_score_list.sort(key = itemgetter(1, 0))

    lowest_score = names_score_list[0][1];
    second_lowest_scores_names = []
    second_lowest_score = 0
    for name, score in names_score_list:
        if score > lowest_score and (score < second_lowest_score or second_lowest_score == 0):
            second_lowest_scores_names.append(name)
            second_lowest_score = score
        elif score == second_lowest_score:
            second_lowest_scores_names.append(name)

    for name in second_lowest_scores_names:
        print(name)
            

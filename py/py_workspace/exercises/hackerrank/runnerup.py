"""
    Hackerrank problem Find the runner-up score
    https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/problem
"""

# def get_runnerup_score(score_list):
#     """ C style way of solving problem """
#     runnerup_score = score_list[0]
#     highest_score = score_list[0]
#     for score in score_list:
#         if score > highest_score:
#             runnerup_score = highest_score
#             highest_score = score
#         elif score > runnerup_score and score < highest_score:
#             runnerup_score = score

#     return runnerup_score

def get_runnerup_score(score_list):
    """ python way solving the problem """
    highest_score = max(score_list)
    while(max(score_list) == highest_score):
        score_list.remove(highest_score)

    runnerup_score = max(score_list)
    return runnerup_score

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))

    runnerup_score = get_runnerup_score(arr)
    print(runnerup_score)
from sort import *
import unittest

# Test cases for all sorts

class TestSort(unittest.TestCase):

    def test_bubble_sort(self):
        lists = [
            [5, 4, 3, 2, 1],
            [3, 1, 4, 2, 5],
            [1, 2, 3, 4, 5],
            [3, 3, 3, 3, 3],
            [1, 1, 1, 2, 2, 3, 3, 0, -5],
        ]
        for l in lists:
            self.assertEqual(sorted(l), bubble_sort(list(l)))

    def test_selection_sort(self):
        lists = [
            [5, 4, 3, 2, 1],
            [3, 1, 4, 2, 5],
            [1, 2, 3, 4, 5],
            [3, 3, 3, 3, 3],
            [1, 1, 1, 2, 2, 3, 3, 0, -5],
        ]

        for l in lists:
            self.assertEqual(sorted(l), selection_sort(list(l)))

    def test_insertion_sort(self):
        lists = [
            [5, 4, 3, 2, 1],
            [3, 1, 4, 2, 5],
            [1, 2, 3, 4, 5],
            [3, 3, 3, 3, 3],
            [1, 1, 1, 2, 2, 3, 3, 0, -5],
        ]

        for l in lists:
            self.assertEqual(sorted(l), insertion_sort(list(l)))


if __name__ == "__main__":
    unittest.main()

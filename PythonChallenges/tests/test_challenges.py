import unittest
from PythonChallenges.Algorithms.Algorithms import max_sub_array


class TestMaximumSubArray(unittest.TestCase):
    def test_example_array(self):
        self.assertEqual(6, max_sub_array([-2, 1, -3, 4, -1, 2, 1, -5, 4]))

    def test_for_one_length_array(self):
        self.assertEqual(2, max_sub_array([2]))

    def test_for_array_of_length2(self):
        self.assertEqual(1, max_sub_array([-2, 1]))

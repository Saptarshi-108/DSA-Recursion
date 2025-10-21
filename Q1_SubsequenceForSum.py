//Question: Write a program to print all the subsequences/count of an array that add up to become the result, sum.

def subsequence(arr, index, target, current):
    if index == len(arr):
        if target == 0:
            print(current)
            return 1
        return 0

    # Include current element
    current.append(arr[index])
    include = subsequence(arr, index + 1, target - arr[index], current)

    # Exclude current element
    current.pop()
    exclude = subsequence(arr, index + 1, target, current)

    return include + exclude


def find_subsequence(arr, target):
    current = []
    count = subsequence(arr, 0, target, current)
    print("Total number of sequences possible:", count)


if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    target = 5
    print(f"Subsequences with sum {target}:")
    find_subsequence(arr, target)


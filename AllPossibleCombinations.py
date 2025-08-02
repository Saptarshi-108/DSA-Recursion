def combinations(ind, dp, arr, n):
    if ind == n:
        if not dp:  # Check if dp is empty
            print("{}")  # Print empty set for empty subsequence
        else:
            print("{" + ", ".join(map(str, dp)) + "}")  # Print elements separated by comma
        return

    # Take
    dp.append(arr[ind])
    combinations(ind + 1, dp, arr, n)
    dp.pop()

    # Not take
    combinations(ind + 1, dp, arr, n)



n=int(input("Enter the number of elements in the array = "))
arr=[]
dp=[]
for i in range(n):
    num = int(input(f"Enter the {i}th element : "))
    arr.append(num)

combinations(0,dp,arr,n)




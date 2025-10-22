#Print all the sequences of the array that fulfills the target value sum.

def printall(ind,stack,s):
    if (ind==n):
        if (s==target):
            print(stack)
        return 
    
    stack.append(arr[ind])
    s+=arr[ind]
    printall(ind+1,stack,s)

    stack.pop()
    s-=arr[ind]
    printall(ind+1,stack,s)

n=int(input("Enter the number of terms in the array : "))
arr=[]
for i in range(n):
    val=int(input(f"Enter the element {i}th element : "))
    arr.append(val)
target=int(input("Enter the target :"))
printall(0,[],0)

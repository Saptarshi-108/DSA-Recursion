n=int(input("Enter the number of iterations : "))
def func(n):
    if (n<=1):
        return n
    return func(n-1)+func(n-2)
print(func(n-1))

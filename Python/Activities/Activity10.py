# # Given tuple
# tuple = list(input("Enter numbers with space :").split(" "))
# tuple = (50, 20, 35, 24,67, 46, 55)
print("Given list is ", tuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in tuple:
    if (num % 5 == 0):
        print(num)


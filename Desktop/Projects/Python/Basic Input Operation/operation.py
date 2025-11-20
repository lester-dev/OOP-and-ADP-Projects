# Take two numbers as input
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

# Perform multiple operations
print("Addition:", num1 + num2)
print("Subtraction:", num1 - num2)
print("Multiplication:", num1 * num2)
print("Division:", num1 / num2 if num2 != 0 else "Cannot divide by zero")
print("Modulus:", num1 % num2 if num2 != 0 else "Cannot perform modulus by zero")
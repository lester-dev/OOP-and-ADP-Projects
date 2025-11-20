# 1. Create a list of 5 fruits
fruits = ["apple", "banana", "mango", "orange", "grape"]

# Ask user for input to add and remove fruit
addFruit = input("Enter a fruit to add: ")
fruits.append(addFruit)  # add fruit
print("Updated fruit list:", fruits)

removeFruit = input("Enter a fruit to remove: ")
if removeFruit in fruits:
    fruits.remove(removeFruit)  # remove fruit
else:
    print(removeFruit, "is not in the list")
print("Final fruit list:", fruits)


# 2. Create a tuple of favorite animals
animals = ("dog", "cat", "elephant", "tiger", "parrot")
print("\nAll animals:", animals)

# Access the 2nd and last animal
print("2nd animal:", animals[1])
print("Last animal:", animals[-1])

# Try to change the 2nd animal (will cause error if uncommented)
# animals[1] = "lion"
# print(animals)


# 3. Create sets of sports and indoor activities
sports = {"soccer", "tennis", "basketball", "cycling", "swimming", "running"}
indoorActivities = {"chess", "reading", "coding", "painting", "cycling", "board games"}

# Display sets
print("\nSports Set:", sports)
print("Indoor Activities Set:", indoorActivities)

# Set operations
unionSet = sports | indoorActivities
differenceSet = sports - indoorActivities
intersectionSet = sports & indoorActivities

print("\nUnion of sets:", unionSet)
print("Difference (sports - indoor activities):", differenceSet)
print("Intersection:", intersectionSet)

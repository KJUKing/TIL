numbers = [1, "💖", 2, "🔥", 3, "⭐️", 4, "💖", 5, "🔥", 6, "⭐️", 7, "💖", 8, "🔥", 9, "⭐️", 10, "💖", 11, "🔥", 12, "⭐️", 13, "💖", 14, "🔥", 15, "⭐️", 16]

sum = 0
for i in numbers:
    p = (type(i))
    if p == int :
        sum += i

print(f"result : {sum}")

# numbers_sum = sum(filter(lambda i: isinstance(i, int), numbers))
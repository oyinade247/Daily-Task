import numbers


def descending_order(number):
    if number < 0:
        raise ValueError('Number cannot be negative')
    for digit in str(number):
        numbers = list(str(number))
        for num in range(len(numbers)):
            for char in range(len(numbers)):
                if numbers[num] > numbers[char]:
                    temp = numbers[num]
                    numbers[num] = numbers[char]
                    numbers[char] = temp
                    word = "".join(numbers)
    return word


numbers = 12345
print(descending_order(numbers))
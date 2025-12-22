def string_spaced_number(number):
    joined_list = []
    highest = number[0]
    for num in number:
        convert_number = list(num)
        for index in range(len(convert_number)):
            if convert_number[index] > highest:
                highest = convert_number[index]
            joined_list.append(highest)

    return highest

def lowest_number(numbers):
    numbers = numbers.split(' ')
    lowest = []
    print(numbers)
    lowest = numbers[0]
    for num in numbers:
        for index in range(len(numbers)):
            if numbers[index] < lowest:
                lowest = numbers[index]
    return lowest


def join_numbers(numbers):
    highest = string_spaced_number(numbers)
    lowest = lowest_number(numbers)
    result = highest + " " + lowest

    return result






num = "1 2 3 4 5"
print(join_numbers(num))
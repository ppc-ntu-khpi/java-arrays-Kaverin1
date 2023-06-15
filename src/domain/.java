1.
  def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def primes_in_range(start, end):
    primes = []
    for num in range(start, end + 1):
        if is_prime(num):
            primes.append(num)
    return primes

start = 1
end = 100
prime_array = primes_in_range(start, end)
prime_string = ', '.join(map(str, prime_array))
print(prime_string)

  2.
  def create_array(size):
    center = size // 2
    array = []
    for i in range(center, -center - 1, -1):
        array.append(abs(i))
    return array

array_size = 11
result_array = create_array(array_size)
print(result_array)

  3.
  from collections import Counter

def find_most_common_element(array):
    count = Counter(array)
    most_common = count.most_common(1)
    return most_common[0][0]

numbers = [1, 2, 3, 4, 5, 2, 3, 2, 1, 2, 4, 2, 2]
most_common_number = find_most_common_element(numbers)
print(most_common_number)

  4.
  expression = "1 + 33-4 * 7"
result = eval(expression)
print(result)

  5.
  def find_sum_combinations(n, k):
    def backtrack(target, start, combination):
        if target == 0 and len(combination) == k:
            combinations.append(list(combination))
        for i in range(start, n + 1):
            if i > target:
                break
            combination.append(i)
            backtrack(target - i, i, combination)
            combination.pop()

    combinations = []
    if k == 0:
        for k in range(1, n):
            backtrack(n, 1, [])
    else:
        backtrack(n, 1, [])
    return combinations

number = 6
combinations = find_sum_combinations(number, 0)
for combination in combinations:
    print(combination)

      6.
  def find_product_combinations(n, k):
    def backtrack(target, start, combination):
        if target == 1 and len(combination) == k:
            combinations.append(list(combination))
        for i in range(start, n + 1):
            if target % i == 0:
                combination.append(i)
                backtrack(target // i, i, combination)
                combination.pop()

    combinations = []
    if k == 0:
        for k in range(2, n):
            backtrack(n, 2, [])
    else:
        backtrack(n, 2, [])
    return combinations

number = 12
combinations = find_product_combinations(number, 0)
for combination in combinations:
    print(combination)

      7.
  lucky_tickets = 0
for ticket in range(100000, 1000000):
    digits = [int(d) for d in str(ticket)]
    if sum(digits[:3]) == sum(digits[3:]):
        lucky_tickets += 1

print(lucky_tickets)

  8.
  def sort_array(array):
    result = []
    group_size = 1
    while group_size <= len(array):
        sorted_groups = [sorted(array[i:i+group_size]) for i in range(0, len(array), group_size)]
        result.extend([elem for group in sorted_groups for elem in group])
        group_size *= 2
    return result

numbers = [5, 2, 8, 1, 7, 3, 6, 4]
sorted_numbers = sort_array(numbers)
print(sorted_numbers)

  9.
  def sort_array_without_duplicates(array):
    result = []
    group_size = 1
    while group_size <= len(array):
        sorted_groups = [sorted(array[i:i+group_size]) for i in range(0, len(array), group_size)]
        flattened_groups = [elem for group in sorted_groups for elem in group]
        unique_elements = []
        for num in flattened_groups:
            if num not in unique_elements:
                unique_elements.append(num)
        result.extend(unique_elements)
        group_size *= 2
    return result

numbers = [5, 2, 8, 1, 7, 3, 6, 4, 8, 2, 7, 5]
sorted_numbers = sort_array_without_duplicates(numbers)
print(sorted_numbers)

  10.
  def count_ways_to_climb(n):
    if n <= 1:
        return 1
    dp = [0] * (n + 1)
    dp[0] = 1
    dp[1] = 1
    for i in range(2, n + 1):
        dp[i] = dp[i - 1] + dp[i - 2]
    return dp[n]

steps = 10
ways = count_ways_to_climb(steps)
print(ways)

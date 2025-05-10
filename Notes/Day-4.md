# Quick Revision Notes - 08 March

## Topics Covered:

1. **Adam Number**:
   - A number is Adam if the square of the number and the square of its reverse are reverse of each other.

2. **Armstrong Number**:
   - A number is Armstrong if the sum of its digits raised to the power of the number of digits equals the number itself.

3. **Kaprekar Number**:
   - A number is Kaprekar if the sum of the left and right parts of its square equals the number.

4. **Strong Number**:
   - A number is Strong if the sum of the factorials of its digits equals the number.

5. **Normal Order**:
   - Print the digits of a number in their original order.

## Key Examples with Explanations:

- **Adam Number**:
  - Input: `12`
  - Explanation: Square of `12` is `144`, reverse of `12` is `21`, and square of `21` is `441`. Reverse of `441` is `144`, which matches the square of `12`.
  - Output: `Adam Number`

- **Armstrong Number**:
  - Input: `153`
  - Explanation: `1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153`, which equals the number itself.
  - Output: `Armstrong`

- **Kaprekar Number**:
  - Input: `45`
  - Explanation: Square of `45` is `2025`. Splitting `2025` into `20` and `25`, their sum is `20 + 25 = 45`, which equals the number.
  - Output: `Kaprekar Number`

- **Strong Number**:
  - Input: `145`
  - Explanation: Factorials of digits are `1! = 1`, `4! = 24`, `5! = 120`. Their sum is `1 + 24 + 120 = 145`, which equals the number.
  - Output: `Strong Number`

- **Normal Order**:
  - Input: `123`
  - Explanation: The digits of the number `123` are printed in their original order: `1 2 3`.
  - Output: `1 2 3`
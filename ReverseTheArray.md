**Write a method to reverse an array in-place without using any extra space.**

_Input: {1, 2, 3, 4, 5}
Output: {5, 4, 3, 2, 1}_
**Tricky Part:** Use two pointers to swap elements in-place while iterating only once.

**Solution**
**Two Pointers:** Use two pointers, left starting at the beginning of the array and right starting at the end.

**Swap:** Swap the elements at the left and right pointers.

**Move Pointers:** Increment left and decrement right until they meet or cross.

**In-Place Operation:** This approach does not require additional memory since the swapping happens within the array.

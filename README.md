# Groovy NullPointerException from Implicit Optional Unwrapping

This repository demonstrates a common Groovy error that can lead to a `NullPointerException`.  The problem arises from how Groovy handles null values and implicit unwrapping of optional types.

## The Bug

The `bug.groovy` file contains a method that fails to explicitly check for null input before attempting to access a method (`.length()` in this case). This causes a `NullPointerException` when a null value is passed to the method.

## Solution

The `bugSolution.groovy` file provides a corrected version of the method. It explicitly checks for null input and handles it gracefully, preventing the `NullPointerException`. This is a best practice for robust Groovy code.

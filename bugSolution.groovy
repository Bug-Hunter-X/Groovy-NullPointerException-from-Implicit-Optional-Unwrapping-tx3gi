```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Handle null input explicitly
  }
  return param.length()
}

println myMethod(null)
println myMethod("hello")
```
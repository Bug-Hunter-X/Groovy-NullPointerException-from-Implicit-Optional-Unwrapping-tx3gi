```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // This will cause a NullPointerException later
  }
  return param.length()
}

println myMethod(null)
println myMethod("hello")
```
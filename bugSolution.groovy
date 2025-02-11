```groovy
def myMethod(Map params) {
  def value = params.get("key")
  if (value != null) {
    println value
  } else {
    println "Key not found or value is null"
  }
}

myMethod([key: null]) // Handles null correctly
```
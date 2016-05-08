## XML Support

```
val is: InputStream = this.getClass.getClassLoader.getResourceAsStream(...)
val xml: Elem = XML.load(is)

xml \\ "element"
val poolName = (poolNode \ POOL_NAME_PROPERTY).text
```

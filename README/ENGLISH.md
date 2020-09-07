<h1 align="center">LocalDataPreservation</h1>

<p align="center">
  <a href="https://github.com/Im-Tae"><img alt="Author" src="https://img.shields.io/badge/author-Im--Tae-red.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>
<p align="center">  
Use this library to save local data and use it on android.</p>
<p align="center">
    <a href="https://github.com/Im-Tae/LocalDataPreservation/blob/master/README.md">KOREAN<a/>
</p>





## Download

[![](https://jitci.com/gh/Im-Tae/LocalDataPreservation/svg)](https://jitci.com/gh/Im-Tae/LocalDataPreservation) [![](https://jitpack.io/v/Im-Tae/LocalDataPreservation.svg)](https://jitpack.io/#Im-Tae/LocalDataPreservation) 

### Gradle

**Project : build.gradle**

```gradle
allprojects {
    repositories {
	    ...
	    maven { url 'https://jitpack.io' }
	}
}
```

**Module : build.gradle**

```gradle
dependencies {
    implementation 'com.github.Im-Tae:LocalDataPreservation:Version'
}
```



### Maven

```maven
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

```maven
<dependency>
	<groupId>com.github.Im-Tae</groupId>
	<artifactId>LocalDataPreservation</artifactId>
	<version>Version</version>
</dependency>
```



## Usage

##### Use it like following:



#### Save Data



**basic**

```kotlin
LocalDataPreservation.setData["key"] = value
```



**with domain**

```kotlin
data class User(
    val name: String,
    val age: Int
)
```

```kotlin
LocalDataPreservation.setData["user"] = User("ImLeaf", 19)
```

</br>



#### Get data



**basic**

```kotlin
LocalDataPreservation.getData("key")
```



**with domain**

```kotlin
LocalDataPreservation.getData("user") as User
```





</br>

## License

```
Copyright 2020 Im-Tae (TaeGeon Lim)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


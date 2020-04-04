## 下拉刷新框架

> 如何依赖此项目

~~~JAVA
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
    	  implementation 'com.github.yoyo0316:GodRefresh:v1.0.0'
    	}

~~~
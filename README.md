# Firebase Cloud Messaging (FCM) - API Client
[![](https://jitpack.io/v/tomsmolik/fcm-client.svg?label=Release)](https://jitpack.io/#tomsmolik/fcm-client)

API description is here: https://firebase.google.com/docs/cloud-messaging/http-server-ref

## Usage:


Sends to single device
```kotlin
    val client = FcmClient("[API-KEY]")
    
    val result: Response = runBlocking {
        client.send(
                Message(
                     to = "tokenId",
                     data = mapOf(
                         "message" to "Hello word!"
                     ),
                     notification = Notification("Notification Sample")
                )
        ).await()
    }      
```
Sends to multiple device

```kotlin
    val client = FcmClient("[API-KEY]")
    
    val result: Response = runBlocking {
        client.send(
                Message(
                     registrationIds = arrayListOf(
                         "tokenId",
                         "tokenId",
                         "..."
                     ),
                     data = mapOf(
                         "message" to "Hello word!"
                     ),
                     notification = Notification("Notification Sample")
                )
        ).await()
    }
```

## Gradle dependencies:

```gradle
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
    
	dependencies {
	        implementation 'com.github.tomsmolik:fcm-client:v1.4'
	}
```
## Maven dependencies:

```maven
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
    
	<dependency>
	    <groupId>com.github.tomsmolik</groupId>
	    <artifactId>fcm-client</artifactId>
	    <version>v1.4</version>
	</dependency>
```

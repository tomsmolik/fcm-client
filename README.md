# Firebase Cloud Messaging (FCM) - API Client

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

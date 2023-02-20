# Microsservice for email sending with RabbitMQ
***

# Configuration
Fill in the values of the following variables found in the application.properties file:

- spring.mail.username
- spring.mail.password*
- spring.rabbitmq.addresses
- spring.rabbitmq.queue

```*Access your Gmail account and set a new app password from the security menu.```

***
# Testing
#### URL: ```http://localhost:8080/sending-email```

#### BODY:  
```json
{
    "ownerRef": "Lucas",
    "emailFrom": "emailfrom@gmail.com",
    "emailTo": "emailto@gmail.com",
    "subject": "subject",
    "text": "Hello everything is fine? My name is Lucas Antonio Cardoso, I'm doing some studies about microservices and messaging with rabbitmq and this email is part of my tests."
}
```

# Sample HTTP API

A sample HTTP API using Kotlin and Ktor, with Gradle as build tool


## Overview

The project showcases the following CRUD Operations:

- GET
- POST
- DELETE


## API Reference

#### Get all customers

```
  GET /customer

  Returns a list of all customers
```


#### Get a customer

```
  GET /customer/{id}

  Returns a single customer by id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of customer to fetch |

#### Create new customer

```
  POST /customer

  Receives the new customer's information and saves it
```

#### Remove a customer

```
  DELETE /customer/{id}

  Removes a customer by id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of customer to remove |




#### Get all orders

```
  GET /order

  Returns a list of all orders
```


#### Get a single order

```
  GET /order/{id}

  Returns a single order by id
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of order to fetch |

#### Get a single order's total

```
  GET /order/{id}/total

  Returns an order's total
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of order to fetch total |


## Getting Started

1. Clone the repository:

   ```shell
   git clone git@github.com:Israeloyedele/first-http-api.git

2. Run the project locally


  ```shell
  cd first-http-api
./gradlew run
```
## Dependencies

The project uses the following dependencies:

- Ktor: A framework for building asynchronous servers and clients
- KTorm: A SQL-centric Kotlin ORM library

## LinkedIn Profile
* You can connect with me on LinkedIn: https://www.linkedin.com/in/israeloyedele


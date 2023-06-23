# Blogging App

## JSON Entities

### User

    {
	    "id": 31,
	    "username": "arnavg",
	    "email":	"arnav@blog.com",
	    "password": "xxxxxxxx",
	    "authToken": "dakjghadlghadlghladhgkgdklgladkgjadlkgd"
	    "bio": 		"writes really good blogs!",
	    "image":	"https://imgur.com/ahkbtqe.png"
    }

### Profile

    {
	    "username": "arnavg",
	    "bio": 		"writes really good blogs!",
	    "image":	"https://imgur.com/ahkbtqe.png"
    }

### Article

    {
	    "id": 134,
	    "title": "How the stock market fell in 2022",
	    "slug": "how-stock-market-fell-2022"
	    "subtitle": "An blog about how the stock market had a crash in 2022",
	    "body"	: "This is an blog about ..... <b>stock market</b> .... <i>2022</i> .........",
	    "createdAt":  "2022-02-06 03:40:55",
	    "tags"	: ["finance", "stocks"]
    }


### Comment

    {
	    "id": 1344,
	    "title": "great blog",
	    "body" : "this was a great blog, loved reading it!",
	    "createdAt: "2022-02-07 03:40:55"
    }

### Errors
```
{
    "message": "User with username: arnav123 not found"
}
```

## API Endpoints

### `POST /users`
create a new user

### `POST /users/login`

### `GET /profiles`📄

### `GET /profiles/{username}`


### `GET /blogs` 📄
get all blogs (default page size 10)
available filters

- `/blogs?tag=stocks`
- `/blogs?author=arnavg`
- `/blogs?page=3&size=10`

### `GET /blogs/{blog-slug}`

### `POST /blogs` 🔐
create a new blog

### `PATCH /blogs/{blog-slug}` 🔐👤
edit an blog


### `GET /blog/{blog-slug}/comments` 📄
get all comments of an blog

### `POST /blog/{blog-slug}/comments` 🔐

### `DELETE /blog/{blog-slug}/comments/{comment-id}` 🔐👤


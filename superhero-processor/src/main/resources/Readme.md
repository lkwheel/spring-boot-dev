#Spring Boot Microservice Development

I wanted to test my knowledge of how to develop a Microservice.
First I needed some data. I looked for a data API that could get
some interesting data. I found a resource that listed public, free
data that I could play with. This [site](https://github.com/public-apis/public-api) let me find this [Superhero data api](https://superheroapi.com/).

Next, I had to think of how to gather this data for my application. I wrote a DTO to capture the data from the service.

##Creating DTOs

A DTO is a Data Transfer Object, intended to carry data from one element of the application to another. Mapping a DTO to the service is sometimes
painstaking. A minimally documented API will make you build your DTO based on guesses. I looked at all of the example API calls for the Superhero API and thought I mapped them well, but I made mistakes.

I need to write something else to explain how I figure out the mapping, but won't be doing that here.

Now you have to write a Controller to get the result of your interaction
with the API.


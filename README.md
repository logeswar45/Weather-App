# Weather-App
**COMPANY**: CODTECH IT SOLUTIONS

**NAME**: LOGESWAR S

**INTERN ID**: CT08JFB

**DOMAIN**: JAVA PROGRAMMING

**BATCH DURATION**: JANUARY 5th,2025 to FEBRUARY 5th, 2025

**MENTOR NAME**: NEELA SANTHOSH KUMAR

**DESCRIPTION OF ABOVE TASK**: In this task, you are required to write a Java application that communicates with a public REST API, fetches relevant data, and then displays the data in a structured format. One of the common and widely used APIs for this purpose is the weather API, which provides weather-related data, such as current weather conditions, forecasts, and historical weather information. The application will focus on consuming a public REST API to fetch weather data and then display it in a structured and readable format.

Understanding REST APIs REST (Representational State Transfer) is an architectural style that uses a stateless communication mechanism over the HTTP protocol. RESTful APIs are widely used for web services and provide an easy way for systems to communicate with each other over the internet. They typically use standard HTTP methods like GET, POST, PUT, and DELETE to interact with resources.
In the case of the weather API, a user might use a GET request to retrieve weather information for a specific city or location. The response is generally in JSON format, which is a lightweight, human-readable data-interchange format.

Objective of the Task The primary goal of this task is to create a Java application that makes an HTTP request to a public weather API (or any other available REST API) to fetch weather data and displays this information in a structured format. This structured display can be in the form of plain text on the console or as a formatted report, depending on the requirements.
Here are the key steps involved:

Step 1: Setup and Dependencies To get started with the project, you need to set up the development environment with necessary libraries that will help handle HTTP requests and responses. In Java, libraries like HttpURLConnection or third-party libraries such as Apache HttpClient or OkHttp can be used to send HTTP requests to a REST API. For parsing JSON responses, the org.json library, Jackson, or Gson library can be used in Java. These libraries provide utilities to easily parse JSON data into Java objects and vice versa. To simplify this task, Maven or Gradle can be used for dependency management, so you don’t have to manually download and manage the libraries.

Step 2: Making the HTTP Request The next step is to send an HTTP request to the public weather API. You can use the GET method to fetch weather data, which usually involves specifying a query parameter, such as a city name or a geographic location.For instance, if you are using the OpenWeather API, a URL like https://api.openweathermap.org/data/2.5/weather?q=London&appid=your_api_key can be used. In this case: q=London: This specifies the city (e.g., London). appid=your_api_key: This is the API key required to authenticate the request. The Java application should use the appropriate HTTP client to send the GET request and retrieve the response.

Step 3: Parsing the JSON Response Once the HTTP request is sent and the response is received, the next step is to parse the JSON response. In a weather API, the JSON response will contain various weather parameters such as temperature, humidity, pressure, wind speed, weather description, etc. You will need to extract this data from the JSON response. To parse this JSON structure, you will need to: Extract the values for temperature, humidity, pressure, weather description, and wind speed. Convert temperature from Kelvin (default unit in some APIs) to Celsius or Fahrenheit if needed.

Step 4: Displaying the Data in Structured Format After extracting the relevant data from the JSON response, the application will then display this information in a structured format. The output can be displayed on the console or GUI (if applicable). The structured format ensures the user can easily interpret the data.

Step 5: Handling Errors and Edge Cases It is also crucial to handle errors in the application. If the API request fails (e.g., due to network issues or an invalid API key), the application should be able to display a user-friendly error message. In addition, you should check if the input (such as city name) is valid and handle any possible edge cases where the API does not return the expected data. Some common error responses from the API could be:

Invalid city name (e.g., "city not found"). API limit exceeded (if the API provider has a rate limit). Invalid API key. Step 6: Enhancements (Optional) Once you have the basic functionality working, you can extend the application with additional features such as:

Allowing the user to input the city name or location dynamically. Adding the option to display weather data in multiple units (e.g., Celsius, Fahrenheit, or Kelvin). Displaying a 7-day weather forecast instead of just current weather data. Creating a simple graphical user interface (GUI) using JavaFX or Swing for more interactive user experiences. Conclusion: The Java application that consumes a public REST API and displays data is a common and essential task in modern software development. By creating a program that handles HTTP requests, parses JSON responses, and displays the data in a user-friendly format, you are developing essential skills for interacting with web services and working with external data sources. This task will help you understand the importance of APIs in modern software applications and will give you practical experience in working with HTTP protocols and JSON parsing in Java.

**OUTPUT**: For example, the structured output on the console might look like this: Weather Information for London:
Temperature: 20°C Humidity: 82% Pressure: 1012 hPa Weather: Clear sky Wind Speed: 5.1 m/s This output allows the user to understand the weather conditions clearly. You can also format this in a more sophisticated way, depending on the needs, such as generating an HTML page for the user interface.

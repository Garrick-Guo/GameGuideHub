# GameGuideHub

## Overview

GameGuideHub is a web application that serves as a comprehensive hub for gamers and enthusiasts looking for information about their favorite games, top streams, videos, clips, and more. It leverages the Twitch API to provide real-time data and updates related to gaming content on the Twitch platform.

## Key Features

- **Game Information:** Retrieve detailed information about various games, including their titles, genres, and popularity.

- **Top Games:** Explore a list of the most popular games on Twitch based on current viewership statistics.

- **Live Streams:** Discover live gaming streams, allowing users to watch their favorite streamers in real-time.

- **Video Archives:** Access a library of past broadcasts, highlights, and videos associated with gaming content.

- **Popular Clips:** Find popular and trending clips from Twitch streams, showcasing memorable moments.

- **Authentication:** Utilize OAuth authentication to access the Twitch API securely.

## How It Works

GameGuideHub uses the Twitch API to make HTTP requests to specific endpoints, retrieving data in JSON format. The project handles API authentication to ensure secure access to Twitch resources. It then presents this data to users through a user-friendly web interface, allowing them to search for games, discover top streams, watch videos, and explore clips effortlessly.

## Authentication

To use the Twitch API, GameGuideHub requires client credentials, which can be obtained by registering the application on the Twitch Developer portal. Users can authenticate their requests to the API using OAuth tokens.

## Usage

- Gamers and enthusiasts can visit the GameGuideHub website.
- They can search for games, see top games, watch live streams, access video archives, and explore popular clips.
- Users can also interact with the content, such as commenting on streams and saving favorite games.

## API Documentation

GameGuideHub utilizes the Twitch API to retrieve data related to games, streams, videos, and clips. This section provides details on how to use the Twitch API endpoints in the context of this project.

### 1. Get Games

- **Endpoint:** `GET https://api.twitch.tv/helix/games`
- **Description:** Retrieve information about one or more games on Twitch.

### 2. Get Top Games

- **Endpoint:** `GET https://api.twitch.tv/helix/games/top`
- **Description:** `Get a list of the top games on Twitch by viewership.`

### 3.Get Streams
- **Endpoint:** `GET https://api.twitch.tv/helix/streams`
- **Description:** `Retrieve live streams on Twitch, with various filtering options.`

### 4. Get Videos
- **Endpoint:** `GET https://api.twitch.tv/helix/videos`
- **Description:** Get video information, including past broadcasts and highlights.

### 5. Get Clips
- **Endpoint:** GET https://api.twitch.tv/helix/clips
- **Description:** Retrieve popular clips on Twitch.

### 6. Getting Tokens (OAuth)
- **Endpoint:** POST https://id.twitch.tv/oauth2/token
- **Description:** Obtain OAuth tokens using the client credentials grant flow.

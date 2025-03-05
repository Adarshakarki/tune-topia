# Music Player App

## Overview
This project is a music player application developed in Kotlin that integrates with the YouTube Music API. The app allows users to search for music by title, artist, or album, display search results, and play music directly within the application.

## Features
- Search music by title, artist, or album.
- Display search results with album covers, song titles, and artists.
- Play music directly within the app.
- Basic playback controls including play, pause, skip, and volume control.

## Project Structure
The project is organized as follows:

```
MusicPlayerApp
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── musicplayerapp
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── api
│   │   │   │               │   └── YouTubeMusicApi.kt
│   │   │   │               ├── model
│   │   │   │               │   └── Music.kt
│   │   │   │               ├── repository
│   │   │   │               │   └── MusicRepository.kt
│   │   │   │               ├── ui
│   │   │   │               │   ├── MusicPlayerFragment.kt
│   │   │   │               │   └── SearchFragment.kt
│   │   │   │               └── viewmodel
│   │   │   │                   └── MusicViewModel.kt
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── fragment_music_player.xml
│   │   │   │   │   └── fragment_search.xml
│   │   │   │   ├── drawable
│   │   │   │   └── values
│   │   │   │       ├── strings.xml
│   │   │   │       └── styles.xml
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## Setup Instructions
1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Ensure you have the necessary dependencies installed.
4. Configure the YouTube Music API key in the `YouTubeMusicApi.kt` file.
5. Build and run the application on an Android device or emulator.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
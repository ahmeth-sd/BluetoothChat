# Android Bluetooth Chat App 

This Android app provides a lifeline during emergencies like earthquakes when traditional communication networks fail. It enables direct communication and location sharing between individuals and rescue teams using Bluetooth technology.

* Scanning for nearby Bluetooth devices
* Displaying paired and discovered devices
* Starting and stopping the discovery process
* Sending messages via Bluetooth connection
* Quickly send a distress message with your location to nearby devices.
* Building a solid foundation with clean architecture
  

## Table of Contents

* [Features](#features)
* [Project Structure](#project-structure)
* [Prerequisites](#prerequisites)
* [Setup](#setup)
* [Usage](#usage)
* [Important Notes](#technical-details)
* [Future Enhancements](#future-enhancements)


## Features

* **Clean Architecture:** Project is structured into domain, data, and presentation layers for maintainability and testability.
* **Bluetooth Scanning:**  Robustly scans for both paired and unpaired Bluetooth devices.
* **Device Listing:**  Presents discovered devices in a user-friendly list.
* **Discovery Control:**  Allows the user to initiate and stop the Bluetooth discovery process.
* **SOS Functionality:** Quickly send a distress message with your location to nearby devices.
* **Dagger Hilt:**  Uses Dagger Hilt for dependency injection, simplifying object creation and management.

## Project Structure

* **domain:** Contains core business logic and use cases.
* **data:**  Handles data interactions and provides implementations for the domain layer.
* **presentation:**  Includes UI components, ViewModels, and handles user interactions.

## Prerequisites

* Android device with Bluetooth capability.
* Location services enabled on your device.

## Setup

1. Clone this repository: `git clone https://github.com/ahmeth-sd/BluetoothChat.git`
2. Open the project in Android Studio.
3. Build and run the app on two separate Android devices.

## Usage

1. Pairing:
 * Open the app on both devices.
 * Tap the "Scan" button to discover nearby devices.
 * Select the device you want to connect to and tap "Pair."
2. Chatting:
 * Once paired, you can send and receive text messages.
3. SOS Location Sharing:
 * In an emergency, tap the "SOS" button.
 * Your location will be sent as a message to the connected device.

## Technical Details
* Languages: Java, Kotlin
* Architecture: MVC (Model-View-Controller)
* Dependency Management: Dagger Hilt
* Bluetooth Library: Android Bluetooth API
* IDE: Android Studio
* Testing on physical devices is highly recommended, as emulators may have limitations with Bluetooth simulation.

## Future Enhancements

* Multimedia Sharing: Share images and videos.
* Voice Communication: Enable voice messaging.
* Offline Maps: Integrate offline maps for navigation and location sharing without internet.
* Emergency Services Integration: Directly relay SOS messages and location data to emergency responders.


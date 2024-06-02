# Android Bluetooth Chat App 

This repository contains the initial code for an Android Bluetooth Chat App,  In this first part, we focus on:

* Scanning for nearby Bluetooth devices
* Displaying paired and discovered devices
* Starting and stopping the discovery process
* Sending messages via Bluetooth connection
* Building a solid foundation with clean architecture
  

## Table of Contents

* [Features](#features)
* [Project Structure](#project-structure)
* [Prerequisites](#prerequisites)
* [Setup](#setup)
* [Usage](#usage)
* [Important Notes](#important-notes)
* [Future Enhancements](#future-enhancements)
* [License](#license)

## Features

* **Clean Architecture:** Project is structured into domain, data, and presentation layers for maintainability and testability.
* **Bluetooth Scanning:**  Robustly scans for both paired and unpaired Bluetooth devices.
* **Device Listing:**  Presents discovered devices in a user-friendly list.
* **Discovery Control:**  Allows the user to initiate and stop the Bluetooth discovery process.
* **Dagger Hilt:**  Uses Dagger Hilt for dependency injection, simplifying object creation and management.

## Project Structure

* **domain:** Contains core business logic and use cases.
* **data:**  Handles data interactions and provides implementations for the domain layer.
* **presentation:**  Includes UI components, ViewModels, and handles user interactions.

## Prerequisites

* Android Studio (Bumblebee or later recommended)
* Two physical Android devices (emulators may not fully support Bluetooth testing)
* Basic understanding of Kotlin and Android development

## Setup

1. Clone this repository: `git clone https://github.com/ahmeth-sd/BluetoothChat.git`
2. Open the project in Android Studio.
3. Build and run the app on two separate Android devices.

## Usage

1. Grant the app the necessary Bluetooth permissions when prompted.
2. The app will automatically start scanning for Bluetooth devices.
3. Tap the "Start Scan" button to refresh the list if needed.
4. Tap the "Stop Scan" button to halt the discovery process.
5. On one device, tap the "Start Server" button.
6. On the other device, find the server device in the list and tap to connect.
7. Once connected, the chat screen will appear on both devices.
8. Type messages in the text field and tap "Send" to exchange messages.

## Important Notes

* Testing on physical devices is highly recommended, as emulators may have limitations with Bluetooth simulation.

## Future Enhancements

* Implement device connection and data transfer.
* Implement SOS Location Sending
* Handle error cases and edge scenarios.
* Improve UI/UX design.



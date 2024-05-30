# Android Bluetooth Chat App (Part 1)

This repository contains the initial code for an Android Bluetooth Chat App, following a tutorial series. In this first part, we focus on:

* Scanning for nearby Bluetooth devices
* Displaying paired and discovered devices
* Starting and stopping the discovery process
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

1. Clone this repository: `git clone https://github.com/your-username/android-bluetooth-chat-app.git`
2. Open the project in Android Studio.
3. Build and run the app on two separate Android devices.

## Usage

1. Grant the app the necessary Bluetooth permissions when prompted.
2. The app will automatically start scanning for Bluetooth devices.
3. Tap the "Start Scan" button to refresh the list if needed.
4. Tap the "Stop Scan" button to halt the discovery process.

## Important Notes

* This is the first part of a multi-part tutorial. Device connection and chat functionality will be added in subsequent parts.
* Testing on physical devices is highly recommended, as emulators may have limitations with Bluetooth simulation.

## Future Enhancements

* Implement device connection and data transfer.
* Add chat messaging interface.
* Handle error cases and edge scenarios.
* Improve UI/UX design.


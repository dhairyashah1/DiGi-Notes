# DiGi-Notes
<p align="center">
<img src="https://user-images.githubusercontent.com/65485065/118532638-d26e7900-b764-11eb-8218-fdb8c7bba510.jpeg" width="130" height="150"></p>

## Idea of the Project
The main aim is to create a Kotlin app which ensures storage of all notes at one place digitally.
1. Document Scanner
2. Audio to text Converter

## Description
It has been quite monotonous to take notes manually from meet for any other audio input resource. To meet this need, the first primary feature implemented is **audio to text converter**.

Also after achieving this, we have added a functionality of document scanner(like cam scanner) to serve the need of scanning notes manually.

Proper structuring of such data in either pdf or text format within subject specific folders is available as per requirement of the user.

## Features
1. Audio to text inbuilt kotlin.
2. Scanning documents, cropping, editing, etc.
3. Storage of text files, documents, etc in a folder.
4. Basic Authentication.
5. Data to be stored in virtual cloud as well as local storage of the user.
6. Automatic crop without ML.
7. Proper storage with respective category or subject.
8. UI (screens). 

## Tech Stack
* Auth Service (Authentication).
* Frontend, Backend - Kotlin, Android.
* Database - Firestore, Firebase, Room DB (offline).

## App Flow
* User Authentication - Includes Login and SignUp pages.

* Home Screen - Contains Folders and Add Folder Buttons. FOLDER STRUCTURE :- Can have nested Folders.

* Inside at least one folder, list of documents stored previously will be present along with 2 options RECORD / SCAN  for a NEW DOCUMENT:
* SCAN - Will open the scanner page.
* RECORD - Will record audio and keeps writing it to a text document.

## Future Features
1. After learning ML, a feature of summary maker to be added.
2. Use of ML in Scanner to reduce time for scanning (relevant page detection and crop it) and self adjust documents to be readable enough.






 


 



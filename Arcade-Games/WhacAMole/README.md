# Whac-A-Mole
**Interactive Java Swing Game**

### 🎮 How to Play
* **The Goal**: Click the moles as they pop up to gain points.
* **Avoid**: Do not click the piranhas, or you will lose points/health!
* **Reset**: Use the reset button to start a new round at any time.

### 🛠️ Key Logic
* **Tile State**: Uses a dedicated `Tile` class to track mole visibility.
* **Randomized Spawning**: Uses `java.util.Random` paired with a Swing Timer for the game loop.

### 🚀 Launch
```bash
./gradlew run

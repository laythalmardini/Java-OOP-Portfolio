# PacMan
**Interactive Java Swing Game**

### 🎮 How to Play
* **The Goal**: Navigate the maze and eat all the food pellets to advance through the three available levels.
* **Power Ups**: Eat the large Power Pellets to turn ghosts into their "scared" state, allowing you to eat them for 200 points.
* **Bonus**: Collect the cherries that spawn every 50 pellets eaten for a score bonus.
* **Avoid**: Stay away from ghosts; colliding with one will cost you a life. The game ends when all three lives are lost.

### 🛠️ Key Logic
* **Entity Management**: Utilizes an inheritance-based system where `Player` and `Ghost` extend a core `Entity` class to handle basic positioning and collisions.
* **Dynamic Level Loading**: Features a multi-level system that parses 2D string arrays into playable game boards, clearing and resetting walls, food, and entities upon level transitions.
* **State-Driven Rendering**: Manages complex game states including win/loss conditions, ghost vulnerability timers, and flashing animations for ghosts about to recover.
* **Asset Pipeline**: Integrates high-resolution PNG sprites for Pac-Man’s directional movement, unique ghost colors, and environment objects like power pellets and cherries.

### 🚀 Launch
```bash
./gradlew run

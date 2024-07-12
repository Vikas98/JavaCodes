import tkinter as tk
import random

# Define the snake and ladder positions
snakes = {
    99: 54,
    70: 55,
    62: 47,
    64: 60,
    17: 7
}

ladders = {
    4: 14,
    9: 31,
    20: 38,
    28: 84,
    40: 59,
    63: 81,
    71: 91
}

# Initialize player positions
player1_position = 0
player2_position = 0

# Function to roll the dice
def roll_dice():
    return random.randint(1, 6)

# Function to move the player
def move_player(player, dice):
    global player1_position, player2_position

    if player == 1:
        old_position = player1_position
        player1_position += dice

        # Check for snake or ladder
        if player1_position in snakes:
            player1_position = snakes[player1_position]
            result_label.config(text=f"Oh no, Player 1 got bitten by a snake at {old_position}!")
            play_sound("snake.wav")  # Play snake sound
        elif player1_position in ladders:
            player1_position = ladders[player1_position]
            result_label.config(text=f"Yay, Player 1 climbed a ladder at {old_position}!")
            play_sound("ladder.wav")  # Play ladder sound

        # Check if Player 1 has won
        if player1_position >= 100:
            result_label.config(text="Player 1 has won the game!")
            disable_buttons()
            play_sound("win.wav")  # Play win sound

        update_player_position(player1_token, player1_position, "red")

    else:
        old_position = player2_position
        player2_position += dice

        # Check for snake or ladder
        if player2_position in snakes:
            player2_position = snakes[player2_position]
            result_label.config(text=f"Oh no, Player 2 got bitten by a snake at {old_position}!")
            play_sound("snake.wav")  # Play snake sound
        elif player2_position in ladders:
            player2_position = ladders[player2_position]
            result_label.config(text=f"Yay, Player 2 climbed a ladder at {old_position}!")
            play_sound("ladder.wav")  # Play ladder sound

        # Check if Player 2 has won
        if player2_position >= 100:
            result_label.config(text="Player 2 has won the game!")
            disable_buttons()
            play_sound("win.wav")  # Play win sound

        update_player_position(player2_token, player2_position, "blue")

# Function to disable buttons after game ends
def disable_buttons():
    player1_roll_button.config(state="disabled")
    player2_roll_button.config(state="disabled")

# Function to update player position on the board
def update_player_position(token, position, color):
    canvas.coords(token, (position % 10) * 50 + 25, (9 - position // 10) * 50 + 25)
    canvas.itemconfig(token, fill=color)

    # Move the token gradually
    for i in range(10):
        canvas.move(token, (position % 10 - token_position[token] % 10) * 5,
                    (token_position[token] // 10 - 9 + position // 10) * 5)
        canvas.update()
        canvas.after(50)  # Delay for smoother animation

    token_position[token] = position

# Play sound effect
def play_sound(sound_file):
    try:
        import winsound
        winsound.PlaySound(sound_file, winsound.SND_ASYNC)
    except ImportError:
        print(f"Warning: Failed to play sound {sound_file}")

# Create the main window
window = tk.Tk()
window.title("Snake and Ladder Game")

# Create a canvas for the board
canvas = tk.Canvas(window, width=500, height=500)
canvas.pack()

# Draw the board
for i in range(10):
    for j in range(10):
        x1 = j * 50
        y1 = i * 50
        x2 = x1 + 50
        y2 = y1 + 50
        canvas.create_rectangle(x1, y1, x2, y2, fill="light green", outline="black")
        canvas.create_text((x1 + x2) / 2, (y1 + y2) / 2, text=str(10 * i + j + 1))

# Draw the snakes
for snake in snakes:
    x1 = (snake % 10) * 50 + 10
    y1 = (9 - snake // 10) * 50 + 10
    x2 = (snakes[snake] % 10) * 50 + 40
    y2 = (9 - snakes[snake] // 10) * 50 + 40
    canvas.create_line(x1, y1, x2, y2, fill="red", width=5)
    canvas.create_oval(x2 - 10, y2 - 10, x2 + 10, y2 + 10, fill="red", outline="black")

# Draw the ladders
for ladder in ladders:
    x1 = (ladder % 10) * 50 + 10
    y1 = (9 - ladder // 10) * 50 + 10
    x2 = (ladders[ladder] % 10) * 50 + 40
    y2 = (9 - ladders[ladder] // 10) * 50 + 40
    canvas.create_line(x1, y1, x2, y2, fill="green", width=5)

# Create player tokens
player1_token = canvas.create_oval(25, 475, 35, 485, fill="red", outline="black")
player2_token = canvas.create_oval(45, 475, 55, 485, fill="blue", outline="black")
token_position = {player1_token: 0, player2_token: 0}  # Store token positions

# Create a label for the result
result_label = tk.Label(window, text="")
result_label.pack()

# Create buttons for players to roll the dice
player1_roll_button = tk.Button(window, text="Player 1 Roll", command=lambda: move_player(1, roll_dice()))
player1_roll_button.pack(side=tk.LEFT, padx=10)

player2_roll_button = tk.Button(window, text="Player 2 Roll", command=lambda: move_player(2, roll_dice()))
player2_roll_button.pack(side=tk.LEFT, padx=10)

# Start the main event loop
window.mainloop()
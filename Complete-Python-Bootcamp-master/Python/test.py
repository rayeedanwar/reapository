text = input ("Enter some text (The loop will only end when you type exit): ")
textStorage = ""
while text != "exit":
	textStorage += text + " "
	text = input("Enter some text (The loop will only end when you type exit): ")

print("Exited the loop")
print(textStorage)	
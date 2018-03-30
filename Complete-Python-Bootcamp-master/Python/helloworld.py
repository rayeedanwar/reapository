#Returns the sum of num1 and num2
def add(num1, num2):
	return num1 + num2
def sub(num1, num2):
	return num1 - num2
def div(num1, num2):
	return num1 / num2
def mul(num1, num2):
	return num1 * num2

#*, -, /

def main():
	operation = input("What do you want to do? (+, -, *, /)")
	if(operation != '+' and operation != '-' and operation != '*' and operation != '/'):
		#invalid operation
		print("Wrong answer, foo!")
	else:
		num1= int(input ("Enter num1: "))
		num2= int(input ("Enter num2: "))
		if (operation == '+'):
			print(add(num1, num2))
		elif (operation == '-'):
			print(sub(num1, num2))
		elif (operation == '/'):
			print(div(num1, num2))
		else:
			print(mul(num1, num2))
	


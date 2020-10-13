# Testing & Debugging
import pdb

def max3(n1, n2, n3):
	pdb.set_trace()

	maxNumber = 0;
	# if n1 > n2:
	# 	if n1 > n3:
	# 		maxNumber = n1
	if n1 > n2 and n1 > n3:
			maxNumber = n1
	elif n2 > n3:
			maxNumber = n2
	else:
			maxNumber = n3
	return maxNumber	

def main():
	n1 = int(input('Enter first Number'))
	n2 = int(input('Enter second Number'))
	n3 = int(input('Enter third Number'))
	maximum = max3(n1,n2,n3)
	print('The maximum number is :', maximum)
  
if __name__ == "__main__":
    main()

# h for help in pdb

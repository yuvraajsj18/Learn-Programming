if __name__ == "__main__":
    # writing to a file
    f = open("sample.txt", 'w')
    f.write("This is the first line\n")
    f.write("This is the second line")
    f.close()

    # reading entire file
    f = open("sample.txt", 'r')
    print(f.read())

    # using with context manager
    with open("sample.txt", 'a') as f:
        f.write("More content in second line\n")
        f.write("This is the third line\n")
        # you can flush with f.flush() if required
        # no need to close the file manually with with

    with open('sample.txt', 'r') as f:
        i = 1
        for line in f:
            print(f"Line {i} {line}")
            i += 1

    with open("sample.txt", 'r') as f:
        line1 = f.readline()
        print(line1)
    
    with open("sample.txt", 'r') as f:
        all_lines = f.readlines()   # returns a list of all lines

    print(all_lines)
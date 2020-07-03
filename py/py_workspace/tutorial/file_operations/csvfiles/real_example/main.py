import csv

with open("input.csv", 'r') as inputFile:
    with open('output.csv', 'w') as outputFile:
        csv_reader = csv.reader(inputFile)
        csv_writer = csv.writer(outputFile)
        csv_writer.writerow(['name', 'wages'])
        count = 0
        for line in csv_reader:
            if count > 0:    # skip line 0
                csv_writer.writerow([line[0], int(line[1]) * 15])
            count += 1

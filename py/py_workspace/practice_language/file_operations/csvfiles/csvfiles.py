import csv

if __name__ == "__main__":
    
    # reading from a csv file
    with open("mock_data.csv", 'r') as f:
        csv_reader = csv.reader(f)
        number_of_lines = 0
        for row in csv_reader:  # returns a list of values as string
            print(row)
            if number_of_lines == 10:
                break
            number_of_lines += 1
        

    # writing a csv file
    with open('my_csv_file0.csv', 'w') as f:
        csv_writer = csv.writer(f)
        csv_writer.writerow(['name', 'age'])    # writes a row from a list
        csv_writer.writerow(['Harry Potter', '11'])

    # writing multiple rows at once from an iterable of rows
    data = [
        ['name', 'age'],
        ['harry potter', 11],
        ['ron wiesly', 11],
        ['hermoinie granger', 11]
    ]
    with open("my_csv_file1.csv", 'w') as f:
        csv_writer = csv.writer(f)
        csv_writer.writerows(data)
    
    # writing with a dictionary to csv
    data = {
        "name": "Harry Potter",
        "age": 11
    }
    with open("my_csv_file2.csv", 'r+') as f:
        fields = ['name', 'age']
        csv_writer = csv.DictWriter(f, fieldnames=fields)
        csv_writer.writeheader()
        csv_writer.writerow(data)

        f.seek(0)
        csv_reader = csv.reader(f)
        for line in csv_reader:
            print(line)

        f.seek(0)
        csv_reader = csv.DictReader(f, fieldnames=fields)
        for line in csv_reader:
            for key, value in line.items():
                print(key, value)
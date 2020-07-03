import json

if __name__ == "__main__":
    sample = {
        "name"  :   "Harry Potter",
        'age'  :   11
    }

    sample_json = json.dumps(sample)    # encodes a dict into a json string
    print(sample_json)
    print(type(sample_json))

    original_sample = json.loads(sample_json)   # decodes a json string object into a dictionary
    print(original_sample)
    print(type(original_sample))

    # writing json into a file
    with open("my_json_file.json", 'w') as jsonFile:
        jsonFile.write(sample_json)
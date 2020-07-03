class RecipeNotValidError(Exception):
    def __init__(self):
        self.message = "Your recipe is not valid"

    def __str__(self):
        return self.message


if __name__ == "__main__":
    try:
        raise RecipeNotValidError
    except RecipeNotValidError as e:
        print(e)

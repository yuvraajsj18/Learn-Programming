"""
    Use classes, constructor, instance attributes, class attributes, instance methods and class methods
"""

# represents google chrome browser
class Chrome:
    # class attributes are declares here, they belong to the class means they are same for all instances
    __NO_OF_WINDOWS = 0     # private
    __connected = True      # private
    _extensions = []        # protected


    def __init__(self, page = "Home"):  # ctor
        # here are instance attributes
        self.current_page = page
        self.history = []
        if page != 'Home':
            self.history = [page]
        self.is_incognito = False

        Chrome.__NO_OF_WINDOWS += 1

    def navigate(self, new_page = "Home"): # instance method
        self.current_page = new_page
        if new_page != "Home" and not self.is_incognito:
            self.history.append(new_page)

    def clear_history(self):    # instance method
        self.history[ : -1] = []

    @classmethod
    def with_incognito(cls, new_page):  # factory method for incognito window
        instance = cls(new_page)
        instance.is_incognito = True
        instance.history = []

        return instance

    @classmethod
    def add_extension(cls, extension): # class method
        cls.extensions.append(extension)

    def get_extensions(self):
        return self.extensions;

    

if __name__ == "__main__":
    pass    

# Your code here
class Cat:
    def __init__(self, mass, lifespan, speed):
        self.mass_in_kg = mass
        self.lifespan_in_years = lifespan
        self.speed_in_kph = speed

    def vocalize(self):
        print("Chuff")

    def print_facts(self):
        print(f"The {type(self).__name__.lower()} weighs {self.mass_in_kg}kg, has a lifespan of {self.lifespan_in_years} years and can run at a maximum speed of {self.speed_in_kph}kph.")

    def __str__(self):
        return f"The {type(self).__name__.lower()} weighs {self.mass_in_kg}kg, has a lifespan of {self.lifespan_in_years} years and can run at a maximum speed of {self.speed_in_kph}kph."

    def __del__(self):
        print("No animals were harmed in the deletion of this instance")
        

class Cheetah(Cat):
    def __init__(self, mass, lifespan, speed):
        super().__init__(mass, lifespan, speed)
        self.spotted_coat = True

    def vocalize(self):
        print("Chirrup")

class Lion(Cat):
    def __init__(self, mass = 190, lifespan = 14, speed = 80):
        super()._init__(mass, lifespan, speed)
        self.is_social = True
    
    def vocalize(self):
        print("ROAR")

class Leopard(Cat):
    def vocalize(self):
        print("Roar")


class Tiger(Cat):
    def __init__(self, mass = 310, lifespan = 26, speed = 65):
        super().__init__(mass, lifespan, speed)
        self.coat_pattern = "striped"

    def swim(self):
        print("Splash splash")

    def vocalize(self):
        print("Roar")


    def __str__(self):
        return super().__str__() + f" It also has a {self.coat_pattern} coat."


class Liger(Lion, Tiger):
    pass
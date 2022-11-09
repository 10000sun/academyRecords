class Car:
    speed = 0
    def upSpeed(self, value):
        self.speed = self.speed+value
        print("현재 속도(슈퍼클래스) : ", self.speed)

class Sedan(Car):
    def upSpeed(self, value):
        self.speed = self.speed+value

        if self.speed > 150:
            self.speed = 150
        print("현재 속도(서브클래스) : ", self.speed)

class Truck(Car):
    def curSpeed(self, value):
        self.speed += value

        if self.speed > 150:
            self.speed = 150
        print("현재 속도(서브클래스) : ", self.speed)

class Sonata(Sedan):
    pass

sedan1, truck1, sonata1= None, None, None

sedan1=Sedan()
truck1=Truck()
sonata1=Sonata()

print("트럭 ==>", end="")
truck1.upSpeed(200)

print("승용차 ==>", end="")
sedan1.upSpeed(200)

print("소나타 ==>", end="")
sonata1.upSpeed(200)
